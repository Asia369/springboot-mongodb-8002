package com.dri.job.dao;

import com.dri.common.core.syslog.SysLog;

public interface SysLogDao {

	public void saveUser(SysLog sysLog);
	
	public SysLog findUserByUserName(String userName);
	
	public void updateUser(SysLog sysLog);
	
	 public void deleteUserById(Long id);
}
