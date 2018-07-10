
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
 *         &lt;element name="inType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inPatient_IDStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inApprovalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inStartDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inEndDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inType",
    "inCode",
    "inName",
    "inPatientIDStr",
    "inApprovalNumber",
    "inStartDT",
    "inEndDT"
})
@XmlRootElement(name = "AddPutOnRecord4Hospital")
public class AddPutOnRecord4Hospital {

    protected int inType;
    protected String inCode;
    protected String inName;
    @XmlElement(name = "inPatient_IDStr")
    protected String inPatientIDStr;
    protected String inApprovalNumber;
    protected String inStartDT;
    protected String inEndDT;

    /**
     * Gets the value of the inType property.
     * 
     */
    public int getInType() {
        return inType;
    }

    /**
     * Sets the value of the inType property.
     * 
     */
    public void setInType(int value) {
        this.inType = value;
    }

    /**
     * Gets the value of the inCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCode() {
        return inCode;
    }

    /**
     * Sets the value of the inCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCode(String value) {
        this.inCode = value;
    }

    /**
     * Gets the value of the inName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInName() {
        return inName;
    }

    /**
     * Sets the value of the inName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInName(String value) {
        this.inName = value;
    }

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
     * Gets the value of the inApprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInApprovalNumber() {
        return inApprovalNumber;
    }

    /**
     * Sets the value of the inApprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInApprovalNumber(String value) {
        this.inApprovalNumber = value;
    }

    /**
     * Gets the value of the inStartDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStartDT() {
        return inStartDT;
    }

    /**
     * Sets the value of the inStartDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStartDT(String value) {
        this.inStartDT = value;
    }

    /**
     * Gets the value of the inEndDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInEndDT() {
        return inEndDT;
    }

    /**
     * Sets the value of the inEndDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInEndDT(String value) {
        this.inEndDT = value;
    }

}
