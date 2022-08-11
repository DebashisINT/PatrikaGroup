package com.patrikagroup.features.stockCompetetorStock.api

import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.orderList.model.NewOrderListResponseModel
import com.patrikagroup.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.patrikagroup.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}