
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
 *         &lt;element name="inPatient_IDStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inPatientIDStr"
})
@XmlRootElement(name = "GetPutOnRecordList")
public class GetPutOnRecordList {

    @XmlElement(name = "inPatient_IDStr")
    protected String inPatientIDStr;

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

}
