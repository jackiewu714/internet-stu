
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
 *         &lt;element name="AddPutOnRecord4HospitalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "addPutOnRecord4HospitalResult"
})
@XmlRootElement(name = "AddPutOnRecord4HospitalResponse")
public class AddPutOnRecord4HospitalResponse {

    @XmlElement(name = "AddPutOnRecord4HospitalResult")
    protected String addPutOnRecord4HospitalResult;

    /**
     * Gets the value of the addPutOnRecord4HospitalResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddPutOnRecord4HospitalResult() {
        return addPutOnRecord4HospitalResult;
    }

    /**
     * Sets the value of the addPutOnRecord4HospitalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddPutOnRecord4HospitalResult(String value) {
        this.addPutOnRecord4HospitalResult = value;
    }

}
