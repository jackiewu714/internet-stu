package com.cw.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;

import com.cw.solr.util.TestCoreSolrServer;

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
