
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
 *         &lt;element name="UpDataClaimID_ZZZ_FlagResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "upDataClaimIDZZZFlagResult"
})
@XmlRootElement(name = "UpDataClaimID_ZZZ_FlagResponse")
public class UpDataClaimIDZZZFlagResponse {

    @XmlElement(name = "UpDataClaimID_ZZZ_FlagResult")
    protected String upDataClaimIDZZZFlagResult;

    /**
     * Gets the value of the upDataClaimIDZZZFlagResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDataClaimIDZZZFlagResult() {
        return upDataClaimIDZZZFlagResult;
    }

    /**
     * Sets the value of the upDataClaimIDZZZFlagResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDataClaimIDZZZFlagResult(String value) {
        this.upDataClaimIDZZZFlagResult = value;
    }

}
