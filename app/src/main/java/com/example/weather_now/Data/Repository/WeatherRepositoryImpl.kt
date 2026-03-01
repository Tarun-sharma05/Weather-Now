package com.example.weather_now.Data.Repository

import android.util.Log


import com.example.weather_now.Data.Remote.WeatherAPI
import com.example.weather_now.Domain.Repository.Weather_Repository
import com.example.weather_now.Domain.Util.Resource
import com.example.weather_now.Domain.Weather.WeatherInfo
import javax.inject.Inject
import com.example.weather_now.Data.Mappers.toWeatherInfo

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
): Weather_Repository{
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(

          data = api.getWeatherData(
              lat = lat,
              long = long
          ).toWeatherInfo()
            )
        }catch (e: Exception){


            Log.e("WeatherRepositoryImpl", "Error fetching weather data", e)

            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}


