package com.patrikagroup.features.viewAllOrder.model

import com.patrikagroup.app.domain.NewOrderColorEntity
import com.patrikagroup.app.domain.NewOrderGenderEntity
import com.patrikagroup.app.domain.NewOrderProductEntity
import com.patrikagroup.app.domain.NewOrderSizeEntity
import com.patrikagroup.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

