/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ScmType.
 */
public final class ScmType {
    /** Static value None for ScmType. */
    public static final ScmType NONE = new ScmType("None");

    /** Static value Dropbox for ScmType. */
    public static final ScmType DROPBOX = new ScmType("Dropbox");

    /** Static value Tfs for ScmType. */
    public static final ScmType TFS = new ScmType("Tfs");

    /** Static value LocalGit for ScmType. */
    public static final ScmType LOCAL_GIT = new ScmType("LocalGit");

    /** Static value GitHub for ScmType. */
    public static final ScmType GIT_HUB = new ScmType("GitHub");

    /** Static value CodePlexGit for ScmType. */
    public static final ScmType CODE_PLEX_GIT = new ScmType("CodePlexGit");

    /** Static value CodePlexHg for ScmType. */
    public static final ScmType CODE_PLEX_HG = new ScmType("CodePlexHg");

    /** Static value BitbucketGit for ScmType. */
    public static final ScmType BITBUCKET_GIT = new ScmType("BitbucketGit");

    /** Static value BitbucketHg for ScmType. */
    public static final ScmType BITBUCKET_HG = new ScmType("BitbucketHg");

    /** Static value ExternalGit for ScmType. */
    public static final ScmType EXTERNAL_GIT = new ScmType("ExternalGit");

    /** Static value ExternalHg for ScmType. */
    public static final ScmType EXTERNAL_HG = new ScmType("ExternalHg");

    /** Static value OneDrive for ScmType. */
    public static final ScmType ONE_DRIVE = new ScmType("OneDrive");

    /** Static value VSO for ScmType. */
    public static final ScmType VSO = new ScmType("VSO");

    private String value;

    /**
     * Creates a custom value for ScmType.
     * @param value the custom value
     */
    public ScmType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ScmType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ScmType rhs = (ScmType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
