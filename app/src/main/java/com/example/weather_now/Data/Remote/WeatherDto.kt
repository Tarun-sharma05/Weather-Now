package com.example.weather_now.Data.Remote

import com.squareup.moshi.Json

data class WeatherDto (
      @field:Json(name = "hourly")
     val weatherData: WeatherDataDto
)