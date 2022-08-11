package com.patrikagroup.features.lead.api

import com.patrikagroup.features.NewQuotation.api.GetQuotListRegRepository
import com.patrikagroup.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}