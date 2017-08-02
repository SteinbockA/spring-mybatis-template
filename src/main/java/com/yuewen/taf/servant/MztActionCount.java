package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class MztActionCount {

	@JceStructProperty(order = 0, isRequire = true)
	public long conditionId = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public int type = 0;
	@JceStructProperty(order = 2, isRequire = true)
	public int amount = 0;
	@JceStructProperty(order = 3, isRequire = true)
	public long userId = 0L;
	@JceStructProperty(order = 4, isRequire = true)
	public long createDate = 0L;
	@JceStructProperty(order = 5, isRequire = true)
	public long updateDate = 0L;

	public long getConditionId() {
		return conditionId;
	}

	public void setConditionId(long conditionId) {
		this.conditionId = conditionId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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

	public long getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(long updateDate) {
		this.updateDate = updateDate;
	}

	public MztActionCount() {
	}

	public MztActionCount(long conditionId, int type, int amount, long userId, long createDate, long updateDate) {
		this.conditionId = conditionId;
		this.type = type;
		this.amount = amount;
		this.userId = userId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MztActionCount)) {
			return false;
		}
		MztActionCount other = (MztActionCount) obj;
		return (
			JceUtil.equals(conditionId, other.conditionId) &&
			JceUtil.equals(type, other.type) &&
			JceUtil.equals(amount, other.amount) &&
			JceUtil.equals(userId, other.userId) &&
			JceUtil.equals(createDate, other.createDate) &&
			JceUtil.equals(updateDate, other.updateDate) 
		);
	}
}
