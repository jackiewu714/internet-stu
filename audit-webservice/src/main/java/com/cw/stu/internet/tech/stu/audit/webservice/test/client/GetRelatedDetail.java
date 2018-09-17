
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
 *         &lt;element name="inPatientIDStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inRuleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inRelatedString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inPatientIDStr",
    "inClaimID",
    "inRuleCode",
    "inRelatedString"
})
@XmlRootElement(name = "GetRelatedDetail")
public class GetRelatedDetail {

    protected String inPatientIDStr;
    protected String inClaimID;
    protected String inRuleCode;
    protected String inRelatedString;

    /**
     * Gets the value of the inPatientIDStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatientIDStr() {
        return inPatientIDStr;
    }

    /**
     * Sets the value of the inPatientIDStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatientIDStr(String value) {
        this.inPatientIDStr = value;
    }

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
     * Gets the value of the inRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRuleCode() {
        return inRuleCode;
    }

    /**
     * Sets the value of the inRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRuleCode(String value) {
        this.inRuleCode = value;
    }

    /**
     * Gets the value of the inRelatedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRelatedString() {
        return inRelatedString;
    }

    /**
     * Sets the value of the inRelatedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRelatedString(String value) {
        this.inRelatedString = value;
    }

}
