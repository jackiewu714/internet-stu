
package com.cw.stu.internet.tech.stu.audit.webservice.test.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inDetailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inZZZ_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inClaimID",
    "inDetailID",
    "inZZZFlag"
})
@XmlRootElement(name = "UpDataDetail_ZZZ_Flag")
public class UpDataDetailZZZFlag {

    protected String inClaimID;
    protected String inDetailID;
    @XmlElement(name = "inZZZ_Flag")
    protected String inZZZFlag;

    /**
     * Gets the value of the inClaimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClaimID() {
        return inClaimID;
    }

    /**
     * Sets the value of the inClaimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClaimID(String value) {
        this.inClaimID = value;
    }

    /**
     * Gets the value of the inDetailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDetailID() {
        return inDetailID;
    }

    /**
     * Sets the value of the inDetailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDetailID(String value) {
        this.inDetailID = value;
    }

    /**
     * Gets the value of the inZZZFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInZZZFlag() {
        return inZZZFlag;
    }

    /**
     * Sets the value of the inZZZFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInZZZFlag(String value) {
        this.inZZZFlag = value;
    }

}
