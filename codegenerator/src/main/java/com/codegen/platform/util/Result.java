package com.codegen.platform.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @Client
 * @author zww
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
@XStreamAlias("result")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {

    /**
	 * Serialize number
	 */
    private static long serialVersionUID = -556224389062112638L;

    @XmlElement
    private boolean success;
    @XmlElement
    private boolean error;
    @XmlElement
    private List resultList;
    @XmlElement
    private Map resultMap;
    private Object result;
    @XmlElement
    private String message;
    @XmlElement
    private String resultCode;

    public Result() {
	setSuccess(false);
    }

    public Result(boolean successful, String message) {
	this(successful, message, null);
    }

    public Result(boolean successful, String message, Object result) {
	setSuccess(successful);
	setMessage(message);
	setResult(result);
    }

    public boolean isSuccess() {
	return success;
    }

    public void setSuccess(boolean success) {
	this.success = success;
    }

    public List getResultList() {
	return resultList;
    }

    public void setResultList(List resultList) {
	this.resultList = resultList;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public Object getResult() {
	return result;
    }

    public void setResult(Object result) {
	this.result = result;
    }

    public Map getResultMap() {
	return resultMap;
    }

    public void setResultMap(Map resultMap) {
	this.resultMap = resultMap;
    }

    @Override
    public String toString() {
	XStream xstream = new XStream();
	xstream.processAnnotations(this.getClass());
	return xstream.toXML(this);
    }

    public String getResultCode() {
	return resultCode;
    }

    public void setResultCode(String resultCode) {
	this.resultCode = resultCode;
    }

    public boolean isError() {
	return error;
    }

    public void setError(boolean error) {
	this.error = error;
    }

}