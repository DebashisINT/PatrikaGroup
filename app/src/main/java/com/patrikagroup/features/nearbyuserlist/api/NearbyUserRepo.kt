package com.patrikagroup.features.nearbyuserlist.api

import com.patrikagroup.app.Pref
import com.patrikagroup.features.nearbyuserlist.model.NearbyUserResponseModel
import com.patrikagroup.features.newcollection.model.NewCollectionListResponseModel
import com.patrikagroup.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}