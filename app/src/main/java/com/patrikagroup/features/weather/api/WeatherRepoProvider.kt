package com.patrikagroup.features.weather.api

import com.patrikagroup.features.task.api.TaskApi
import com.patrikagroup.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}