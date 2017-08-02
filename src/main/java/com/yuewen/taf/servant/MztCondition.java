package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceStruct;
import com.qq.cloud.taf.common.annotation.JceStructProperty;
import com.qq.cloud.taf.protocol.util.JceUtil;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceStruct
public class MztCondition {

	@JceStructProperty(order = 0, isRequire = true)
	public long conditionId = 0L;
	@JceStructProperty(order = 1, isRequire = true)
	public long beginDate = 0L;
	@JceStructProperty(order = 2, isRequire = true)
	public long endDate = 0L;
	@JceStructProperty(order = 3, isRequire = true)
	public int notifyType = 0;
	@JceStructProperty(order = 4, isRequire = true)
	public String partakeObject = "";
	@JceStructProperty(order = 5, isRequire = true)
	public int partakeObjectCount = 0;
	@JceStructProperty(order = 6, isRequire = true)
	public int actionTypeId = 0;
	@JceStructProperty(order = 7, isRequire = true)
	public int actionCount = 0;
	@JceStructProperty(order = 8, isRequire = true)
	public int triggerTypeId = 0;
	@JceStructProperty(order = 9, isRequire = true)
	public int triggerCount = 0;
	@JceStructProperty(order = 10, isRequire = true)
	public String notifyContent = "";
	@JceStructProperty(order = 11, isRequire = true)
	public String directionUrl1 = "";
	@JceStructProperty(order = 12, isRequire = true)
	public String directionUrl2 = "";
	@JceStructProperty(order = 13, isRequire = true)
	public String directionUrl3 = "";
	@JceStructProperty(order = 14, isRequire = true)
	public long createDate = 0L;
	@JceStructProperty(order = 15, isRequire = true)
	public long updateDate = 0L;
	@JceStructProperty(order = 16, isRequire = true)
	public String notifyTitle = "";
	@JceStructProperty(order = 17, isRequire = true)
	public String directionUrl1Title = "";
	@JceStructProperty(order = 18, isRequire = true)
	public String directionUrl2Title = "";
	@JceStructProperty(order = 19, isRequire = true)
	public String directionUrl3Title = "";
	@JceStructProperty(order = 20, isRequire = true)
	public String apkSourceFilters = "";
	@JceStructProperty(order = 21, isRequire = true)
	public String versionCodeFilters = "";
	@JceStructProperty(order = 22, isRequire = true)
	public String phoneModelFilters = "";
	@JceStructProperty(order = 23, isRequire = true)
	public String sdkFilters = "";
	@JceStructProperty(order = 24, isRequire = true)
	public String bookIdFilters = "";
	@JceStructProperty(order = 25, isRequire = true)
	public String bookSiteFilters = "";
	@JceStructProperty(order = 26, isRequire = true)
	public String bookTypeFilters = "";
	@JceStructProperty(order = 27, isRequire = true)
	public String actionTypeIds = "";
	@JceStructProperty(order = 28, isRequire = false)
	public String actionJson = "";

	public long getConditionId() {
		return conditionId;
	}

	public void setConditionId(long conditionId) {
		this.conditionId = conditionId;
	}

	public long getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(long beginDate) {
		this.beginDate = beginDate;
	}

	public long getEndDate() {
		return endDate;
	}

	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	public int getNotifyType() {
		return notifyType;
	}

	public void setNotifyType(int notifyType) {
		this.notifyType = notifyType;
	}

	public String getPartakeObject() {
		return partakeObject;
	}

	public void setPartakeObject(String partakeObject) {
		this.partakeObject = partakeObject;
	}

	public int getPartakeObjectCount() {
		return partakeObjectCount;
	}

	public void setPartakeObjectCount(int partakeObjectCount) {
		this.partakeObjectCount = partakeObjectCount;
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

	public int getTriggerTypeId() {
		return triggerTypeId;
	}

	public void setTriggerTypeId(int triggerTypeId) {
		this.triggerTypeId = triggerTypeId;
	}

	public int getTriggerCount() {
		return triggerCount;
	}

	public void setTriggerCount(int triggerCount) {
		this.triggerCount = triggerCount;
	}

	public String getNotifyContent() {
		return notifyContent;
	}

	public void setNotifyContent(String notifyContent) {
		this.notifyContent = notifyContent;
	}

	public String getDirectionUrl1() {
		return directionUrl1;
	}

	public void setDirectionUrl1(String directionUrl1) {
		this.directionUrl1 = directionUrl1;
	}

	public String getDirectionUrl2() {
		return directionUrl2;
	}

	public void setDirectionUrl2(String directionUrl2) {
		this.directionUrl2 = directionUrl2;
	}

	public String getDirectionUrl3() {
		return directionUrl3;
	}

	public void setDirectionUrl3(String directionUrl3) {
		this.directionUrl3 = directionUrl3;
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

	public String getNotifyTitle() {
		return notifyTitle;
	}

	public void setNotifyTitle(String notifyTitle) {
		this.notifyTitle = notifyTitle;
	}

	public String getDirectionUrl1Title() {
		return directionUrl1Title;
	}

	public void setDirectionUrl1Title(String directionUrl1Title) {
		this.directionUrl1Title = directionUrl1Title;
	}

	public String getDirectionUrl2Title() {
		return directionUrl2Title;
	}

	public void setDirectionUrl2Title(String directionUrl2Title) {
		this.directionUrl2Title = directionUrl2Title;
	}

	public String getDirectionUrl3Title() {
		return directionUrl3Title;
	}

	public void setDirectionUrl3Title(String directionUrl3Title) {
		this.directionUrl3Title = directionUrl3Title;
	}

	public String getApkSourceFilters() {
		return apkSourceFilters;
	}

	public void setApkSourceFilters(String apkSourceFilters) {
		this.apkSourceFilters = apkSourceFilters;
	}

	public String getVersionCodeFilters() {
		return versionCodeFilters;
	}

	public void setVersionCodeFilters(String versionCodeFilters) {
		this.versionCodeFilters = versionCodeFilters;
	}

	public String getPhoneModelFilters() {
		return phoneModelFilters;
	}

	public void setPhoneModelFilters(String phoneModelFilters) {
		this.phoneModelFilters = phoneModelFilters;
	}

	public String getSdkFilters() {
		return sdkFilters;
	}

	public void setSdkFilters(String sdkFilters) {
		this.sdkFilters = sdkFilters;
	}

	public String getBookIdFilters() {
		return bookIdFilters;
	}

	public void setBookIdFilters(String bookIdFilters) {
		this.bookIdFilters = bookIdFilters;
	}

	public String getBookSiteFilters() {
		return bookSiteFilters;
	}

	public void setBookSiteFilters(String bookSiteFilters) {
		this.bookSiteFilters = bookSiteFilters;
	}

	public String getBookTypeFilters() {
		return bookTypeFilters;
	}

	public void setBookTypeFilters(String bookTypeFilters) {
		this.bookTypeFilters = bookTypeFilters;
	}

	public String getActionTypeIds() {
		return actionTypeIds;
	}

	public void setActionTypeIds(String actionTypeIds) {
		this.actionTypeIds = actionTypeIds;
	}

	public String getActionJson() {
		return actionJson;
	}

	public void setActionJson(String actionJson) {
		this.actionJson = actionJson;
	}

	public MztCondition() {
	}

	public MztCondition(long conditionId, long beginDate, long endDate, int notifyType, String partakeObject, int partakeObjectCount, int actionTypeId, int actionCount, int triggerTypeId, int triggerCount, String notifyContent, String directionUrl1, String directionUrl2, String directionUrl3, long createDate, long updateDate, String notifyTitle, String directionUrl1Title, String directionUrl2Title, String directionUrl3Title, String apkSourceFilters, String versionCodeFilters, String phoneModelFilters, String sdkFilters, String bookIdFilters, String bookSiteFilters, String bookTypeFilters, String actionTypeIds, String actionJson) {
		this.conditionId = conditionId;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.notifyType = notifyType;
		this.partakeObject = partakeObject;
		this.partakeObjectCount = partakeObjectCount;
		this.actionTypeId = actionTypeId;
		this.actionCount = actionCount;
		this.triggerTypeId = triggerTypeId;
		this.triggerCount = triggerCount;
		this.notifyContent = notifyContent;
		this.directionUrl1 = directionUrl1;
		this.directionUrl2 = directionUrl2;
		this.directionUrl3 = directionUrl3;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.notifyTitle = notifyTitle;
		this.directionUrl1Title = directionUrl1Title;
		this.directionUrl2Title = directionUrl2Title;
		this.directionUrl3Title = directionUrl3Title;
		this.apkSourceFilters = apkSourceFilters;
		this.versionCodeFilters = versionCodeFilters;
		this.phoneModelFilters = phoneModelFilters;
		this.sdkFilters = sdkFilters;
		this.bookIdFilters = bookIdFilters;
		this.bookSiteFilters = bookSiteFilters;
		this.bookTypeFilters = bookTypeFilters;
		this.actionTypeIds = actionTypeIds;
		this.actionJson = actionJson;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MztCondition)) {
			return false;
		}
		MztCondition other = (MztCondition) obj;
		return (
			JceUtil.equals(conditionId, other.conditionId) &&
			JceUtil.equals(beginDate, other.beginDate) &&
			JceUtil.equals(endDate, other.endDate) &&
			JceUtil.equals(notifyType, other.notifyType) &&
			JceUtil.equals(partakeObject, other.partakeObject) &&
			JceUtil.equals(partakeObjectCount, other.partakeObjectCount) &&
			JceUtil.equals(actionTypeId, other.actionTypeId) &&
			JceUtil.equals(actionCount, other.actionCount) &&
			JceUtil.equals(triggerTypeId, other.triggerTypeId) &&
			JceUtil.equals(triggerCount, other.triggerCount) &&
			JceUtil.equals(notifyContent, other.notifyContent) &&
			JceUtil.equals(directionUrl1, other.directionUrl1) &&
			JceUtil.equals(directionUrl2, other.directionUrl2) &&
			JceUtil.equals(directionUrl3, other.directionUrl3) &&
			JceUtil.equals(createDate, other.createDate) &&
			JceUtil.equals(updateDate, other.updateDate) &&
			JceUtil.equals(notifyTitle, other.notifyTitle) &&
			JceUtil.equals(directionUrl1Title, other.directionUrl1Title) &&
			JceUtil.equals(directionUrl2Title, other.directionUrl2Title) &&
			JceUtil.equals(directionUrl3Title, other.directionUrl3Title) &&
			JceUtil.equals(apkSourceFilters, other.apkSourceFilters) &&
			JceUtil.equals(versionCodeFilters, other.versionCodeFilters) &&
			JceUtil.equals(phoneModelFilters, other.phoneModelFilters) &&
			JceUtil.equals(sdkFilters, other.sdkFilters) &&
			JceUtil.equals(bookIdFilters, other.bookIdFilters) &&
			JceUtil.equals(bookSiteFilters, other.bookSiteFilters) &&
			JceUtil.equals(bookTypeFilters, other.bookTypeFilters) &&
			JceUtil.equals(actionTypeIds, other.actionTypeIds) &&
			JceUtil.equals(actionJson, other.actionJson) 
		);
	}
}
