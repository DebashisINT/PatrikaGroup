package com.patrikagroup.features.viewAllOrder.interf

import com.patrikagroup.app.domain.NewOrderGenderEntity
import com.patrikagroup.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}