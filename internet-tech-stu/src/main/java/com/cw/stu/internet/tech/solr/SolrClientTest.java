package com.cw.stu.internet.tech.solr;

import java.io.IOException;

import com.cw.stu.internet.tech.solr.util.TestCoreSolrServer;
import org.apache.solr.client.solrj.SolrServerException;

public class SolrClientTest {

    public static void main(String[] args) {
        TestCoreSolrServer client = new TestCoreSolrServer();
        try {
            client.get("admin");
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
