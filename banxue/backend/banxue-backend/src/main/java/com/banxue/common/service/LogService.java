package com.banxue.common.service;

import org.springframework.stereotype.Service;

import com.banxue.common.domain.LogDO;
import com.banxue.common.domain.PageDO;
import com.banxue.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
