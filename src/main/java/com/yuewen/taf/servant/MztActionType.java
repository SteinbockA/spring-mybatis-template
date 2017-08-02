package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class MztActionType {

	@JceStructProperty(order = 0, isRequire = true)
	public long conditionId = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public int actionTypeId = 0;
	@JceStructProperty(order = 2, isRequire = true)
	public int actionCount = 0;
	@JceStructProperty(order = 3, isRequire = true)
	public long createDate = 0L;

	public long getConditionId() {
		return conditionId;
	}

	public void setConditionId(long conditionId) {
		this.conditionId = conditionId;
	}

	public int getActionTypeId() {
		return actionTypeId;
	}

	public void setActionTypeId(int actionTypeId) {
		this.actionTypeId = actionTypeId;
	}

	public int getActionCount() {
		return actionCount;
	}

	public void setActionCount(int actionCount) {
		this.actionCount = actionCount;
	}

	public long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

	public MztActionType() {
	}

	public MztActionType(long conditionId, int actionTypeId, int actionCount, long createDate) {
		this.conditionId = conditionId;
		this.actionTypeId = actionTypeId;
		this.actionCount = actionCount;
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
		if (!(obj instanceof MztActionType)) {
			return false;
		}
		MztActionType other = (MztActionType) obj;
		return (
			JceUtil.equals(conditionId, other.conditionId) &&
			JceUtil.equals(actionTypeId, other.actionTypeId) &&
			JceUtil.equals(actionCount, other.actionCount) &&
			JceUtil.equals(createDate, other.createDate) 
		);
	}
}
