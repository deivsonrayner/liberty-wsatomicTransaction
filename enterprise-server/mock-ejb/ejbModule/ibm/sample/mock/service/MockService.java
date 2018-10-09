package ibm.sample.mock.service;

import ibm.sample.mock.view.MockServiceLocal;
import ibm.sample.mock.view.MockServiceRemote;

import java.math.BigDecimal;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Session Bean implementation class MockService
 */
@WebService(targetNamespace="http://sample.com", name="MockServiceWS", serviceName="MockServiceWS")
@Stateless
@Local(MockServiceLocal.class)
@Remote(MockServiceRemote.class)
@TransactionManagement(value=TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.REQUIRED)
public class MockService implements MockServiceRemote {

    /**
     * Default constructor. 
     */
    public MockService() {
      
    }
    
    
    
    @WebMethod
	@Override
	public double meanOperation( @WebParam(name = "vector") double[] vector) {
		double sum = 0;
		for (double number : vector) {
			sum = sum + number;
		}
		
		return sum / vector.length;
	}

    @WebMethod
	@Override
	public double sd(@WebParam(name = "vector") double[] vector) {
    	double mean = this.meanOperation(vector);
		
    	double sum = 0;
		for (double number : vector) {
			sum = sum + (Math.pow((mean - number), 2));
		}
		return Math.sqrt(sum / vector.length);
		
	}

}
