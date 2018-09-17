
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
 *         &lt;element name="inClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inAuditXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inAuditResultXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SolveResen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inClaimID",
    "inFlag",
    "inAuditXml",
    "inAuditResultXml",
    "warnID",
    "solveResen",
    "ip"
})
@XmlRootElement(name = "SavekfWarnEnforced_new")
public class SavekfWarnEnforcedNew {

    protected String inClaimID;
    protected String inFlag;
    protected String inAuditXml;
    protected String inAuditResultXml;
    @XmlElement(name = "WarnID")
    protected String warnID;
    @XmlElement(name = "SolveResen")
    protected String solveResen;
    @XmlElement(name = "IP")
    protected String ip;

    /**
     * Gets the value of the inClaimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClaimID() {
        return inClaimID;
    }

    /**
     * Sets the value of the inClaimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClaimID(String value) {
        this.inClaimID = value;
    }

    /**
     * Gets the value of the inFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFlag() {
        return inFlag;
    }

    /**
     * Sets the value of the inFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFlag(String value) {
        this.inFlag = value;
    }

    /**
     * Gets the value of the inAuditXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuditXml() {
        return inAuditXml;
    }

    /**
     * Sets the value of the inAuditXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuditXml(String value) {
        this.inAuditXml = value;
    }

    /**
     * Gets the value of the inAuditResultXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuditResultXml() {
        return inAuditResultXml;
    }

    /**
     * Sets the value of the inAuditResultXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuditResultXml(String value) {
        this.inAuditResultXml = value;
    }

    /**
     * Gets the value of the warnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnID() {
        return warnID;
    }

    /**
     * Sets the value of the warnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnID(String value) {
        this.warnID = value;
    }

    /**
     * Gets the value of the solveResen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolveResen() {
        return solveResen;
    }

    /**
     * Sets the value of the solveResen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolveResen(String value) {
        this.solveResen = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

}
