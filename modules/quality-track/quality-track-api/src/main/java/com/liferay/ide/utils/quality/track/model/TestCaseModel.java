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
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TestCase service. Represents a row in the &quot;qualitytrack_TestCase&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ide.utils.quality.track.model.impl.TestCaseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ide.utils.quality.track.model.impl.TestCaseImpl}.
 * </p>
 *
 * @author Terry Jia
 * @see TestCase
 * @see com.liferay.ide.utils.quality.track.model.impl.TestCaseImpl
 * @see com.liferay.ide.utils.quality.track.model.impl.TestCaseModelImpl
 * @generated
 */
@ProviderType
public interface TestCaseModel extends BaseModel<TestCase>, GroupedModel,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a test case model instance should use the {@link TestCase} interface instead.
	 */

	/**
	 * Returns the primary key of this test case.
	 *
	 * @return the primary key of this test case
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this test case.
	 *
	 * @param primaryKey the primary key of this test case
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the test case ID of this test case.
	 *
	 * @return the test case ID of this test case
	 */
	public long getTestCaseId();

	/**
	 * Sets the test case ID of this test case.
	 *
	 * @param testCaseId the test case ID of this test case
	 */
	public void setTestCaseId(long testCaseId);

	/**
	 * Returns the group ID of this test case.
	 *
	 * @return the group ID of this test case
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this test case.
	 *
	 * @param groupId the group ID of this test case
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this test case.
	 *
	 * @return the company ID of this test case
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this test case.
	 *
	 * @param companyId the company ID of this test case
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this test case.
	 *
	 * @return the user ID of this test case
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this test case.
	 *
	 * @param userId the user ID of this test case
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this test case.
	 *
	 * @return the user uuid of this test case
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this test case.
	 *
	 * @param userUuid the user uuid of this test case
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this test case.
	 *
	 * @return the user name of this test case
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this test case.
	 *
	 * @param userName the user name of this test case
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this test case.
	 *
	 * @return the create date of this test case
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this test case.
	 *
	 * @param createDate the create date of this test case
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this test case.
	 *
	 * @return the modified date of this test case
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this test case.
	 *
	 * @param modifiedDate the modified date of this test case
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the environment of this test case.
	 *
	 * @return the environment of this test case
	 */
	@AutoEscape
	public String getEnvironment();

	/**
	 * Sets the environment of this test case.
	 *
	 * @param environment the environment of this test case
	 */
	public void setEnvironment(String environment);

	/**
	 * Returns the test case name of this test case.
	 *
	 * @return the test case name of this test case
	 */
	@AutoEscape
	public String getTestCaseName();

	/**
	 * Sets the test case name of this test case.
	 *
	 * @param testCaseName the test case name of this test case
	 */
	public void setTestCaseName(String testCaseName);

	/**
	 * Returns the before test case ID of this test case.
	 *
	 * @return the before test case ID of this test case
	 */
	public long getBeforeTestCaseId();

	/**
	 * Sets the before test case ID of this test case.
	 *
	 * @param beforeTestCaseId the before test case ID of this test case
	 */
	public void setBeforeTestCaseId(long beforeTestCaseId);

	/**
	 * Returns the automatic of this test case.
	 *
	 * @return the automatic of this test case
	 */
	public boolean getAutomatic();

	/**
	 * Returns <code>true</code> if this test case is automatic.
	 *
	 * @return <code>true</code> if this test case is automatic; <code>false</code> otherwise
	 */
	public boolean isAutomatic();

	/**
	 * Sets whether this test case is automatic.
	 *
	 * @param automatic the automatic of this test case
	 */
	public void setAutomatic(boolean automatic);

	/**
	 * Returns the after test case ID of this test case.
	 *
	 * @return the after test case ID of this test case
	 */
	public long getAfterTestCaseId();

	/**
	 * Sets the after test case ID of this test case.
	 *
	 * @param afterTestCaseId the after test case ID of this test case
	 */
	public void setAfterTestCaseId(long afterTestCaseId);

	/**
	 * Returns the steps of this test case.
	 *
	 * @return the steps of this test case
	 */
	@AutoEscape
	public String getSteps();

	/**
	 * Sets the steps of this test case.
	 *
	 * @param steps the steps of this test case
	 */
	public void setSteps(String steps);

	/**
	 * Returns the categroy ID of this test case.
	 *
	 * @return the categroy ID of this test case
	 */
	public long getCategroyId();

	/**
	 * Sets the categroy ID of this test case.
	 *
	 * @param categroyId the categroy ID of this test case
	 */
	public void setCategroyId(long categroyId);

	/**
	 * Returns the expected results of this test case.
	 *
	 * @return the expected results of this test case
	 */
	@AutoEscape
	public String getExpectedResults();

	/**
	 * Sets the expected results of this test case.
	 *
	 * @param expectedResults the expected results of this test case
	 */
	public void setExpectedResults(String expectedResults);

	/**
	 * Returns the developer of this test case.
	 *
	 * @return the developer of this test case
	 */
	@AutoEscape
	public String getDeveloper();

	/**
	 * Sets the developer of this test case.
	 *
	 * @param developer the developer of this test case
	 */
	public void setDeveloper(String developer);

	/**
	 * Returns the developer ID of this test case.
	 *
	 * @return the developer ID of this test case
	 */
	public long getDeveloperId();

	/**
	 * Sets the developer ID of this test case.
	 *
	 * @param developerId the developer ID of this test case
	 */
	public void setDeveloperId(long developerId);

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
	public int compareTo(TestCase testCase);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TestCase> toCacheModel();

	@Override
	public TestCase toEscapedModel();

	@Override
	public TestCase toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}