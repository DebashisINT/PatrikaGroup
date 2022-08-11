package com.patrikagroup.features.newcollection.model

import com.patrikagroup.app.domain.CollectionDetailsEntity
import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}