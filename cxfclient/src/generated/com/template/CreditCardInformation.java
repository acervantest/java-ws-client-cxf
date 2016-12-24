
package com.template;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCardInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCardInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="holderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holderLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="secCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardInformation", propOrder = {
    "holderName",
    "holderLast",
    "cardNum",
    "secCode",
    "issue"
})
public class CreditCardInformation {

    protected String holderName;
    protected String holderLast;
    protected Long cardNum;
    protected int secCode;
    protected String issue;

    /**
     * Gets the value of the holderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderName(String value) {
        this.holderName = value;
    }

    /**
     * Gets the value of the holderLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderLast() {
        return holderLast;
    }

    /**
     * Sets the value of the holderLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderLast(String value) {
        this.holderLast = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardNum(Long value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the secCode property.
     * 
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * Sets the value of the secCode property.
     * 
     */
    public void setSecCode(int value) {
        this.secCode = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

}
