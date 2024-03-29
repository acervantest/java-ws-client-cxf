package com.template;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2016-12-23T22:03:07.453-08:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://template.com/", name = "BankAccount")
@XmlSeeAlso({ObjectFactory.class})
public interface BankAccount {

    @WebMethod
    @RequestWrapper(localName = "newApplication", targetNamespace = "http://template.com/", className = "com.template.NewApplication")
    @ResponseWrapper(localName = "newApplicationResponse", targetNamespace = "http://template.com/", className = "com.template.NewApplicationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.template.CreditCardInformation newApplication(
        @WebParam(name = "arg0", targetNamespace = "")
        com.template.CreditCardApplication arg0
    );
}
