
package com.sample;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MockServiceWS", targetNamespace = "http://sample.com", wsdlLocation = "META-INF/wsdl/MockServiceWS.wsdl")
public class MockServiceWS_Service
    extends Service
{

    private final static URL MOCKSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException MOCKSERVICEWS_EXCEPTION;
    private final static QName MOCKSERVICEWS_QNAME = new QName("http://sample.com", "MockServiceWS");

    static {
        MOCKSERVICEWS_WSDL_LOCATION = com.sample.MockServiceWS_Service.class.getClassLoader().getResource("META-INF/wsdl/MockServiceWS.wsdl");
        WebServiceException e = null;
        if (MOCKSERVICEWS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/MockServiceWS.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        MOCKSERVICEWS_EXCEPTION = e;
    }

    public MockServiceWS_Service() {
        super(__getWsdlLocation(), MOCKSERVICEWS_QNAME);
    }

    public MockServiceWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOCKSERVICEWS_QNAME, features);
    }

    public MockServiceWS_Service(URL wsdlLocation) {
        super(wsdlLocation, MOCKSERVICEWS_QNAME);
    }

    public MockServiceWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOCKSERVICEWS_QNAME, features);
    }

    public MockServiceWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MockServiceWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MockServiceWS
     */
    @WebEndpoint(name = "MockServiceWSPort")
    public MockServiceWS getMockServiceWSPort() {
        return super.getPort(new QName("http://sample.com", "MockServiceWSPort"), MockServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MockServiceWS
     */
    @WebEndpoint(name = "MockServiceWSPort")
    public MockServiceWS getMockServiceWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sample.com", "MockServiceWSPort"), MockServiceWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOCKSERVICEWS_EXCEPTION!= null) {
            throw MOCKSERVICEWS_EXCEPTION;
        }
        return MOCKSERVICEWS_WSDL_LOCATION;
    }

}
