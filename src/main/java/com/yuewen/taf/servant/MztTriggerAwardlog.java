package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class MztTriggerAwardlog {

	@JceStructProperty(order = 0, isRequire = true)
	public long logId = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long conditionId = 0L;
	@JceStructProperty(order = 2, isRequire = true)
	public int triggertypeId = 0;
	@JceStructProperty(order = 3, isRequire = true)
	public long userId = 0L;
	@JceStructProperty(order = 4, isRequire = true)
	public long createDate = 0L;

	public long getLogId() {
		return logId;
	}

	public void setLogId(long logId) {
		this.logId = logId;
	}

	public long getConditionId() {
		return conditionId;
	}

	public void setConditionId(long conditionId) {
		this.conditionId = conditionId;
	}

	public int getTriggertypeId() {
		return triggertypeId;
	}

	public void setTriggertypeId(int triggertypeId) {
		this.triggertypeId = triggertypeId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

	public MztTriggerAwardlog() {
	}

	public MztTriggerAwardlog(long logId, long conditionId, int triggertypeId, long userId, long createDate) {
		this.logId = logId;
		this.conditionId = conditionId;
		this.triggertypeId = triggertypeId;
		this.userId = userId;
		this.createDate = createDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MztTriggerAwardlog)) {
			return false;
		}
		MztTriggerAwardlog other = (MztTriggerAwardlog) obj;
		return (
			JceUtil.equals(logId, other.logId) &&
			JceUtil.equals(conditionId, other.conditionId) &&
			JceUtil.equals(triggertypeId, other.triggertypeId) &&
			JceUtil.equals(userId, other.userId) &&
			JceUtil.equals(createDate, other.createDate) 
		);
	}
}
