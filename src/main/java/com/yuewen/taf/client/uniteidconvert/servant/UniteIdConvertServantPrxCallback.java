package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.protocol.support.JceAbstractCallback;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
public abstract class UniteIdConvertServantPrxCallback extends JceAbstractCallback {

	public abstract void callback_setUserMapping(int ret, CommonOutParam outParam);

	public abstract void callback_setUserMappingBatch(int ret, CommonOutParam outParam);

	public abstract void callback_setBookMapping(int ret, CommonOutParam outParam);

	public abstract void callback_setBookMappingBatch(int ret, CommonOutParam outParam);

	public abstract void callback_setChapterMapping(int ret, CommonOutParam outParam);

	public abstract void callback_setChapterMappingBatch(int ret, CommonOutParam outParam);

	public abstract void callback_delUserMapping(int ret, CommonOutParam outParam);

	public abstract void callback_delBookMapping(int ret, CommonOutParam outParam);

	public abstract void callback_delChapterMapping(int ret, CommonOutParam outParam);

	public abstract void callback_getGuidByQduid(int ret, long guid);

	public abstract void callback_getGuidByQduidBatch(int ret, java.util.Map<Long, Long> guidMap);

	public abstract void callback_getQduidByGuid(int ret, long qduid);

	public abstract void callback_getQduidByGuidBatch(int ret, java.util.Map<Long, Long> qduidMap);

	public abstract void callback_getCbidByQdbid(int ret, long cbid);

	public abstract void callback_getCbidByQdbidBatch(int ret, java.util.Map<Long, Long> cbidMap);

	public abstract void callback_getQdbidByCbid(int ret, long qdbid);

	public abstract void callback_getQdbidByCbidBatch(int ret, java.util.Map<Long, Long> qdbidMap);

	public abstract void callback_getChapterMappingByQdcid(int ret, ChapterMapping cm);

	public abstract void callback_getChapterMappingByQdcidBatch(int ret, java.util.Map<Long, ChapterMapping> cmMap);

	public abstract void callback_getChapterMappingByUuid(int ret, ChapterMapping cm);

	public abstract void callback_getChapterMappingByUuidBatch(int ret, java.util.Map<Integer, ChapterMapping> cmMap);

	public abstract void callback_setQQBookMapping(int ret, CommonOutParam outParam);

	public abstract void callback_setQQBookMappingBatch(int ret, CommonOutParam outParam);

	public abstract void callback_delQQBookMapping(int ret, CommonOutParam outParam);

	public abstract void callback_getCbidByQqbid(int ret, long cbid);

	public abstract void callback_getCbidByQqbidBatch(int ret, java.util.Map<Long, Long> cbidMap);

	public abstract void callback_getQqbidByCbid(int ret, long qqbid);

	public abstract void callback_getQqbidByCbidBatch(int ret, java.util.Map<Long, Long> qqbidMap);

}
