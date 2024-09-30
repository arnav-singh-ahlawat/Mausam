package com.example.mausam.dependency_injection

import com.example.mausam.storage.SharedPreferencesManager
import org.koin.dsl.module

val storageModule = module {
    single { SharedPreferencesManager(context = get(), gson = get())}
}