package com.dri.common.core.syslog;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * @Description 系统日志
 * @author liyazhou
 * @date 2019年1月2日 下午5:07:52
 */
@Component
public class SysLog implements Serializable{

	private static final long serialVersionUID = 867273329674752556L;

	public static final String SYS_LOG_TYPE_OPR = "OPR";
	public static final String SYS_LOG_TYPE_SYS = "SYS";

	public static final String SYS_CODE = "SYS_CODE";
	public static final String SESSION_KEY_USER = "SESSION_KEY_USER";

	private String id; // 标识
	private String logType; // 日志类型(操作日志OPR/系统日志SYS)
	private String logLevel; // 级别
	private String sysCode; // 系统编码
	private String module; // 模块
	private String method; // 方法
	private String ip; // IP地址
	private String oprType; // 操作类型
	private String oprUser; // 操作用户
	private Long oprDate; // 操作时间
	private Long createDate; // 创建时间
	private String description; // 操作描述
	private String params; // 参数
	private Integer longTime; // 时长
	private String result; // 结果
	
	public SysLog() {
	}

	public SysLog(String id, String logType, long oprDate) {
		this.id = id;
		this.logType = logType;
		this.oprDate = oprDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOprType() {
		return oprType;
	}

	public void setOprType(String oprType) {
		this.oprType = oprType;
	}

	public String getOprUser() {
		return oprUser;
	}

	public void setOprUser(String oprUser) {
		this.oprUser = oprUser;
	}

	public Long getOprDate() {
		return oprDate;
	}

	public void setOprDate(Long oprDate) {
		this.oprDate = oprDate;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Integer getLongTime() {
		return longTime;
	}

	public void setLongTime(Integer longTime) {
		this.longTime = longTime;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "SysLog [id=" + id + ", logType=" + logType + ", logLevel=" + logLevel + ", sysCode=" + sysCode
				+ ", module=" + module + ", method=" + method + ", ip=" + ip + ", oprType=" + oprType + ", oprUser="
				+ oprUser + ", oprDate=" + oprDate + ", createDate=" + createDate + ", description=" + description
				+ ", params=" + params + ", longTime=" + longTime + ", result=" + result + "]";
	}
}