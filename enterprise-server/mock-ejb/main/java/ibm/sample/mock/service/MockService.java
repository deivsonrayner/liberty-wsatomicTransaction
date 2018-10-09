package ibm.sample.mock.service;

import ibm.sample.mock.service.view.MockServiceLocal;
import ibm.sample.mock.service.view.MockServiceRemote;

import java.math.BigDecimal;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MockService
 */
@Stateless
@Local(MockServiceLocal.class)
@Remote(MockServiceRemote.class)
public class MockService implements MockServiceRemote, MockServiceLocal {

    /**
     * Default constructor. 
     */
    public MockService() {
      
    }
    
    
	@Override
	public BigDecimal meanOperation(BigDecimal[] vector) {
		
		BigDecimal sum = new BigDecimal(0);
		for (BigDecimal number : vector) {
			sum = sum.add(number);
		}
		
		return sum.divide(BigDecimal.valueOf(vector.length));
	}

	@Override
	public BigDecimal sd(BigDecimal[] vector) {
		BigDecimal mean = this.meanOperation(vector);
		
		BigDecimal sum = new BigDecimal(0);
		for (BigDecimal number : vector) {
			sum = sum.add(number.subtract(mean).pow(2));
		}
		
		return new BigDecimal(Math.sqrt(sum.divide(BigDecimal.valueOf(vector.length)).doubleValue()));
		
	}

}
