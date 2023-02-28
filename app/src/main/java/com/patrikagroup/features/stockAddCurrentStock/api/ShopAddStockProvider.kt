package com.patrikagroup.features.stockAddCurrentStock.api

import com.patrikagroup.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.patrikagroup.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}