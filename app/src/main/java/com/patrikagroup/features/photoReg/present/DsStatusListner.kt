package com.patrikagroup.features.photoReg.present

import com.patrikagroup.app.domain.ProspectEntity
import com.patrikagroup.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}