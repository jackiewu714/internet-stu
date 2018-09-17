
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
 *         &lt;element name="ClaimAudit4HospitalNewOneResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "claimAudit4HospitalNewOneResult"
})
@XmlRootElement(name = "ClaimAudit4HospitalNewOneResponse")
public class ClaimAudit4HospitalNewOneResponse {

    @XmlElement(name = "ClaimAudit4HospitalNewOneResult")
    protected String claimAudit4HospitalNewOneResult;

    /**
     * Gets the value of the claimAudit4HospitalNewOneResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimAudit4HospitalNewOneResult() {
        return claimAudit4HospitalNewOneResult;
    }

    /**
     * Sets the value of the claimAudit4HospitalNewOneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimAudit4HospitalNewOneResult(String value) {
        this.claimAudit4HospitalNewOneResult = value;
    }

}
