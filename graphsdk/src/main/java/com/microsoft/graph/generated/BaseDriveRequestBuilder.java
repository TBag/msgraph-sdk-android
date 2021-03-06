// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Request Builder.
 */
public class BaseDriveRequestBuilder extends BaseRequestBuilder implements IBaseDriveRequestBuilder {

    /**
     * The request builder for the Drive
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDriveRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IDriveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IDriveRequest buildRequest(final List<Option> options) {
        return new DriveRequest(getRequestUrl(), getClient(), options);
    }

    public IDriveItemCollectionRequestBuilder getItems() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IDriveItemRequestBuilder getItems(final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public IDriveItemCollectionRequestBuilder getSpecial() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("special"), getClient(), null);
    }

    public IDriveItemRequestBuilder getSpecial(final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("special") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem.
     */
    public IDriveItemRequestBuilder getRoot() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("root"), getClient(), null);
    }

    public IDriveRecentCollectionRequestBuilder getRecent() {
        return new DriveRecentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recent"), getClient(), null);
    }

    public IDriveSharedWithMeCollectionRequestBuilder getSharedWithMe() {
        return new DriveSharedWithMeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sharedWithMe"), getClient(), null);
    }
}
