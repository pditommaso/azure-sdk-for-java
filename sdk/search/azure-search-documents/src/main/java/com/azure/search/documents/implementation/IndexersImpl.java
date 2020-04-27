// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.search.documents.implementation.models.ListIndexersResult;
import com.azure.search.documents.models.Indexer;
import com.azure.search.documents.models.IndexerExecutionInfo;
import com.azure.search.documents.models.RequestOptions;
import com.azure.search.documents.models.SearchErrorException;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Indexers.
 */
public final class IndexersImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private IndexersService service;

    /**
     * The service client containing this operation class.
     */
    private SearchServiceRestClientImpl client;

    /**
     * Initializes an instance of IndexersImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public IndexersImpl(SearchServiceRestClientImpl client) {
        this.service = RestProxy.create(IndexersService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SearchServiceRestClientIndexers to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceRestClientIndexers")
    private interface IndexersService {
        @Post("indexers('{indexerName}')/search.reset")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> reset(@PathParam("indexerName") String indexerName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("indexers('{indexerName}')/search.run")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> run(@PathParam("indexerName") String indexerName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Put("indexers('{indexerName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Indexer>> createOrUpdate(@PathParam("indexerName") String indexerName, @HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") Indexer indexer, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("Prefer") String prefer, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Delete("indexers('{indexerName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(@PathParam("indexerName") String indexerName, @HostParam("endpoint") String endpoint, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("indexers('{indexerName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Indexer>> get(@PathParam("indexerName") String indexerName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("indexers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<ListIndexersResult>> list(@HostParam("endpoint") String endpoint, @QueryParam("$select") String select, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("indexers")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Indexer>> create(@HostParam("endpoint") String endpoint, @BodyParam("application/json; charset=utf-8") Indexer indexer, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("indexers('{indexerName}')/search.status")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<IndexerExecutionInfo>> getStatus(@PathParam("indexerName") String indexerName, @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Resets the change tracking state associated with an indexer.
     *
     * @param indexerName The name of the indexer to reset.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetWithRestResponseAsync(String indexerName, Context context) {
        final UUID xMsClientRequestId = null;
        return service.reset(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Resets the change tracking state associated with an indexer.
     *
     * @param indexerName The name of the indexer to reset.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resetWithRestResponseAsync(String indexerName, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.reset(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Runs an indexer on-demand.
     *
     * @param indexerName The name of the indexer to run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> runWithRestResponseAsync(String indexerName, Context context) {
        final UUID xMsClientRequestId = null;
        return service.run(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Runs an indexer on-demand.
     *
     * @param indexerName The name of the indexer to run.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> runWithRestResponseAsync(String indexerName, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.run(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new indexer or updates an indexer if it already exists.
     *
     * @param indexerName The name of the indexer to create or update.
     * @param indexer The definition of the indexer to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Indexer>> createOrUpdateWithRestResponseAsync(String indexerName, Indexer indexer, Context context) {
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String prefer = "return=representation";
        final UUID xMsClientRequestId = null;
        return service.createOrUpdate(indexerName, this.client.getEndpoint(), indexer, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new indexer or updates an indexer if it already exists.
     *
     * @param indexerName The name of the indexer to create or update.
     * @param indexer The definition of the indexer to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Indexer>> createOrUpdateWithRestResponseAsync(String indexerName, Indexer indexer, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String prefer = "return=representation";
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.createOrUpdate(indexerName, this.client.getEndpoint(), indexer, ifMatch, ifNoneMatch, prefer, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Deletes an indexer.
     *
     * @param indexerName The name of the indexer to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String indexerName, Context context) {
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final UUID xMsClientRequestId = null;
        return service.delete(indexerName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Deletes an indexer.
     *
     * @param indexerName The name of the indexer to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the server does not match this value.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithRestResponseAsync(String indexerName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.delete(indexerName, this.client.getEndpoint(), ifMatch, ifNoneMatch, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves an indexer definition.
     *
     * @param indexerName The name of the indexer to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Indexer>> getWithRestResponseAsync(String indexerName, Context context) {
        final UUID xMsClientRequestId = null;
        return service.get(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves an indexer definition.
     *
     * @param indexerName The name of the indexer to retrieve.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Indexer>> getWithRestResponseAsync(String indexerName, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.get(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Lists all indexers available for a search service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListIndexersResult>> listWithRestResponseAsync(Context context) {
        final String select = null;
        final UUID xMsClientRequestId = null;
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Lists all indexers available for a search service.
     *
     * @param select Selects which top-level properties of the indexers to retrieve. Specified as a comma-separated list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListIndexersResult>> listWithRestResponseAsync(String select, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.list(this.client.getEndpoint(), select, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new indexer.
     *
     * @param indexer The definition of the indexer to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Indexer>> createWithRestResponseAsync(Indexer indexer, Context context) {
        final UUID xMsClientRequestId = null;
        return service.create(this.client.getEndpoint(), indexer, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Creates a new indexer.
     *
     * @param indexer The definition of the indexer to create.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Indexer>> createWithRestResponseAsync(Indexer indexer, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.create(this.client.getEndpoint(), indexer, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Returns the current status and execution history of an indexer.
     *
     * @param indexerName The name of the indexer for which to retrieve status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IndexerExecutionInfo>> getStatusWithRestResponseAsync(String indexerName, Context context) {
        final UUID xMsClientRequestId = null;
        return service.getStatus(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Returns the current status and execution history of an indexer.
     *
     * @param indexerName The name of the indexer for which to retrieve status.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IndexerExecutionInfo>> getStatusWithRestResponseAsync(String indexerName, RequestOptions requestOptions, Context context) {
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.getStatus(indexerName, this.client.getEndpoint(), this.client.getApiVersion(), xMsClientRequestId, context);
    }
}
