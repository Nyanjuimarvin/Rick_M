package com.nyanjuimarvin.firebaserickm.models

import com.google.gson.annotations.SerializedName

data class RickMortyResponse (

	@SerializedName("info") val info : Info,
	@SerializedName("results") val results : List<Results>
)