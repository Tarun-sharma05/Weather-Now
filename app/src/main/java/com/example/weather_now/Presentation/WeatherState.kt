package com.example.weather_now.Presentation

import com.example.weather_now.Domain.Weather.WeatherInfo

data class WeatherState (
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error:String? = null
)