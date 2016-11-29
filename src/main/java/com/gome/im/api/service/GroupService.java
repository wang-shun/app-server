package com.gome.im.api.service;


import com.gome.im.api.model.ResultModel;
import com.gome.im.api.model.request.ReqGroup;

public interface GroupService {
	
	/**
	 * 创建群组
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> addGroup(ReqGroup reqGroup);
	
	/**
	 * 加入群
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> joinGroup(ReqGroup reqGroup);
	
	/**
	 * 邀请加入群
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> inviteGroup(ReqGroup reqGroup);
	
	/**
	 * 退群
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> quitGroup(ReqGroup reqGroup);
	
	/**
	 * 踢人
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> kickGroup(ReqGroup reqGroup);
	
	/**
	 * 修改群信息
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> editGroup(ReqGroup reqGroup);
	
	/**
	 * 解散群
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> disbandGroup(ReqGroup reqGroup);
	
	/**
	 * 审核群成员
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> auditMember(ReqGroup reqGroup);
	
	/**
	 * 获取群组信息
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> getGroup(ReqGroup reqGroup);
	
	/**
	 * 获取群组列表信息
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> listGroup(ReqGroup reqGroup);
	
	/**
	 * 修改群成员备注
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> editMemberMark(ReqGroup reqGroup);
	
	/**
	 * 获取群组成员
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> listGroupMember(ReqGroup reqGroup);
	
//	/**
//	 * 添加群组管理员
//	 * @param reqGroup
//	 * @return
//	 */
//	ResultModel<Object> addManager(ReqGroup reqGroup);
//
//	/**
//	 * 删除群组管理员
//	 * @param reqGroup
//	 * @return
//	 */
//	ResultModel<Object> delManager(ReqGroup reqGroup);
	
	/**
	 * 屏蔽群消息
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> shieldGroup(ReqGroup reqGroup);
	
	/**
	 * 设置群置顶
	 * @param reqGroup
	 * @return
	 */
	ResultModel<Object> sickiesGroup(ReqGroup reqGroup);

}
