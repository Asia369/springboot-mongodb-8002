package com.dri.job.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dri.common.core.syslog.SysLog;
import com.dri.job.dao.SysLogDao;
import com.dri.job.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	private SysLogDao sysLogDao;
	
	@Override
	public void saveUser(SysLog sysLog) {
		sysLogDao.saveUser(sysLog);
	}

}
