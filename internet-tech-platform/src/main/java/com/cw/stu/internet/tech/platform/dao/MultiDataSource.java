package com.cw.stu.internet.tech.platform.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultiDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceSwitcher.getDataSourceKey();
	}

}
