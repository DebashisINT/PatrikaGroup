package com.patrikagroup.features.newcollectionreport

import com.patrikagroup.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}