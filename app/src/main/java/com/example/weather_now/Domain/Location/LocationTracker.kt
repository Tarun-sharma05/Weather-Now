package com.example.weather_now.Domain.Location

import android.location.Location

interface LocationTracker {
      suspend fun getCurrentLocation(): Location?

}