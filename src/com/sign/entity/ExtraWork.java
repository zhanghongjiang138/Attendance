package com.sign.entity;

import java.util.Date;

public class ExtraWork {

	private Integer extraWorkId;
	private Date startTime;
	private Date endTime;
	private Integer hours;
	private String description;
	private Integer status;
	private Integer type;
	
	public Integer getExtraWorkId() {
		return extraWorkId;
	}
	public void setExtraWorkId(Integer extraWorkId) {
		this.extraWorkId = extraWorkId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
