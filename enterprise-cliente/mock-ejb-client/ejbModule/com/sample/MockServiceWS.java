
package com.sample;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MockServiceWS", targetNamespace = "http://sample.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MockServiceWS {


    /**
     * 
     * @param vector
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "meanOperation", targetNamespace = "http://sample.com", className = "com.sample.MeanOperation")
    @ResponseWrapper(localName = "meanOperationResponse", targetNamespace = "http://sample.com", className = "com.sample.MeanOperationResponse")
    public double meanOperation(
        @WebParam(name = "vector", targetNamespace = "")
        List<Double> vector);

    /**
     * 
     * @param vector
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sd", targetNamespace = "http://sample.com", className = "com.sample.Sd")
    @ResponseWrapper(localName = "sdResponse", targetNamespace = "http://sample.com", className = "com.sample.SdResponse")
    public double sd(
        @WebParam(name = "vector", targetNamespace = "")
        List<Double> vector);

}
