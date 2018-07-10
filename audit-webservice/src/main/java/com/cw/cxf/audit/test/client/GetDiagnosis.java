
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
 *         &lt;element name="inHospitalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inStd_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inRule_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inHospitalID",
    "inStdCode",
    "inRuleCode"
})
@XmlRootElement(name = "GetDiagnosis")
public class GetDiagnosis {

    protected String inHospitalID;
    @XmlElement(name = "inStd_Code")
    protected String inStdCode;
    @XmlElement(name = "inRule_Code")
    protected String inRuleCode;

    /**
     * Gets the value of the inHospitalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHospitalID() {
        return inHospitalID;
    }

    /**
     * Sets the value of the inHospitalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHospitalID(String value) {
        this.inHospitalID = value;
    }

    /**
     * Gets the value of the inStdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStdCode() {
        return inStdCode;
    }

    /**
     * Sets the value of the inStdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStdCode(String value) {
        this.inStdCode = value;
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

}
