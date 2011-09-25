/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.so.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.so.model.MemberRequest;
import com.liferay.so.model.MemberRequestModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the MemberRequest service. Represents a row in the &quot;SO_MemberRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.so.model.MemberRequestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MemberRequestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MemberRequestImpl
 * @see com.liferay.so.model.MemberRequest
 * @see com.liferay.so.model.MemberRequestModel
 * @generated
 */
public class MemberRequestModelImpl extends BaseModelImpl<MemberRequest>
	implements MemberRequestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a member request model instance should use the {@link com.liferay.so.model.MemberRequest} interface instead.
	 */
	public static final String TABLE_NAME = "SO_MemberRequest";
	public static final Object[][] TABLE_COLUMNS = {
			{ "memberRequestId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "key_", Types.VARCHAR },
			{ "receiverUserId", Types.BIGINT },
			{ "invitedRoleId", Types.BIGINT },
			{ "invitedTeamId", Types.BIGINT },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table SO_MemberRequest (memberRequestId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,key_ VARCHAR(75) null,receiverUserId LONG,invitedRoleId LONG,invitedTeamId LONG,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table SO_MemberRequest";
	public static final String ORDER_BY_JPQL = " ORDER BY memberRequest.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY SO_MemberRequest.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.so.model.MemberRequest"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.so.model.MemberRequest"),
			true);

	public Class<?> getModelClass() {
		return MemberRequest.class;
	}

	public String getModelClassName() {
		return MemberRequest.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.so.model.MemberRequest"));

	public MemberRequestModelImpl() {
	}

	public long getPrimaryKey() {
		return _memberRequestId;
	}

	public void setPrimaryKey(long primaryKey) {
		setMemberRequestId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_memberRequestId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getMemberRequestId() {
		return _memberRequestId;
	}

	public void setMemberRequestId(long memberRequestId) {
		_memberRequestId = memberRequestId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getKey() {
		if (_key == null) {
			return StringPool.BLANK;
		}
		else {
			return _key;
		}
	}

	public void setKey(String key) {
		if (_originalKey == null) {
			_originalKey = _key;
		}

		_key = key;
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	public long getReceiverUserId() {
		return _receiverUserId;
	}

	public void setReceiverUserId(long receiverUserId) {
		if (!_setOriginalReceiverUserId) {
			_setOriginalReceiverUserId = true;

			_originalReceiverUserId = _receiverUserId;
		}

		_receiverUserId = receiverUserId;
	}

	public String getReceiverUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getReceiverUserId(), "uuid",
			_receiverUserUuid);
	}

	public void setReceiverUserUuid(String receiverUserUuid) {
		_receiverUserUuid = receiverUserUuid;
	}

	public long getOriginalReceiverUserId() {
		return _originalReceiverUserId;
	}

	public long getInvitedRoleId() {
		return _invitedRoleId;
	}

	public void setInvitedRoleId(long invitedRoleId) {
		_invitedRoleId = invitedRoleId;
	}

	public long getInvitedTeamId() {
		return _invitedTeamId;
	}

	public void setInvitedTeamId(long invitedTeamId) {
		_invitedTeamId = invitedTeamId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public MemberRequest toEscapedModel() {
		if (isEscapedModel()) {
			return (MemberRequest)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (MemberRequest)ProxyUtil.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					MemberRequest.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		MemberRequestImpl memberRequestImpl = new MemberRequestImpl();

		memberRequestImpl.setMemberRequestId(getMemberRequestId());
		memberRequestImpl.setGroupId(getGroupId());
		memberRequestImpl.setCompanyId(getCompanyId());
		memberRequestImpl.setUserId(getUserId());
		memberRequestImpl.setUserName(getUserName());
		memberRequestImpl.setCreateDate(getCreateDate());
		memberRequestImpl.setModifiedDate(getModifiedDate());
		memberRequestImpl.setKey(getKey());
		memberRequestImpl.setReceiverUserId(getReceiverUserId());
		memberRequestImpl.setInvitedRoleId(getInvitedRoleId());
		memberRequestImpl.setInvitedTeamId(getInvitedTeamId());
		memberRequestImpl.setStatus(getStatus());

		memberRequestImpl.resetOriginalValues();

		return memberRequestImpl;
	}

	public int compareTo(MemberRequest memberRequest) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				memberRequest.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MemberRequest memberRequest = null;

		try {
			memberRequest = (MemberRequest)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = memberRequest.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		MemberRequestModelImpl memberRequestModelImpl = this;

		memberRequestModelImpl._originalGroupId = memberRequestModelImpl._groupId;

		memberRequestModelImpl._setOriginalGroupId = false;

		memberRequestModelImpl._originalKey = memberRequestModelImpl._key;

		memberRequestModelImpl._originalReceiverUserId = memberRequestModelImpl._receiverUserId;

		memberRequestModelImpl._setOriginalReceiverUserId = false;

		memberRequestModelImpl._originalStatus = memberRequestModelImpl._status;

		memberRequestModelImpl._setOriginalStatus = false;
	}

	@Override
	public CacheModel<MemberRequest> toCacheModel() {
		MemberRequestCacheModel memberRequestCacheModel = new MemberRequestCacheModel();

		memberRequestCacheModel.memberRequestId = getMemberRequestId();

		memberRequestCacheModel.groupId = getGroupId();

		memberRequestCacheModel.companyId = getCompanyId();

		memberRequestCacheModel.userId = getUserId();

		memberRequestCacheModel.userName = getUserName();

		String userName = memberRequestCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			memberRequestCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			memberRequestCacheModel.createDate = createDate.getTime();
		}
		else {
			memberRequestCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			memberRequestCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			memberRequestCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		memberRequestCacheModel.key = getKey();

		String key = memberRequestCacheModel.key;

		if ((key != null) && (key.length() == 0)) {
			memberRequestCacheModel.key = null;
		}

		memberRequestCacheModel.receiverUserId = getReceiverUserId();

		memberRequestCacheModel.invitedRoleId = getInvitedRoleId();

		memberRequestCacheModel.invitedTeamId = getInvitedTeamId();

		memberRequestCacheModel.status = getStatus();

		return memberRequestCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{memberRequestId=");
		sb.append(getMemberRequestId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", receiverUserId=");
		sb.append(getReceiverUserId());
		sb.append(", invitedRoleId=");
		sb.append(getInvitedRoleId());
		sb.append(", invitedTeamId=");
		sb.append(getInvitedTeamId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.so.model.MemberRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>memberRequestId</column-name><column-value><![CDATA[");
		sb.append(getMemberRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverUserId</column-name><column-value><![CDATA[");
		sb.append(getReceiverUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invitedRoleId</column-name><column-value><![CDATA[");
		sb.append(getInvitedRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invitedTeamId</column-name><column-value><![CDATA[");
		sb.append(getInvitedTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MemberRequest.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			MemberRequest.class
		};
	private long _memberRequestId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _key;
	private String _originalKey;
	private long _receiverUserId;
	private String _receiverUserUuid;
	private long _originalReceiverUserId;
	private boolean _setOriginalReceiverUserId;
	private long _invitedRoleId;
	private long _invitedTeamId;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private transient ExpandoBridge _expandoBridge;
	private MemberRequest _escapedModelProxy;
}