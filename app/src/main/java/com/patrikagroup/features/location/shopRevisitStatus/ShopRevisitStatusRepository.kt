package com.patrikagroup.features.location.shopRevisitStatus

import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.location.model.ShopDurationRequest
import com.patrikagroup.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}