package com.example.tallerkotlin

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Repositorio {

    object RepositorioRetrofit{
        const val BASE_URL="https://my-json-server.typicode.com/jazcprograming/pruebas/"

        fun getService():Servicios{
            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build().create(Servicios::class.java)
        }



    }


}