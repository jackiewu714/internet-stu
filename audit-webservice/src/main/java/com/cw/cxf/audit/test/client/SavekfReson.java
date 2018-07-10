
package com.cw.cxf.audit.test.client;

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
 *         &lt;element name="inClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inDetailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inBm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inKfyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inBm",
    "inKfyy"
})
@XmlRootElement(name = "SavekfReson")
public class SavekfReson {

    protected String inClaimID;
    protected String inDetailID;
    protected String inBm;
    protected String inKfyy;

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
     * Gets the value of the inBm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBm() {
        return inBm;
    }

    /**
     * Sets the value of the inBm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBm(String value) {
        this.inBm = value;
    }

    /**
     * Gets the value of the inKfyy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInKfyy() {
        return inKfyy;
    }

    /**
     * Sets the value of the inKfyy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInKfyy(String value) {
        this.inKfyy = value;
    }

}
