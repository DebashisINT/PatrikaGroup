package com.patrikagroup.features.dashboard.presentation.api.dayStartEnd

import com.patrikagroup.features.stockCompetetorStock.api.AddCompStockApi
import com.patrikagroup.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}