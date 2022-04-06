package com.nyanjuimarvin.firebaserickm.api

import com.nyanjuimarvin.firebaserickm.constants.Constants.Companion.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    fun getClient():RickMortyApi{

        val client = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val myRequest = chain.request().newBuilder()
                    .build()
                chain.proceed(myRequest)
            }
            .build()


        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(
            GsonConverterFactory.create())
            .build();

        return retrofit.create(RickMortyApi::class.java)
    }

}