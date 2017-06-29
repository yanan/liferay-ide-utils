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
 * The base model interface for the Release service. Represents a row in the &quot;qualitytrack_Release&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ide.utils.quality.track.model.impl.ReleaseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ide.utils.quality.track.model.impl.ReleaseImpl}.
 * </p>
 *
 * @author Terry Jia
 * @see Release
 * @see com.liferay.ide.utils.quality.track.model.impl.ReleaseImpl
 * @see com.liferay.ide.utils.quality.track.model.impl.ReleaseModelImpl
 * @generated
 */
@ProviderType
public interface ReleaseModel extends BaseModel<Release>, GroupedModel,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a release model instance should use the {@link Release} interface instead.
	 */

	/**
	 * Returns the primary key of this release.
	 *
	 * @return the primary key of this release
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this release.
	 *
	 * @param primaryKey the primary key of this release
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the release ID of this release.
	 *
	 * @return the release ID of this release
	 */
	public long getReleaseId();

	/**
	 * Sets the release ID of this release.
	 *
	 * @param releaseId the release ID of this release
	 */
	public void setReleaseId(long releaseId);

	/**
	 * Returns the group ID of this release.
	 *
	 * @return the group ID of this release
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this release.
	 *
	 * @param groupId the group ID of this release
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this release.
	 *
	 * @return the company ID of this release
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this release.
	 *
	 * @param companyId the company ID of this release
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this release.
	 *
	 * @return the user ID of this release
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this release.
	 *
	 * @param userId the user ID of this release
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this release.
	 *
	 * @return the user uuid of this release
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this release.
	 *
	 * @param userUuid the user uuid of this release
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this release.
	 *
	 * @return the user name of this release
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this release.
	 *
	 * @param userName the user name of this release
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this release.
	 *
	 * @return the create date of this release
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this release.
	 *
	 * @param createDate the create date of this release
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this release.
	 *
	 * @return the modified date of this release
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this release.
	 *
	 * @param modifiedDate the modified date of this release
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the release name of this release.
	 *
	 * @return the release name of this release
	 */
	@AutoEscape
	public String getReleaseName();

	/**
	 * Sets the release name of this release.
	 *
	 * @param releaseName the release name of this release
	 */
	public void setReleaseName(String releaseName);

	/**
	 * Returns the release date of this release.
	 *
	 * @return the release date of this release
	 */
	public Date getReleaseDate();

	/**
	 * Sets the release date of this release.
	 *
	 * @param releaseDate the release date of this release
	 */
	public void setReleaseDate(Date releaseDate);

	/**
	 * Returns the is default of this release.
	 *
	 * @return the is default of this release
	 */
	public boolean getIsDefault();

	/**
	 * Returns <code>true</code> if this release is is default.
	 *
	 * @return <code>true</code> if this release is is default; <code>false</code> otherwise
	 */
	public boolean isIsDefault();

	/**
	 * Sets whether this release is is default.
	 *
	 * @param isDefault the is default of this release
	 */
	public void setIsDefault(boolean isDefault);

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
	public int compareTo(Release release);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Release> toCacheModel();

	@Override
	public Release toEscapedModel();

	@Override
	public Release toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}