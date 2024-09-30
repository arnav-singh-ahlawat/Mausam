package com.example.mausam.utils

import android.app.Application
import com.example.mausam.dependency_injection.networkModule
import com.example.mausam.dependency_injection.repositoryModule
import com.example.mausam.dependency_injection.serializerModule
import com.example.mausam.dependency_injection.storageModule
import com.example.mausam.dependency_injection.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppConfig : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppConfig)
            modules(
                listOf(
                    repositoryModule,
                    viewModelModule,
                    serializerModule,
                    storageModule,
                    networkModule
                )
            )
        }
    }
}