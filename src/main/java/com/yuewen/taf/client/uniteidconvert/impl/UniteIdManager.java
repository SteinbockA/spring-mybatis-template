package com.yuewen.taf.client.uniteidconvert.impl;

import com.yuewen.taf.client.uniteidconvert.servant.UniteIdConvertServantPrx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by duanyixiao on 2017/8/9.
 */
@Service
public class UniteIdManager {
    private static final Logger logger = LoggerFactory.getLogger(UniteIdManager.class);
    private int timeout = 3000;

    @Autowired
    UniteIdConvertServantPrx uniteIdConvertServantPrx;
    //第三方调用用Optional封装
    public Optional<Long> getCbidFromQqbid(long bid){
        UnitedIdConvertServantCallback convertServantCallback = UnitedIdConvertServantCallback.create("getCbidByQqbid");
        uniteIdConvertServantPrx.async_getCbidByQqbid(convertServantCallback,bid);
        try {
            if (convertServantCallback.awaitWithTimeout(timeout)) {
                long cbid = convertServantCallback.getOutParam(Long.class);
                logger.info("<<<<< getCbidfrom qqbid, cbid={},qqbid={}",cbid,bid);
                return Optional.ofNullable(cbid);
            }
            else {
                logger.error("!!!!!!!!taf call async_getCbidByQqbid time out , bid={}",bid);
            }
        }catch (Exception e){
            logger.error("taf call: async_getCbidByQqbid exception, bid,e={}",bid,e);
        }
        return Optional.empty();
    }

    public Optional<Map<Long,Long>> getCbidFromQqbidBatch(List<Long> qqbids){
        UnitedIdConvertServantCallback convertServantCallback = UnitedIdConvertServantCallback.create("getCbidByQqbidBatch");
        uniteIdConvertServantPrx.async_getCbidByQqbidBatch(convertServantCallback,qqbids);
        try {
            if (convertServantCallback.awaitWithTimeout(timeout)) {
                Map<Long,Long> ids = convertServantCallback.getOutParam(Map.class);
                return Optional.ofNullable(ids);
            }
            else {
                logger.error("!!!!!!!!taf call async_getCbidByQqbidBatch time out , bids={}",qqbids);
            }
        }catch (Exception e){
            logger.error("taf call: async_getCbidByQqbidBatch exception, bids,e={}",qqbids,e);
        }
        return Optional.empty();
    }



    public Optional<Long> getQqbidByCbid(long cbid){
        UnitedIdConvertServantCallback convertServantCallback = UnitedIdConvertServantCallback.create("getQqbidByCbid");
        uniteIdConvertServantPrx.async_getQqbidByCbid(convertServantCallback,cbid);
        try {
            if (convertServantCallback.awaitWithTimeout(timeout)) {
                long qqbid = convertServantCallback.getOutParam(Long.class);
                return Optional.ofNullable(qqbid);
            }
            else {
                logger.error("!!!!!!!!taf call async_getQqbidByCbid time out , cbid={}",cbid);
            }
        }catch (Exception e){
            logger.error("taf call: async_getQqbidByCbid exception, cbid , e={}",cbid,e);
        }
        return Optional.empty();

    }

    public Optional<Long> getQdbidByCbid(long cbid){
        UnitedIdConvertServantCallback convertServantCallback = UnitedIdConvertServantCallback.create("getQdbidByCbid");
        uniteIdConvertServantPrx.async_getQdbidByCbid(convertServantCallback,cbid);
        try {
            if (convertServantCallback.awaitWithTimeout(timeout)) {
                long qdbid = convertServantCallback.getOutParam(Long.class);
                return Optional.ofNullable(qdbid);
            }
            else {
                logger.error("!!!!!!!!taf call async_getQqbidByCbid time out , cbid={}",cbid);
            }
        }catch (Exception e){
            logger.error("taf call: async_getQqbidByCbid exception, cbid , e={}",cbid,e);
        }
        return Optional.empty();

    }

}
