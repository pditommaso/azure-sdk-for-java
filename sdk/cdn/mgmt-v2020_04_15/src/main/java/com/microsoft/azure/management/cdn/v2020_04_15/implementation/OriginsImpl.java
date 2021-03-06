/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_04_15.Origins;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_04_15.Origin;

class OriginsImpl extends WrapperImpl<OriginsInner> implements Origins {
    private final CdnManager manager;

    OriginsImpl(CdnManager manager) {
        super(manager.inner().origins());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public OriginImpl define(String name) {
        return wrapModel(name);
    }

    private OriginImpl wrapModel(OriginInner inner) {
        return  new OriginImpl(inner, manager());
    }

    private OriginImpl wrapModel(String name) {
        return new OriginImpl(name, this.manager());
    }

    @Override
    public Observable<Origin> listByEndpointAsync(final String resourceGroupName, final String profileName, final String endpointName) {
        OriginsInner client = this.inner();
        return client.listByEndpointAsync(resourceGroupName, profileName, endpointName)
        .flatMapIterable(new Func1<Page<OriginInner>, Iterable<OriginInner>>() {
            @Override
            public Iterable<OriginInner> call(Page<OriginInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OriginInner, Origin>() {
            @Override
            public Origin call(OriginInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Origin> getAsync(String resourceGroupName, String profileName, String endpointName, String originName) {
        OriginsInner client = this.inner();
        return client.getAsync(resourceGroupName, profileName, endpointName, originName)
        .flatMap(new Func1<OriginInner, Observable<Origin>>() {
            @Override
            public Observable<Origin> call(OriginInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Origin)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String profileName, String endpointName, String originName) {
        OriginsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, profileName, endpointName, originName).toCompletable();
    }

}
