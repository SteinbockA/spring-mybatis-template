package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class CommonOutParam {

	@JceStructProperty(order = 0, isRequire = true)
	public int code = 0;
	@JceStructProperty(order = 1, isRequire = true)
	public String message = "";
	@JceStructProperty(order = 2, isRequire = true)
	public long conditionId = 0L;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getConditionId() {
		return conditionId;
	}

	public void setConditionId(long conditionId) {
		this.conditionId = conditionId;
	}

	public CommonOutParam() {
	}

	public CommonOutParam(int code, String message, long conditionId) {
		this.code = code;
		this.message = message;
		this.conditionId = conditionId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CommonOutParam)) {
			return false;
		}
		CommonOutParam other = (CommonOutParam) obj;
		return (
			JceUtil.equals(code, other.code) &&
			JceUtil.equals(message, other.message) &&
			JceUtil.equals(conditionId, other.conditionId) 
		);
	}
}
