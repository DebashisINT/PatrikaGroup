package com.patrikagroup.features.location.shopRevisitStatus

import com.patrikagroup.features.location.shopdurationapi.ShopDurationApi
import com.patrikagroup.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}