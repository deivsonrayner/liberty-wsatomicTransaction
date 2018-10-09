package ibm.sample.mock.service;

import ibm.sample.mock.service.model.InvalidOperationException;
import ibm.sample.mock.service.model.Operation;
import ibm.sample.mock.service.model.OperationResult;
import ibm.sample.mock.view.MockServiceClientRemote;

import java.util.Collections;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceRef;

import com.sample.MockServiceWS;
import com.sample.MockServiceWS_Service;

/**
 * Session Bean implementation class MockService
 */
@WebService(targetNamespace="http://sample.com", name="MockServiceClientWS", serviceName="MockServiceClientWS")
@Stateless
@Remote(MockServiceClientRemote.class)
@TransactionManagement(value=TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.REQUIRES_NEW)
public class MockServiceClient implements MockServiceClientRemote {

	@WebServiceRef(MockServiceWS_Service.class)
	MockServiceWS mockService;
    /**
     * Default constructor. 
     */
    public MockServiceClient() {
      
    }
    
    @WebMethod
	@Override
    public OperationResult callOperation(@WebParam(name = "operation") Operation operation) throws InvalidOperationException {
    	OperationResult result = new OperationResult();
    	
    	if (operation.getOperationType().equalsIgnoreCase("mean")) {
    		
    		double mean = mockService.meanOperation(operation.getVectorAsList());
    		result.setOperationResult(mean);
    		result.setOperationType("MEAN");
    		result.setReturnCode("OK");
    		return result;
    	} else
    	
    	if (operation.getOperationType().equalsIgnoreCase("sd")) {
    		
    		double sd = mockService.sd(operation.getVectorAsList());
    		result.setOperationResult(sd);
    		result.setOperationType("SD");
    		result.setReturnCode("OK");
    		return result;
    		
    	} else {
    		throw new InvalidOperationException("Operacao do Tipo: "+operation.getOperationType()+ " é invalido.");
    	}
    	
    }

}
