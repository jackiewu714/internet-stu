
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
 *         &lt;element name="ClaimAudit4HospitalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "claimAudit4HospitalResult"
})
@XmlRootElement(name = "ClaimAudit4HospitalResponse")
public class ClaimAudit4HospitalResponse {

    @XmlElement(name = "ClaimAudit4HospitalResult")
    protected String claimAudit4HospitalResult;

    /**
     * Gets the value of the claimAudit4HospitalResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimAudit4HospitalResult() {
        return claimAudit4HospitalResult;
    }

    /**
     * Sets the value of the claimAudit4HospitalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimAudit4HospitalResult(String value) {
        this.claimAudit4HospitalResult = value;
    }

}
