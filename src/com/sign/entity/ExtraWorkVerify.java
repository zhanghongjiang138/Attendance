package com.sign.entity;

import java.util.Date;

public class ExtraWorkVerify {

	private Integer extraWorkVerifyId;
	private Integer employeeId;
	private Integer leaderId;
	private Integer applyReason;
	private Date applyTime;
	private Integer status;
	private Integer extraWorkId;
	public Integer getExtraWorkVerifyId() {
		return extraWorkVerifyId;
	}
	public void setExtraWorkVerifyId(Integer extraWorkVerifyId) {
		this.extraWorkVerifyId = extraWorkVerifyId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getLeaderId() {
		return leaderId;
	}
	public void setLeaderId(Integer leaderId) {
		this.leaderId = leaderId;
	}
	public Integer getApplyReason() {
		return applyReason;
	}
	public void setApplyReason(Integer applyReason) {
		this.applyReason = applyReason;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getExtraWorkId() {
		return extraWorkId;
	}
	public void setExtraWorkId(Integer extraWorkId) {
		this.extraWorkId = extraWorkId;
	}
	
}
