package com.patrikagroup.features.weather.api

import com.patrikagroup.base.BaseResponse
import com.patrikagroup.features.task.api.TaskApi
import com.patrikagroup.features.task.model.AddTaskInputModel
import com.patrikagroup.features.weather.model.ForeCastAPIResponse
import com.patrikagroup.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}