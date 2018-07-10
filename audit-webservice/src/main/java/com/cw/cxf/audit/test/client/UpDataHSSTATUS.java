
package com.cw.cxf.audit.test.client;

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
 *         &lt;element name="inHS_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inHSSTATUS"
})
@XmlRootElement(name = "UpDataHS_STATUS")
public class UpDataHSSTATUS {

    protected String inClaimID;
    @XmlElement(name = "inHS_STATUS")
    protected String inHSSTATUS;

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
     * Gets the value of the inHSSTATUS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHSSTATUS() {
        return inHSSTATUS;
    }

    /**
     * Sets the value of the inHSSTATUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHSSTATUS(String value) {
        this.inHSSTATUS = value;
    }

}
