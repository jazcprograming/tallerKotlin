package com.example.tallerkotlin

import retrofit2.Response
import retrofit2.http.GET


interface Servicios {

    @GET("frutas")
    suspend fun getFrutas():Response<List<Frutas>>

}