package com.yuewen.taf.servant;

import com.qq.cloud.taf.common.annotation.JceHolder;
import com.qq.cloud.taf.common.annotation.JceParameter;
import com.qq.cloud.taf.common.annotation.JceService;
import com.qq.cloud.taf.common.support.Holder;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-com.yuewen.taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceService
public interface MobileServerSatisfactToastServant {
	/**
	 * 测试方法
	 * @return
	 */
	public String sayHello();
	/**
	 * 获取有效期内的满足弹活动列表
	 * @param data 有效期内的满足弹活动列表
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void getMztConditionList(@JceHolder(name = "data") Holder<java.util.List<MztCondition>> data, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 根据满足弹活动Id获取参与对象配置信息
	 * @param conditionIds 满足弹活动id集合，多个id以英文逗号分割
	 * @param data 参与对象配置信息
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void getMztPartakeObjectList(@JceParameter(name = "conditionIds") String conditionIds, @JceHolder(name = "data") Holder<java.util.List<MztPartakeObject>> data, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 添加或更新用户触发满足弹活动的参与记录
	 * @param conditionId 满足弹活动id
	 * @param type 活动触发类型
	 * @param userId 用户Id
	 * @param amount 订阅金额
	 * @param data 参与对象配置信息
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void addTriggerActionCountWithAmount(@JceParameter(name = "conditionId") long conditionId, @JceParameter(name = "type") int type, @JceParameter(name = "userId") long userId, @JceParameter(name = "amount") int amount, @JceHolder(name = "data") Holder<MztActionCount> data, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 添加或更新用户触发满足弹活动的参与记录 
	 * @param conditionId 满足弹活动id
	 * @param type 活动触发类型
	 * @param userId 用户Id
	 * @param data 满足弹活动参与记录信息
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void addTriggerActionCount(@JceParameter(name = "conditionId") long conditionId, @JceParameter(name = "type") int type, @JceParameter(name = "userId") long userId, @JceHolder(name = "data") Holder<MztActionCount> data, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 取一个满足弹分组中一个条件动作类型和值
	 * @param conditionId 满足弹活动id
	 * @param type 活动触发类型
	 * @param data 满足弹触发条件配置
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void getTriggerActionTypeGroup(@JceParameter(name = "conditionId") long conditionId, @JceParameter(name = "type") int type, @JceHolder(name = "data") Holder<MztActionType> data, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 取出满足弹已奖励的次数
	 * @param conditionId 满足弹活动id
	 * @param userId 奖励领取人UserId
	 * @param count 满足弹已奖励的次数
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void getTriggerTimesByUser(@JceParameter(name = "conditionId") long conditionId, @JceParameter(name = "userId") long userId, @JceHolder(name = "count") Holder<Integer> count, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 插入奖励表和奖励日志
	 * @param logId 奖励日志id
	 * @param conditionId 满足弹活动id
	 * @param userId 奖励领取人UserId
	 * @param actionType 奖励类型
	 * @param actionCount 奖励起点币额度
	 * @param outParam 输出参数通用结构体
	 * @return 0成功，其他失败
	 */
	public void addUserTriggerReward(@JceParameter(name = "logId") long logId, @JceParameter(name = "conditionId") long conditionId, @JceParameter(name = "userId") long userId, @JceParameter(name = "actionType") int actionType, @JceParameter(name = "actionCount") int actionCount, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 综合后台：分页获取到期时间内的满足弹活动列表
	 * @param dueTime
	 * @return data 返回满足条件的满足弹集合
	 * @return totalCount 返回满足弹的总个数，用于分页显示
	 */
	public void getMztConditionListForBack(@JceParameter(name = "dueTime") String dueTime, @JceParameter(name = "pageIndex") int pageIndex, @JceParameter(name = "pageSize") int pageSize, @JceHolder(name = "data") Holder<java.util.List<MztCondition>> data, @JceHolder(name = "totalCount") Holder<Integer> totalCount);
	/**
	 * 综合后台：获取给定满足弹的详细信息
	 * @param conditionId 满足弹Id
	 * @return MztCondition 返回满足弹实体
	 */
	public void getMztConditionDetailForBack(@JceParameter(name = "conditionId") long conditionId, @JceHolder(name = "mztObject") Holder<MztCondition> mztObject);
	/**
	 * 综合后台：编辑满足弹信息
	 * @param mztObject 满足弹实体
	 * @return outParam 返回修改结果，0成功，-1失败
	 */
	public void editMztConditionForBack(@JceParameter(name = "mztObject") MztCondition mztObject, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
	/**
	 * 综合后台：新建满足弹
	 * @param mztObject 满足弹实体
	 * @param actionJson 满足弹触发类型id和count键值对
	 * @return 返回新建结果 ,0成功，-1失败
	 */
	public void createMztConditionForBack(@JceParameter(name = "mztObject") MztCondition mztObject, @JceParameter(name = "partakeObjList") java.util.List<MztPartakeObject> partakeObjList, @JceHolder(name = "outParam") Holder<CommonOutParam> outParam);
}
