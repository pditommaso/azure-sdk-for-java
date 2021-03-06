// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.trafficmanager.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource model definition for a ARM proxy resource. It will have everything other than required location and
 * tags.
 */
public class ProxyResourceInner {
    /** Gets or sets the ID. */
    @JsonProperty(value = "id")
    private String id;

    /** Gets or sets the name. */
    @JsonProperty(value = "name")
    private String name;

    /** Gets or sets the type. */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ProxyResourceInner object itself.
     */
    public ProxyResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ProxyResourceInner object itself.
     */
    public ProxyResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ProxyResourceInner object itself.
     */
    public ProxyResourceInner withType(String type) {
        this.type = type;
        return this;
    }
}
