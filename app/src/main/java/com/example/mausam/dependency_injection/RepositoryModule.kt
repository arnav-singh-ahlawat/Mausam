package com.example.mausam.dependency_injection

import com.example.mausam.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {WeatherDataRepository(weatherAPI = get())}
}