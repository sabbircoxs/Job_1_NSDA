package com.example.job_1_nsda

import retrofit2.http.GET

interface ApiService {

    @GET("products")
    suspend fun getProducts():List<Product>

}