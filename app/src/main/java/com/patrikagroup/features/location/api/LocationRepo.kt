package com.patrikagroup.features.location.api

import com.patrikagroup.app.Pref
import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.location.model.AppInfoInputModel
import com.patrikagroup.features.location.model.AppInfoResponseModel
import com.patrikagroup.features.location.model.ShopDurationRequest
import com.patrikagroup.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}