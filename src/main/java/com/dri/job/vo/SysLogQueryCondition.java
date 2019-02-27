package com.dri.job.vo;

import java.util.Date;

import com.dri.common.core.syslog.SysLog;

/**
 * @Description 日志查询条件
 * @author liyazhou
 * @date 2019年1月9日 下午4:05:38
 */
public class SysLogQueryCondition extends SysLog {

	private Date sd;
	private Date ed;
	private Long sdLong;
	private Long edLong;

	public Date getSd() {
		return sd;
	}

	public void setSd(Date sd) {
		this.sd = sd;
	}

	public Date getEd() {
		return ed;
	}

	public void setEd(Date ed) {
		this.ed = ed;
	}

	public Long getSdLong() {
		return sdLong;
	}

	public void setSdLong(Long sdLong) {
		this.sdLong = sdLong;
	}

	public Long getEdLong() {
		return edLong;
	}

	public void setEdLong(Long edLong) {
		this.edLong = edLong;
	}

}
