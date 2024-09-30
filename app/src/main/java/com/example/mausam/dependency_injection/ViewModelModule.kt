package com.example.mausam.dependency_injection

import com.example.mausam.fragments.home.HomeViewModel
import com.example.mausam.fragments.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {HomeViewModel(weatherDataRepository = get())}
    viewModel { LocationViewModel(weatherDataRepository = get()) }
}