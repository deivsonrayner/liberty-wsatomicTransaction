
package com.sample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sample package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MeanOperation_QNAME = new QName("http://sample.com", "meanOperation");
    private final static QName _Sd_QNAME = new QName("http://sample.com", "sd");
    private final static QName _SdResponse_QNAME = new QName("http://sample.com", "sdResponse");
    private final static QName _MeanOperationResponse_QNAME = new QName("http://sample.com", "meanOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sample
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeanOperation }
     * 
     */
    public MeanOperation createMeanOperation() {
        return new MeanOperation();
    }

    /**
     * Create an instance of {@link Sd }
     * 
     */
    public Sd createSd() {
        return new Sd();
    }

    /**
     * Create an instance of {@link SdResponse }
     * 
     */
    public SdResponse createSdResponse() {
        return new SdResponse();
    }

    /**
     * Create an instance of {@link MeanOperationResponse }
     * 
     */
    public MeanOperationResponse createMeanOperationResponse() {
        return new MeanOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeanOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sample.com", name = "meanOperation")
    public JAXBElement<MeanOperation> createMeanOperation(MeanOperation value) {
        return new JAXBElement<MeanOperation>(_MeanOperation_QNAME, MeanOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sample.com", name = "sd")
    public JAXBElement<Sd> createSd(Sd value) {
        return new JAXBElement<Sd>(_Sd_QNAME, Sd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sample.com", name = "sdResponse")
    public JAXBElement<SdResponse> createSdResponse(SdResponse value) {
        return new JAXBElement<SdResponse>(_SdResponse_QNAME, SdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeanOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sample.com", name = "meanOperationResponse")
    public JAXBElement<MeanOperationResponse> createMeanOperationResponse(MeanOperationResponse value) {
        return new JAXBElement<MeanOperationResponse>(_MeanOperationResponse_QNAME, MeanOperationResponse.class, null, value);
    }

}
