
package com.template;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.template package. 
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

    private final static QName _NewApplicationResponse_QNAME = new QName("http://template.com/", "newApplicationResponse");
    private final static QName _NewApplication_QNAME = new QName("http://template.com/", "newApplication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.template
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewApplicationResponse }
     * 
     */
    public NewApplicationResponse createNewApplicationResponse() {
        return new NewApplicationResponse();
    }

    /**
     * Create an instance of {@link NewApplication }
     * 
     */
    public NewApplication createNewApplication() {
        return new NewApplication();
    }

    /**
     * Create an instance of {@link CreditCardApplication }
     * 
     */
    public CreditCardApplication createCreditCardApplication() {
        return new CreditCardApplication();
    }

    /**
     * Create an instance of {@link CreditCardInformation }
     * 
     */
    public CreditCardInformation createCreditCardInformation() {
        return new CreditCardInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://template.com/", name = "newApplicationResponse")
    public JAXBElement<NewApplicationResponse> createNewApplicationResponse(NewApplicationResponse value) {
        return new JAXBElement<NewApplicationResponse>(_NewApplicationResponse_QNAME, NewApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://template.com/", name = "newApplication")
    public JAXBElement<NewApplication> createNewApplication(NewApplication value) {
        return new JAXBElement<NewApplication>(_NewApplication_QNAME, NewApplication.class, null, value);
    }

}
