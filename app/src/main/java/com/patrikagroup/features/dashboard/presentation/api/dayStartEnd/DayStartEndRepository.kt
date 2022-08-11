package com.patrikagroup.features.dashboard.presentation.api.dayStartEnd

import com.patrikagroup.app.Pref
import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.dashboard.presentation.model.DaystartDayendRequest
import com.patrikagroup.features.dashboard.presentation.model.StatusDayStartEnd
import com.patrikagroup.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.patrikagroup.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}