
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
 *         &lt;element name="ClaimSave4HospitalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "claimSave4HospitalResult"
})
@XmlRootElement(name = "ClaimSave4HospitalResponse")
public class ClaimSave4HospitalResponse {

    @XmlElement(name = "ClaimSave4HospitalResult")
    protected String claimSave4HospitalResult;

    /**
     * Gets the value of the claimSave4HospitalResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimSave4HospitalResult() {
        return claimSave4HospitalResult;
    }

    /**
     * Sets the value of the claimSave4HospitalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimSave4HospitalResult(String value) {
        this.claimSave4HospitalResult = value;
    }

}
