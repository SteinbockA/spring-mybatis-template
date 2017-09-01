package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * 输出参数通用结构体
 *
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class CommonOutParam {

	@JceStructProperty(order = 0, isRequire = true)
	public int code = 0;
	@JceStructProperty(order = 1, isRequire = true)
	public String message = "";

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

	public CommonOutParam() {
	}

	public CommonOutParam(int code, String message) {
		this.code = code;
		this.message = message;
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
			JceUtil.equals(message, other.message) 
		);
	}
}
