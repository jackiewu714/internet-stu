/**
 * @Title: SolrClient.java
 * @Package com.cw.solr.util
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Dec 13, 2016 10:31:31 PM
 * @version V1.0
 */

package com.cw.solr.util;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrRequest;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName: SolrClient
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 13, 2016 10:31:31 PM
 *
 */

public class TestCoreSolrServer {
    
    private static final Logger logger = LoggerFactory.getLogger(TestCoreSolrServer.class);
    
    private String baseUrl = "http://localhost:8080/solr/test_core";
    private HttpSolrClient client;
    
    private HttpSolrClient getHttpSolrclient() {
	return new HttpSolrClient(baseUrl);
    }
    
    public void get(String name) throws SolrServerException, IOException {
	HttpSolrClient client = getHttpSolrclient();
	client.setSoTimeout(5000);
	SolrQuery query = new SolrQuery();
//	query.setQuery("*:*"); //查询所有
	query.setQuery(name + "*");
	query.setRows(1000);
	query.setStart(0);
	
	QueryResponse response = client.query(query, SolrRequest.METHOD.POST);
	SolrDocumentList list = response.getResults();
	logger.info("list.getNumFound()={}", list.getNumFound());
	logger.info("list={}", JSON.toJSON(list));
    }

}
