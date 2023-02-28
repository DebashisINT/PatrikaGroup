package com.patrikagroup.features.location.api

import com.patrikagroup.features.location.shopdurationapi.ShopDurationApi
import com.patrikagroup.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}