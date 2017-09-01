package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * 起点作品对应关系结构体
 *
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class BookMapping {

	@JceStructProperty(order = 0, isRequire = true)
	public long cbid = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long qdbid = 0L;

	public long getCbid() {
		return cbid;
	}

	public void setCbid(long cbid) {
		this.cbid = cbid;
	}

	public long getQdbid() {
		return qdbid;
	}

	public void setQdbid(long qdbid) {
		this.qdbid = qdbid;
	}

	public BookMapping() {
	}

	public BookMapping(long cbid, long qdbid) {
		this.cbid = cbid;
		this.qdbid = qdbid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BookMapping)) {
			return false;
		}
		BookMapping other = (BookMapping) obj;
		return (
			JceUtil.equals(cbid, other.cbid) &&
			JceUtil.equals(qdbid, other.qdbid) 
		);
	}
}
