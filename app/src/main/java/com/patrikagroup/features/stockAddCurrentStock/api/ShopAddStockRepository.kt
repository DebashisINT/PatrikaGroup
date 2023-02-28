package com.patrikagroup.features.stockAddCurrentStock.api

import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.location.model.ShopRevisitStatusRequest
import com.patrikagroup.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.patrikagroup.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.patrikagroup.features.stockAddCurrentStock.model.CurrentStockGetData
import com.patrikagroup.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}