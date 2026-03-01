package com.example.weather_now.Domain.Repository

import com.example.weather_now.Domain.Util.Resource
import com.example.weather_now.Domain.Weather.WeatherInfo

interface Weather_Repository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}