package com.yuewen.taf.client.uniteidconvert.impl;

import com.yuewen.taf.client.uniteidconvert.servant.ChapterMapping;
import com.yuewen.taf.client.uniteidconvert.servant.CommonOutParam;
import com.yuewen.taf.client.uniteidconvert.servant.UniteIdConvertServantPrxCallback;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by duanyixiao on 2017/8/9.
 */
public class UnitedIdConvertServantCallback extends UniteIdConvertServantPrxCallback {
    private String interfaceName;
    private CountDownLatch latch = new CountDownLatch(1);
    private Map<Object,Object> outParam = new HashMap<>();
    private UnitedIdConvertServantCallback(){}

    public static UnitedIdConvertServantCallback create(String interfaceName){
        UnitedIdConvertServantCallback convertServantCallback = new UnitedIdConvertServantCallback();
        convertServantCallback.interfaceName = interfaceName;
        return convertServantCallback;
    }

    public boolean awaitWithTimeout(long timeout) throws InterruptedException{
        return latch.await(timeout, TimeUnit.MILLISECONDS);
    }

    public <T> T getOutParam(Class<T> t){
        if(outParam.containsKey(t)){
            Object object = outParam.get(t);
            if(object != null && t.isInstance(object))
                return t.cast(object);
        }
        return null;
    }

    @Override
    public void callback_setUserMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_setUserMappingBatch(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_setBookMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_setBookMappingBatch(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_setChapterMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_setChapterMappingBatch(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_delUserMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_delBookMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_delChapterMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_getGuidByQduid(int ret, long guid) {

    }

    @Override
    public void callback_getGuidByQduidBatch(int ret, Map<Long, Long> guidMap) {

    }

    @Override
    public void callback_getQduidByGuid(int ret, long qduid) {

    }

    @Override
    public void callback_getQduidByGuidBatch(int ret, Map<Long, Long> qduidMap) {

    }

    @Override
    public void callback_getCbidByQdbid(int ret, long cbid) {
        try{
            if(0 == ret){
                outParam.put(Long.class, cbid);
            }
        }finally {
            latch.countDown();
        }

    }

    @Override
    public void callback_getCbidByQdbidBatch(int ret, Map<Long, Long> cbidMap) {
        try{
            if(0 == ret){
                outParam.put(Map.class, cbidMap);
            }
        }finally {
            latch.countDown();
        }
    }

    @Override
    public void callback_getQdbidByCbid(int ret, long qdbid) {
        try{
            if(0 == ret){
                outParam.put(Long.class, qdbid);
            }
        }finally {
            latch.countDown();
        }
    }

    @Override
    public void callback_getQdbidByCbidBatch(int ret, Map<Long, Long> qdbidMap) {

    }

    @Override
    public void callback_getChapterMappingByQdcid(int ret, ChapterMapping cm) {

    }

    @Override
    public void callback_getChapterMappingByQdcidBatch(int ret, Map<Long, ChapterMapping> cmMap) {

    }

    @Override
    public void callback_getChapterMappingByUuid(int ret, ChapterMapping cm) {

    }

    @Override
    public void callback_getChapterMappingByUuidBatch(int ret, Map<Integer, ChapterMapping> cmMap) {

    }

    @Override
    public void callback_setQQBookMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_setQQBookMappingBatch(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_delQQBookMapping(int ret, CommonOutParam outParam) {

    }

    @Override
    public void callback_getCbidByQqbid(int ret, long cbid) {
        try{
            if(0 == ret){
                outParam.put(Long.class, cbid);
            }
        }finally {
            latch.countDown();
        }
    }

    @Override
    public void callback_getCbidByQqbidBatch(int ret, Map<Long, Long> cbidMap) {
        try{
            if(0 == ret){
                outParam.put(Map.class, cbidMap);
            }
        }finally {
            latch.countDown();
        }
    }

    @Override
    public void callback_getQqbidByCbid(int ret, long qqbid) {
        try{
            if(0 == ret){
                outParam.put(Long.class, qqbid);
            }
        }finally {
            latch.countDown();
        }
    }

    @Override
    public void callback_getQqbidByCbidBatch(int ret, Map<Long, Long> qqbidMap) {

    }

    @Override
    public void callback_exception(Throwable throwable) {

    }

    @Override
    public void callback_expired() {

    }
}
