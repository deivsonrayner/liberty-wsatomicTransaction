package ibm.sample.mock.view;

import ibm.sample.mock.service.model.InvalidOperationException;
import ibm.sample.mock.service.model.Operation;
import ibm.sample.mock.service.model.OperationResult;

public interface MockServiceClientRemote{
	
    public OperationResult callOperation(Operation operation) throws InvalidOperationException;

}
