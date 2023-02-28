package com.patrikagroup.features.viewAllOrder.interf

import com.patrikagroup.app.domain.NewOrderProductEntity
import com.patrikagroup.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}