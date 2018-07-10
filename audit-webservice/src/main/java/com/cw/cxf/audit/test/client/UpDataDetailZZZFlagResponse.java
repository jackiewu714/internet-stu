
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
 *         &lt;element name="UpDataDetail_ZZZ_FlagResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "upDataDetailZZZFlagResult"
})
@XmlRootElement(name = "UpDataDetail_ZZZ_FlagResponse")
public class UpDataDetailZZZFlagResponse {

    @XmlElement(name = "UpDataDetail_ZZZ_FlagResult")
    protected String upDataDetailZZZFlagResult;

    /**
     * Gets the value of the upDataDetailZZZFlagResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDataDetailZZZFlagResult() {
        return upDataDetailZZZFlagResult;
    }

    /**
     * Sets the value of the upDataDetailZZZFlagResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDataDetailZZZFlagResult(String value) {
        this.upDataDetailZZZFlagResult = value;
    }

}
