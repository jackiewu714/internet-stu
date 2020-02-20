package com.cw.stu.internet.tech.platform.util;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.json.JsonXMLOutputFactory;
import de.odysseus.staxon.xml.util.PrettyXMLEventWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author WuLiangzhi  2020/02/20 12:09
 */
public class StaxonUtil {

    private static final Logger s_logger = LoggerFactory.getLogger(StaxonUtil.class);

    /**
     * json string convert to xml string
     *
     * @param json String
     * @return String
     */
    public static String json2Xml(String json) {
        StringReader input = new StringReader(json);
        StringWriter output = new StringWriter();
        JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();

        XMLEventReader reader = null;
        XMLEventWriter writer = null;
        try {
            reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
            writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
            writer = new PrettyXMLEventWriter(writer);
            writer.add(reader);
        } catch (Exception e) {
            s_logger.error("JSON转换为XML异常，原因：", e);
        } finally {
            close(input, output, reader, writer);
        }
        //remove <?xml version="1.0" encoding="UTF-8"?>
        if (output.toString().length() >= 38) {
            return output.toString().substring(39);
        }
        return output.toString();
    }

    /**
     * xml string convert to json string
     *
     * @param xml String
     * @return String
     */
    public static String xml2Json(String xml) {
        StringReader input = new StringReader(xml);
        StringWriter output = new StringWriter();
        JsonXMLConfig config = new JsonXMLConfigBuilder().autoArray(true).autoPrimitive(true).prettyPrint(true).build();

        XMLEventReader reader = null;
        XMLEventWriter writer = null;
        try {
            reader = XMLInputFactory.newInstance().createXMLEventReader(input);
            writer = new JsonXMLOutputFactory(config).createXMLEventWriter(output);
            writer.add(reader);
        } catch (Exception e) {
            s_logger.error("XML转换为JSON异常，原因：", e);
        } finally {
            close(input, output, reader, writer);
        }
        return output.toString();
    }

    private static void close(StringReader input,
                              StringWriter output,
                              XMLEventReader xmlReader,
                              XMLEventWriter xmlWriter){
        try {
            if(input != null) {
                input.close();
            }
            if(output != null) {
                output.close();
            }
        } catch (IOException e) {
            s_logger.error(e.getMessage(), e);
        }

        try {
            if(xmlReader != null) {
                xmlReader.close();
            }
        } catch (XMLStreamException e) {
            s_logger.error(e.getMessage(), e);
        }

        try {
            if(xmlWriter != null) {
                xmlWriter.close();
            }
        } catch (XMLStreamException e) {
            s_logger.error(e.getMessage(), e);
        }

    }

}
