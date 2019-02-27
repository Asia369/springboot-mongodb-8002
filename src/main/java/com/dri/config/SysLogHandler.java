package com.dri.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dri.common.core.syslog.SysLog;
import com.dri.job.dao.SysLogDao;

/**
 * @Description
 * @author liyazhou
 * @date 2019年1月9日 上午10:19:50
 */
@Component
public class SysLogHandler {

	@Autowired
	private SysLogDao sysLogDao;

	public void receiveQueue10(SysLog sysLog) {
		sysLog.setCreateDate(System.currentTimeMillis());
		sysLogDao.saveUser(sysLog);
	}
}
