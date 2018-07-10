
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
 *         &lt;element name="SavekfWarnEnforced_newResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "savekfWarnEnforcedNewResult"
})
@XmlRootElement(name = "SavekfWarnEnforced_newResponse")
public class SavekfWarnEnforcedNewResponse {

    @XmlElement(name = "SavekfWarnEnforced_newResult")
    protected String savekfWarnEnforcedNewResult;

    /**
     * Gets the value of the savekfWarnEnforcedNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavekfWarnEnforcedNewResult() {
        return savekfWarnEnforcedNewResult;
    }

    /**
     * Sets the value of the savekfWarnEnforcedNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavekfWarnEnforcedNewResult(String value) {
        this.savekfWarnEnforcedNewResult = value;
    }

}
