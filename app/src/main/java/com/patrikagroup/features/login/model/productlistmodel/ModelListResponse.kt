package com.patrikagroup.features.login.model.productlistmodel

import com.patrikagroup.app.domain.ModelEntity
import com.patrikagroup.app.domain.ProductListEntity
import com.patrikagroup.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}