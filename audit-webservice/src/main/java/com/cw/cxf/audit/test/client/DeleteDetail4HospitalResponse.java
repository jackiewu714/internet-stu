
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
 *         &lt;element name="DeleteDetail4HospitalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "deleteDetail4HospitalResult"
})
@XmlRootElement(name = "DeleteDetail4HospitalResponse")
public class DeleteDetail4HospitalResponse {

    @XmlElement(name = "DeleteDetail4HospitalResult")
    protected String deleteDetail4HospitalResult;

    /**
     * Gets the value of the deleteDetail4HospitalResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteDetail4HospitalResult() {
        return deleteDetail4HospitalResult;
    }

    /**
     * Sets the value of the deleteDetail4HospitalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteDetail4HospitalResult(String value) {
        this.deleteDetail4HospitalResult = value;
    }

}
