package com.patrikagroup.features.viewAllOrder.interf

import com.patrikagroup.app.domain.NewOrderColorEntity
import com.patrikagroup.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}