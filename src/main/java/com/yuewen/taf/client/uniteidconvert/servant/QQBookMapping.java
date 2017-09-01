package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * QQ阅读作品对应关系结构体
 *
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class QQBookMapping {

	@JceStructProperty(order = 0, isRequire = true)
	public long cbid = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long qqbid = 0L;

	public long getCbid() {
		return cbid;
	}

	public void setCbid(long cbid) {
		this.cbid = cbid;
	}

	public long getQqbid() {
		return qqbid;
	}

	public void setQqbid(long qqbid) {
		this.qqbid = qqbid;
	}

	public QQBookMapping() {
	}

	public QQBookMapping(long cbid, long qqbid) {
		this.cbid = cbid;
		this.qqbid = qqbid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof QQBookMapping)) {
			return false;
		}
		QQBookMapping other = (QQBookMapping) obj;
		return (
			JceUtil.equals(cbid, other.cbid) &&
			JceUtil.equals(qqbid, other.qqbid) 
		);
	}
}
