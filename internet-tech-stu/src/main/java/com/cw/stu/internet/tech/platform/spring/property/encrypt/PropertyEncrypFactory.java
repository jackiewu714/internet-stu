package com.cw.stu.internet.tech.platform.spring.property.encrypt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Steven
 */
public final class PropertyEncrypFactory implements FactoryBean {

    private static final Log log = LogFactory.getLog(PropertyEncrypFactory.class);

    private String encryptedProperty;

    public Object getObject() throws Exception {
        if (encryptedProperty == null || encryptedProperty.equals("")) {
            log.error("argument[encryptedProperty] is empty. please check your configuration for jdbc.");
            return null;
        }

        String property = null;
        try {
            property = EncryptWorker.getDecodeString(encryptedProperty.substring(5));
        } catch (Exception e) {
            log.error("error when decrypted property, please check your configuration for jdbc");
            return null;
        }

        return property;
    }

    @SuppressWarnings("unchecked")
    public Class getObjectType() {
        return String.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public void setEncryptedProperty(String encryptedProperty) {
        this.encryptedProperty = encryptedProperty;
    }

}
