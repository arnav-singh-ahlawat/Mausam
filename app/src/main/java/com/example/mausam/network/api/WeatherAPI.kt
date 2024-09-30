package com.example.mausam.network.api

import com.example.mausam.data.RemoteLocation
import com.example.mausam.data.RemoteWeatherData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    companion object {
        const val BASE_URL = "https://api.weatherapi.com/v1/"
        const val API_KEY = "af8b31b4147d4f07b12182140242509"
    }

    @GET("search.json")
    suspend fun searchLocation(
        @Query("key") key: String = API_KEY,
        @Query("q") query: String
    ) : Response<List<RemoteLocation>>

    @GET("forecast.json")
    suspend fun getWeatherData(
        @Query("key") key: String = API_KEY,
        @Query("q") query: String
    ): Response<RemoteWeatherData>
}