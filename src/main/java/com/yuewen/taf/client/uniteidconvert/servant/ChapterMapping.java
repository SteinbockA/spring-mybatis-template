package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * 起点章节对应关系结构体
 *
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class ChapterMapping {

	@JceStructProperty(order = 0, isRequire = true)
	public long cbid = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long ccid = 0L;
	@JceStructProperty(order = 2, isRequire = true)
	public int uuid = 0;
	@JceStructProperty(order = 3, isRequire = true)
	public long qdbid = 0L;
	@JceStructProperty(order = 4, isRequire = true)
	public long qdcid = 0L;

	public long getCbid() {
		return cbid;
	}

	public void setCbid(long cbid) {
		this.cbid = cbid;
	}

	public long getCcid() {
		return ccid;
	}

	public void setCcid(long ccid) {
		this.ccid = ccid;
	}

	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public long getQdbid() {
		return qdbid;
	}

	public void setQdbid(long qdbid) {
		this.qdbid = qdbid;
	}

	public long getQdcid() {
		return qdcid;
	}

	public void setQdcid(long qdcid) {
		this.qdcid = qdcid;
	}

	public ChapterMapping() {
	}

	public ChapterMapping(long cbid, long ccid, int uuid, long qdbid, long qdcid) {
		this.cbid = cbid;
		this.ccid = ccid;
		this.uuid = uuid;
		this.qdbid = qdbid;
		this.qdcid = qdcid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ChapterMapping)) {
			return false;
		}
		ChapterMapping other = (ChapterMapping) obj;
		return (
			JceUtil.equals(cbid, other.cbid) &&
			JceUtil.equals(ccid, other.ccid) &&
			JceUtil.equals(uuid, other.uuid) &&
			JceUtil.equals(qdbid, other.qdbid) &&
			JceUtil.equals(qdcid, other.qdcid) 
		);
	}
}
