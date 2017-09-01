package com.yuewen.taf.client.uniteidconvert.servant;

import com.qq.cloud.taf.common.annotation.JceCallback;
import com.qq.cloud.taf.common.annotation.JceContext;
import com.qq.cloud.taf.common.annotation.JceHolder;
import com.qq.cloud.taf.common.annotation.JceService;
import com.qq.cloud.taf.common.support.Holder;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceService
public interface UniteIdConvertServantPrx {
	/**
	 * 设置起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setUserMapping(UserMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setUserMapping(UserMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setUserMapping(@JceCallback UniteIdConvertServantPrxCallback callback, UserMapping mapping);
	/**
	 * 设置起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setUserMapping(@JceCallback UniteIdConvertServantPrxCallback callback, UserMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点用户对应关系
	 * @param mappingList 起点用户对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setUserMappingBatch(java.util.List<UserMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置起点用户对应关系
	 * @param mappingList 起点用户对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setUserMappingBatch(java.util.List<UserMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点用户对应关系
	 * @param mappingList 起点用户对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setUserMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<UserMapping> mappingList);
	/**
	 * 设置起点用户对应关系
	 * @param mappingList 起点用户对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setUserMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<UserMapping> mappingList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setBookMapping(BookMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setBookMapping(BookMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, BookMapping mapping);
	/**
	 * 设置起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, BookMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点作品对应关系
	 * @param mappingList 起点作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setBookMappingBatch(java.util.List<BookMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置起点作品对应关系
	 * @param mappingList 起点作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setBookMappingBatch(java.util.List<BookMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点作品对应关系
	 * @param mappingList 起点作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setBookMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<BookMapping> mappingList);
	/**
	 * 设置起点作品对应关系
	 * @param mappingList 起点作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setBookMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<BookMapping> mappingList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setChapterMapping(ChapterMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setChapterMapping(ChapterMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setChapterMapping(@JceCallback UniteIdConvertServantPrxCallback callback, ChapterMapping mapping);
	/**
	 * 设置起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setChapterMapping(@JceCallback UniteIdConvertServantPrxCallback callback, ChapterMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点章节对应关系
	 * @param mappingList 起点章节对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setChapterMappingBatch(java.util.List<ChapterMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置起点章节对应关系
	 * @param mappingList 起点章节对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setChapterMappingBatch(java.util.List<ChapterMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置起点章节对应关系
	 * @param mappingList 起点章节对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setChapterMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<ChapterMapping> mappingList);
	/**
	 * 设置起点章节对应关系
	 * @param mappingList 起点章节对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setChapterMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<ChapterMapping> mappingList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delUserMapping(UserMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 删除起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delUserMapping(UserMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delUserMapping(@JceCallback UniteIdConvertServantPrxCallback callback, UserMapping mapping);
	/**
	 * 删除起点用户对应关系
	 * @param mapping 起点用户对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delUserMapping(@JceCallback UniteIdConvertServantPrxCallback callback, UserMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delBookMapping(BookMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 删除起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delBookMapping(BookMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, BookMapping mapping);
	/**
	 * 删除起点作品对应关系
	 * @param mapping 起点作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, BookMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delChapterMapping(ChapterMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 删除起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delChapterMapping(ChapterMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delChapterMapping(@JceCallback UniteIdConvertServantPrxCallback callback, ChapterMapping mapping);
	/**
	 * 删除起点章节对应关系
	 * @param mapping 起点章节对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delChapterMapping(@JceCallback UniteIdConvertServantPrxCallback callback, ChapterMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduid 起点用户Id
	 * @param guid 统一用户Id
	 * @return 0成功、其他失败
	 */
	public int getGuidByQduid(long qduid, @JceHolder Holder<Long> guid);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduid 起点用户Id
	 * @param guid 统一用户Id
	 * @return 0成功、其他失败
	 */
	public int getGuidByQduid(long qduid, @JceHolder Holder<Long> guid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduid 起点用户Id
	 * @param guid 统一用户Id
	 * @return 0成功、其他失败
	 */
	public void async_getGuidByQduid(@JceCallback UniteIdConvertServantPrxCallback callback, long qduid);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduid 起点用户Id
	 * @param guid 统一用户Id
	 * @return 0成功、其他失败
	 */
	public void async_getGuidByQduid(@JceCallback UniteIdConvertServantPrxCallback callback, long qduid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduidList 起点用户Id列表
	 * @param guidMap 统一用户Id字典
	 * @return 0成功、其他失败
	 */
	public int getGuidByQduidBatch(java.util.List<Long> qduidList, @JceHolder Holder<java.util.Map<Long, Long>> guidMap);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduidList 起点用户Id列表
	 * @param guidMap 统一用户Id字典
	 * @return 0成功、其他失败
	 */
	public int getGuidByQduidBatch(java.util.List<Long> qduidList, @JceHolder Holder<java.util.Map<Long, Long>> guidMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduidList 起点用户Id列表
	 * @param guidMap 统一用户Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getGuidByQduidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> qduidList);
	/**
	 * 根据起点用户Id获取统一用户Id
	 * @param qduidList 起点用户Id列表
	 * @param guidMap 统一用户Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getGuidByQduidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> qduidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guid 统一用户Id
	 * @param qduid 起点用户Id
	 * @return 0成功、其他失败
	 */
	public int getQduidByGuid(long guid, @JceHolder Holder<Long> qduid);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guid 统一用户Id
	 * @param qduid 起点用户Id
	 * @return 0成功、其他失败
	 */
	public int getQduidByGuid(long guid, @JceHolder Holder<Long> qduid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guid 统一用户Id
	 * @param qduid 起点用户Id
	 * @return 0成功、其他失败
	 */
	public void async_getQduidByGuid(@JceCallback UniteIdConvertServantPrxCallback callback, long guid);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guid 统一用户Id
	 * @param qduid 起点用户Id
	 * @return 0成功、其他失败
	 */
	public void async_getQduidByGuid(@JceCallback UniteIdConvertServantPrxCallback callback, long guid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guidList 统一用户Id列表
	 * @param qduidMap 起点用户Id字典
	 * @return 0成功、其他失败
	 */
	public int getQduidByGuidBatch(java.util.List<Long> guidList, @JceHolder Holder<java.util.Map<Long, Long>> qduidMap);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guidList 统一用户Id列表
	 * @param qduidMap 起点用户Id字典
	 * @return 0成功、其他失败
	 */
	public int getQduidByGuidBatch(java.util.List<Long> guidList, @JceHolder Holder<java.util.Map<Long, Long>> qduidMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guidList 统一用户Id列表
	 * @param qduidMap 起点用户Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getQduidByGuidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> guidList);
	/**
	 * 根据统一用户Id获取起点用户Id
	 * @param guidList 统一用户Id列表
	 * @param qduidMap 起点用户Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getQduidByGuidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> guidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbid 起点作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public int getCbidByQdbid(long qdbid, @JceHolder Holder<Long> cbid);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbid 起点作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public int getCbidByQdbid(long qdbid, @JceHolder Holder<Long> cbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbid 起点作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQdbid(@JceCallback UniteIdConvertServantPrxCallback callback, long qdbid);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbid 起点作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQdbid(@JceCallback UniteIdConvertServantPrxCallback callback, long qdbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbidList 起点作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getCbidByQdbidBatch(java.util.List<Long> qdbidList, @JceHolder Holder<java.util.Map<Long, Long>> cbidMap);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbidList 起点作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getCbidByQdbidBatch(java.util.List<Long> qdbidList, @JceHolder Holder<java.util.Map<Long, Long>> cbidMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbidList 起点作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQdbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> qdbidList);
	/**
	 * 根据起点作品Id获取统一作品Id
	 * @param qdbidList 起点作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQdbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> qdbidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbid 统一作品Id
	 * @param qdbid 起点作品Id
	 * @return 0成功、其他失败
	 */
	public int getQdbidByCbid(long cbid, @JceHolder Holder<Long> qdbid);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbid 统一作品Id
	 * @param qdbid 起点作品Id
	 * @return 0成功、其他失败
	 */
	public int getQdbidByCbid(long cbid, @JceHolder Holder<Long> qdbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbid 统一作品Id
	 * @param qdbid 起点作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getQdbidByCbid(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbid 统一作品Id
	 * @param qdbid 起点作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getQdbidByCbid(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qdbidMap 起点作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getQdbidByCbidBatch(java.util.List<Long> cbidList, @JceHolder Holder<java.util.Map<Long, Long>> qdbidMap);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qdbidMap 起点作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getQdbidByCbidBatch(java.util.List<Long> cbidList, @JceHolder Holder<java.util.Map<Long, Long>> qdbidMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qdbidMap 起点作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getQdbidByCbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> cbidList);
	/**
	 * 根据统一作品Id获取起点作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qdbidMap 起点作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getQdbidByCbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> cbidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcid 起点章节Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByQdcid(long qdbid, long qdcid, @JceHolder Holder<ChapterMapping> cm);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcid 起点章节Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByQdcid(long qdbid, long qdcid, @JceHolder Holder<ChapterMapping> cm, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcid 起点章节Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByQdcid(@JceCallback UniteIdConvertServantPrxCallback callback, long qdbid, long qdcid);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcid 起点章节Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByQdcid(@JceCallback UniteIdConvertServantPrxCallback callback, long qdbid, long qdcid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcidList 起点章节Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByQdcidBatch(long qdbid, java.util.List<Long> qdcidList, @JceHolder Holder<java.util.Map<Long, ChapterMapping>> cmMap);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcidList 起点章节Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByQdcidBatch(long qdbid, java.util.List<Long> qdcidList, @JceHolder Holder<java.util.Map<Long, ChapterMapping>> cmMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcidList 起点章节Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByQdcidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, long qdbid, java.util.List<Long> qdcidList);
	/**
	 * 根据起点章节Id获取章节对应关系
	 * @param qdbid 起点作品Id
	 * @param qdcidList 起点章节Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByQdcidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, long qdbid, java.util.List<Long> qdcidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuid 统一章节短Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByUuid(long cbid, int uuid, @JceHolder Holder<ChapterMapping> cm);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuid 统一章节短Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByUuid(long cbid, int uuid, @JceHolder Holder<ChapterMapping> cm, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuid 统一章节短Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByUuid(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid, int uuid);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuid 统一章节短Id
	 * @param cm 章节对应关系结构体
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByUuid(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid, int uuid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuidList 统一章节短Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByUuidBatch(long cbid, java.util.List<Integer> uuidList, @JceHolder Holder<java.util.Map<Integer, ChapterMapping>> cmMap);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuidList 统一章节短Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public int getChapterMappingByUuidBatch(long cbid, java.util.List<Integer> uuidList, @JceHolder Holder<java.util.Map<Integer, ChapterMapping>> cmMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuidList 统一章节短Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByUuidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid, java.util.List<Integer> uuidList);
	/**
	 * 根据统一章节短Id获取章节对应关系
	 * @param cbid 统一作品Id
	 * @param uuidList 统一章节短Id列表
	 * @param cmMap 章节对应关系结构体字典
	 * @return 0成功、其他失败
	 */
	public void async_getChapterMappingByUuidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid, java.util.List<Integer> uuidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setQQBookMapping(QQBookMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setQQBookMapping(QQBookMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setQQBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, QQBookMapping mapping);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setQQBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, QQBookMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mappingList QQ阅读作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setQQBookMappingBatch(java.util.List<QQBookMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mappingList QQ阅读作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int setQQBookMappingBatch(java.util.List<QQBookMapping> mappingList, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mappingList QQ阅读作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setQQBookMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<QQBookMapping> mappingList);
	/**
	 * 设置QQ阅读作品对应关系
	 * @param mappingList QQ阅读作品对应关系结构体列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_setQQBookMappingBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<QQBookMapping> mappingList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delQQBookMapping(QQBookMapping mapping, @JceHolder Holder<CommonOutParam> outParam);
	/**
	 * 删除QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public int delQQBookMapping(QQBookMapping mapping, @JceHolder Holder<CommonOutParam> outParam, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 删除QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delQQBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, QQBookMapping mapping);
	/**
	 * 删除QQ阅读作品对应关系
	 * @param mapping QQ阅读作品对应关系结构体
	 * @param outParam 输出参数通用结构体
	 * @return 0成功、其他失败
	 */
	public void async_delQQBookMapping(@JceCallback UniteIdConvertServantPrxCallback callback, QQBookMapping mapping, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public int getCbidByQqbid(long qqbid, @JceHolder Holder<Long> cbid);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public int getCbidByQqbid(long qqbid, @JceHolder Holder<Long> cbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQqbid(@JceCallback UniteIdConvertServantPrxCallback callback, long qqbid);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQqbid(@JceCallback UniteIdConvertServantPrxCallback callback, long qqbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbidList QQ阅读作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getCbidByQqbidBatch(java.util.List<Long> qqbidList, @JceHolder Holder<java.util.Map<Long, Long>> cbidMap);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbidList QQ阅读作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getCbidByQqbidBatch(java.util.List<Long> qqbidList, @JceHolder Holder<java.util.Map<Long, Long>> cbidMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbidList QQ阅读作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQqbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> qqbidList);
	/**
	 * 根据QQ阅读作品Id获取统一作品Id
	 * @param qqbidList QQ阅读作品Id列表
	 * @param cbidMap 统一作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getCbidByQqbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> qqbidList, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @return 0成功、其他失败
	 */
	public int getQqbidByCbid(long cbid, @JceHolder Holder<Long> qqbid);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @return 0成功、其他失败
	 */
	public int getQqbidByCbid(long cbid, @JceHolder Holder<Long> qqbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getQqbidByCbid(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbid 统一作品Id
	 * @param qqbid QQ阅读作品Id
	 * @return 0成功、其他失败
	 */
	public void async_getQqbidByCbid(@JceCallback UniteIdConvertServantPrxCallback callback, long cbid, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qqbidMap QQ阅读作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getQqbidByCbidBatch(java.util.List<Long> cbidList, @JceHolder Holder<java.util.Map<Long, Long>> qqbidMap);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qqbidMap QQ阅读作品Id字典
	 * @return 0成功、其他失败
	 */
	public int getQqbidByCbidBatch(java.util.List<Long> cbidList, @JceHolder Holder<java.util.Map<Long, Long>> qqbidMap, @JceContext java.util.Map<String, String> ctx);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qqbidMap QQ阅读作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getQqbidByCbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> cbidList);
	/**
	 * 根据统一作品Id获取QQ阅读作品Id
	 * @param cbidList 统一作品Id列表
	 * @param qqbidMap QQ阅读作品Id字典
	 * @return 0成功、其他失败
	 */
	public void async_getQqbidByCbidBatch(@JceCallback UniteIdConvertServantPrxCallback callback, java.util.List<Long> cbidList, @JceContext java.util.Map<String, String> ctx);
}
