package com.dri.job.web;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dri.common.core.syslog.SysLog;
import com.dri.job.service.SysLogService;

/**
 * @Description 系统日志
 * @author liyazhou
 * @date 2019年1月4日 上午9:48:52
 */
@RestController
@RequestMapping("sysLog")
public class SysLogController{

	@Autowired
	private SysLogService sysLogService;
	
	@GetMapping("page")
	public String add() {
		SysLog sysLog=new SysLog();
		sysLog.setId(UUID.randomUUID().toString());
		sysLog.setDescription("测试");
		sysLog.setIp("127");
		sysLogService.saveUser(sysLog);
		System.out.println("success");
		return "success";
	}
}