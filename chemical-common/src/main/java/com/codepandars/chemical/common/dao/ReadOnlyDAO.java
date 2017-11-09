package com.codepandars.chemical.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ReadOnlyDAO extends SqlMapClientDaoSupport {

	@Autowired
    @Qualifier("readOnlySqlMapClient")
    public void setSqlMapClientForAutowired(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }
	
}
