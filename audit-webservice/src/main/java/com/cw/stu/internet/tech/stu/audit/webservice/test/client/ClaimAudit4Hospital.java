
package com.cw.stu.internet.tech.stu.audit.webservice.test.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="inClaimInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inHasUpdate4Claim" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "inClaimInfo",
    "inHasUpdate4Claim"
})
@XmlRootElement(name = "ClaimAudit4Hospital")
public class ClaimAudit4Hospital {

    protected String inClaimInfo;
    protected boolean inHasUpdate4Claim;

    /**
     * Gets the value of the inClaimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClaimInfo() {
        return inClaimInfo;
    }

    /**
     * Sets the value of the inClaimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClaimInfo(String value) {
        this.inClaimInfo = value;
    }

    /**
     * Gets the value of the inHasUpdate4Claim property.
     * 
     */
    public boolean isInHasUpdate4Claim() {
        return inHasUpdate4Claim;
    }

    /**
     * Sets the value of the inHasUpdate4Claim property.
     * 
     */
    public void setInHasUpdate4Claim(boolean value) {
        this.inHasUpdate4Claim = value;
    }

}
