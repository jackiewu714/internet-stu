
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
 *         &lt;element name="SavekfWarnEnforcedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "savekfWarnEnforcedResult"
})
@XmlRootElement(name = "SavekfWarnEnforcedResponse")
public class SavekfWarnEnforcedResponse {

    @XmlElement(name = "SavekfWarnEnforcedResult")
    protected String savekfWarnEnforcedResult;

    /**
     * Gets the value of the savekfWarnEnforcedResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavekfWarnEnforcedResult() {
        return savekfWarnEnforcedResult;
    }

    /**
     * Sets the value of the savekfWarnEnforcedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavekfWarnEnforcedResult(String value) {
        this.savekfWarnEnforcedResult = value;
    }

}
