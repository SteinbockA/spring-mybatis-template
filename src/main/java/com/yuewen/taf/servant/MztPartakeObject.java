package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class MztPartakeObject {

	@JceStructProperty(order = 0, isRequire = true)
	public long conditionId = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long partakeObjectId = 0L;
	@JceStructProperty(order = 2, isRequire = true)
	public long userId = 0L;
	@JceStructProperty(order = 3, isRequire = true)
	public String objectValue = "";
	@JceStructProperty(order = 4, isRequire = true)
	public long createDate = 0L;

	public long getConditionId() {
		return conditionId;
	}

	public void setConditionId(long conditionId) {
		this.conditionId = conditionId;
	}

	public long getPartakeObjectId() {
		return partakeObjectId;
	}

	public void setPartakeObjectId(long partakeObjectId) {
		this.partakeObjectId = partakeObjectId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getObjectValue() {
		return objectValue;
	}

	public void setObjectValue(String objectValue) {
		this.objectValue = objectValue;
	}

	public long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

	public MztPartakeObject() {
	}

	public MztPartakeObject(long conditionId, long partakeObjectId, long userId, String objectValue, long createDate) {
		this.conditionId = conditionId;
		this.partakeObjectId = partakeObjectId;
		this.userId = userId;
		this.objectValue = objectValue;
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
		if (!(obj instanceof MztPartakeObject)) {
			return false;
		}
		MztPartakeObject other = (MztPartakeObject) obj;
		return (
			JceUtil.equals(conditionId, other.conditionId) &&
			JceUtil.equals(partakeObjectId, other.partakeObjectId) &&
			JceUtil.equals(userId, other.userId) &&
			JceUtil.equals(objectValue, other.objectValue) &&
			JceUtil.equals(createDate, other.createDate) 
		);
	}
}
