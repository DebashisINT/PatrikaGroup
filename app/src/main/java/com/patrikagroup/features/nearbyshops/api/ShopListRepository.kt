package com.patrikagroup.features.nearbyshops.api

import com.patrikagroup.app.Pref
import com.patrikagroup.features.login.model.GetQtsAnsSubmitDtlsResponseModel
import com.patrikagroup.features.login.model.GetSecImageUploadResponseModel
import com.patrikagroup.features.login.model.productlistmodel.ModelListResponse
import com.patrikagroup.features.nearbyshops.model.*
import io.reactivex.Observable

/**
 * Created by Pratishruti on 28-11-2017.
 */
class ShopListRepository(val apiService: ShopListApi) {
    fun getShopList(sessiontoken: String, user_id: String): Observable<ShopListResponse> {
        return apiService.getShopList(sessiontoken, user_id)
    }

    fun getShopTypeList(): Observable<ShopTypeResponseModel> {
        return apiService.getShopTypeList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getShopTypeStockVisibilityList(): Observable<ShopTypeStockViewResponseModel> {
        return apiService.getShopTypeListStockView(Pref.session_token!!, Pref.user_id!!)
    }

    fun getModelList(): Observable<ModelListResponseModel> {
        return apiService.getModelList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getModelListNew(): Observable<ModelListResponse> {
        return apiService.getModelListNew(Pref.session_token!!, Pref.user_id!!)
    }

    fun getPrimaryAppList(): Observable<PrimaryAppListResponseModel> {
        return apiService.getPrimaryAppList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getSecondaryAppList(): Observable<SecondaryAppListResponseModel> {
        return apiService.getSecondaryAppList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getLeadTypeList(): Observable<LeadListResponseModel> {
        return apiService.getLeadList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getStagList(): Observable<StageListResponseModel> {
        return apiService.getStageList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getFunnelStageList(): Observable<FunnelStageListResponseModel> {
        return apiService.getFunnelStageList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getProsList(): Observable<ProsListResponseModel> {
        return apiService.getProsList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getQuestionAnsSubmitDetails(): Observable<GetQtsAnsSubmitDtlsResponseModel> {
        return apiService.getQuestionAnsSubmitDetails(Pref.session_token!!, Pref.user_id!!)
    }

    fun getSecUploadImages(): Observable<GetSecImageUploadResponseModel> {
        return apiService.getSecImageUpload(Pref.session_token!!, Pref.user_id!!)
    }

    fun getQuestionList(): Observable<QuesListResponseModel> {
        return apiService.getQuesList(Pref.session_token!!, Pref.user_id!!)
    }
}