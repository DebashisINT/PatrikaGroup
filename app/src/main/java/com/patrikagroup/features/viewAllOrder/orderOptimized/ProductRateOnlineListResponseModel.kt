package com.patrikagroup.features.viewAllOrder.orderOptimized

import com.patrikagroup.app.domain.ProductOnlineRateTempEntity
import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}