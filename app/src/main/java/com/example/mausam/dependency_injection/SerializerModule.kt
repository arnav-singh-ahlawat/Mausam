package com.example.mausam.dependency_injection

import com.google.gson.Gson
import org.koin.dsl.module
val serializerModule = module {
    single { Gson() }
}