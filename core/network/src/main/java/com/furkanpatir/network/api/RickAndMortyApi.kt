package com.furkanpatir.network.api

import com.furkanpatir.network.dto.GetAllCharacterResponse
import com.furkanpatir.network.dto.CharacterDto
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyApi {

    @GET("character")
    suspend fun getAllCharacter(): GetAllCharacterResponse

    @GET("character/{id}")
    suspend fun getSingleCharacter(@Path("id") id: Int): CharacterDto
} 