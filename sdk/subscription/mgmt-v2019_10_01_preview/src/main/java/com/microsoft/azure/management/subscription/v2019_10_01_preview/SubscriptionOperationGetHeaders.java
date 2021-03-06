/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Get operation.
 */
public class SubscriptionOperationGetHeaders {
    /**
     * The URL where the status of the asynchronous operation can be checked.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * The amount of delay to use while the status of the operation is checked.
     * The value is expressed in seconds.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get the URL where the status of the asynchronous operation can be checked.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the URL where the status of the asynchronous operation can be checked.
     *
     * @param location the location value to set
     * @return the SubscriptionOperationGetHeaders object itself.
     */
    public SubscriptionOperationGetHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the amount of delay to use while the status of the operation is checked. The value is expressed in seconds.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the amount of delay to use while the status of the operation is checked. The value is expressed in seconds.
     *
     * @param retryAfter the retryAfter value to set
     * @return the SubscriptionOperationGetHeaders object itself.
     */
    public SubscriptionOperationGetHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
