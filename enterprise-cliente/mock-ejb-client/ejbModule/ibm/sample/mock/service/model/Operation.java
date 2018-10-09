package ibm.sample.mock.service.model;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	
	double[] vector = null;
	String operationType = null;
	
	public Operation() {
		// TODO Auto-generated constructor stub
	}
	
	public Operation(double[] vector, String type) {
		this.setOperationType(type);
		this.setVector(vector);
	}
	
	public double[] getVector() {
		return vector;
	}
	public void setVector(double[] vector) {
		this.vector = vector;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	
	public List<Double> getVectorAsList() {
		List<Double> list = new ArrayList<Double>();
		
		for (double item : vector) {
			list.add(item);
		}
		
		return list;
	}

	
	
	
}
