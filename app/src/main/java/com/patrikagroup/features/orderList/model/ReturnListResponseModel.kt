package com.patrikagroup.features.orderList.model

import com.patrikagroup.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}