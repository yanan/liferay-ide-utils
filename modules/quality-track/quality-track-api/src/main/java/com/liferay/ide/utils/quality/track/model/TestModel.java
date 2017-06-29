/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.ide.utils.quality.track.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Test service. Represents a row in the &quot;qualitytrack_Test&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ide.utils.quality.track.model.impl.TestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ide.utils.quality.track.model.impl.TestImpl}.
 * </p>
 *
 * @author Terry Jia
 * @see Test
 * @see com.liferay.ide.utils.quality.track.model.impl.TestImpl
 * @see com.liferay.ide.utils.quality.track.model.impl.TestModelImpl
 * @generated
 */
@ProviderType
public interface TestModel extends BaseModel<Test>, GroupedModel, ShardedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a test model instance should use the {@link Test} interface instead.
	 */

	/**
	 * Returns the primary key of this test.
	 *
	 * @return the primary key of this test
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this test.
	 *
	 * @param primaryKey the primary key of this test
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the test ID of this test.
	 *
	 * @return the test ID of this test
	 */
	public long getTestId();

	/**
	 * Sets the test ID of this test.
	 *
	 * @param testId the test ID of this test
	 */
	public void setTestId(long testId);

	/**
	 * Returns the group ID of this test.
	 *
	 * @return the group ID of this test
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this test.
	 *
	 * @param groupId the group ID of this test
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this test.
	 *
	 * @return the company ID of this test
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this test.
	 *
	 * @param companyId the company ID of this test
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this test.
	 *
	 * @return the user ID of this test
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this test.
	 *
	 * @param userId the user ID of this test
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this test.
	 *
	 * @return the user uuid of this test
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this test.
	 *
	 * @param userUuid the user uuid of this test
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this test.
	 *
	 * @return the user name of this test
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this test.
	 *
	 * @param userName the user name of this test
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this test.
	 *
	 * @return the create date of this test
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this test.
	 *
	 * @param createDate the create date of this test
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this test.
	 *
	 * @return the modified date of this test
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this test.
	 *
	 * @param modifiedDate the modified date of this test
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this test.
	 *
	 * @return the status of this test
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this test.
	 *
	 * @param status the status of this test
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this test.
	 *
	 * @return the status by user ID of this test
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this test.
	 *
	 * @param statusByUserId the status by user ID of this test
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this test.
	 *
	 * @return the status by user uuid of this test
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this test.
	 *
	 * @param statusByUserUuid the status by user uuid of this test
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this test.
	 *
	 * @return the status by user name of this test
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this test.
	 *
	 * @param statusByUserName the status by user name of this test
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this test.
	 *
	 * @return the status date of this test
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this test.
	 *
	 * @param statusDate the status date of this test
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the release ID of this test.
	 *
	 * @return the release ID of this test
	 */
	public long getReleaseId();

	/**
	 * Sets the release ID of this test.
	 *
	 * @param releaseId the release ID of this test
	 */
	public void setReleaseId(long releaseId);

	/**
	 * Returns the test case ID of this test.
	 *
	 * @return the test case ID of this test
	 */
	public long getTestCaseId();

	/**
	 * Sets the test case ID of this test.
	 *
	 * @param testCaseId the test case ID of this test
	 */
	public void setTestCaseId(long testCaseId);

	/**
	 * Returns the actual results of this test.
	 *
	 * @return the actual results of this test
	 */
	@AutoEscape
	public String getActualResults();

	/**
	 * Sets the actual results of this test.
	 *
	 * @param actualResults the actual results of this test
	 */
	public void setActualResults(String actualResults);

	/**
	 * Returns the jira link of this test.
	 *
	 * @return the jira link of this test
	 */
	@AutoEscape
	public String getJiraLink();

	/**
	 * Sets the jira link of this test.
	 *
	 * @param jiraLink the jira link of this test
	 */
	public void setJiraLink(String jiraLink);

	/**
	 * Returns the time of this test.
	 *
	 * @return the time of this test
	 */
	public long getTime();

	/**
	 * Sets the time of this test.
	 *
	 * @param time the time of this test
	 */
	public void setTime(long time);

	/**
	 * Returns <code>true</code> if this test is approved.
	 *
	 * @return <code>true</code> if this test is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this test is denied.
	 *
	 * @return <code>true</code> if this test is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this test is a draft.
	 *
	 * @return <code>true</code> if this test is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this test is expired.
	 *
	 * @return <code>true</code> if this test is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this test is inactive.
	 *
	 * @return <code>true</code> if this test is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this test is incomplete.
	 *
	 * @return <code>true</code> if this test is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this test is pending.
	 *
	 * @return <code>true</code> if this test is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this test is scheduled.
	 *
	 * @return <code>true</code> if this test is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Test test);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Test> toCacheModel();

	@Override
	public Test toEscapedModel();

	@Override
	public Test toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}