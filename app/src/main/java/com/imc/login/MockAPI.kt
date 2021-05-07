package com.imc.login


import retrofit2.Call
import retrofit2.http.GET

interface MockAPI {
    @GET("api/v1/login")
    fun getmockapi(): Call<List<Model>>

}