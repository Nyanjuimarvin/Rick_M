package com.nyanjuimarvin.firebaserickm.api

import com.nyanjuimarvin.firebaserickm.models.RickMortyResponse
import retrofit2.Call
import retrofit2.http.GET

interface RickMortyApi {
    @GET("character")
    fun getCharacter(): Call<RickMortyResponse>
}