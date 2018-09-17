
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
 *         &lt;element name="AddPutOnRecord4Hospital_N1Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "addPutOnRecord4HospitalN1Result"
})
@XmlRootElement(name = "AddPutOnRecord4Hospital_N1Response")
public class AddPutOnRecord4HospitalN1Response {

    @XmlElement(name = "AddPutOnRecord4Hospital_N1Result")
    protected String addPutOnRecord4HospitalN1Result;

    /**
     * Gets the value of the addPutOnRecord4HospitalN1Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddPutOnRecord4HospitalN1Result() {
        return addPutOnRecord4HospitalN1Result;
    }

    /**
     * Sets the value of the addPutOnRecord4HospitalN1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddPutOnRecord4HospitalN1Result(String value) {
        this.addPutOnRecord4HospitalN1Result = value;
    }

}
