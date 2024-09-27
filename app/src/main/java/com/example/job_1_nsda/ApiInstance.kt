package com.example.job_1_nsda

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiService = retrofit.create(ApiService::class.java)

}