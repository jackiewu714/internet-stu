package com.codegen.platform.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultiDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceSwitcher.getDataSourceKey();
	}

}
