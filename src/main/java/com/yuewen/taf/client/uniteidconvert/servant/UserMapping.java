package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * 起点用户对应关系结构体
 *
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class UserMapping {

	@JceStructProperty(order = 0, isRequire = true)
	public long guid = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long qduid = 0L;

	public long getGuid() {
		return guid;
	}

	public void setGuid(long guid) {
		this.guid = guid;
	}

	public long getQduid() {
		return qduid;
	}

	public void setQduid(long qduid) {
		this.qduid = qduid;
	}

	public UserMapping() {
	}

	public UserMapping(long guid, long qduid) {
		this.guid = guid;
		this.qduid = qduid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UserMapping)) {
			return false;
		}
		UserMapping other = (UserMapping) obj;
		return (
			JceUtil.equals(guid, other.guid) &&
			JceUtil.equals(qduid, other.qduid) 
		);
	}
}
