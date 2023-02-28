package com.patrikagroup.features.viewAllOrder.interf

import com.patrikagroup.app.domain.NewOrderGenderEntity
import com.patrikagroup.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}