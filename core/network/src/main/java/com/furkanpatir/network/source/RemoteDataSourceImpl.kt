package com.furkanpatir.network.source

import com.furkanpatir.network.api.RickAndMortyApi
import com.furkanpatir.network.dto.CharacterDto
import com.furkanpatir.network.dto.GetAllCharacterResponse
import javax.inject.Inject

internal class RemoteDataSourceImpl @Inject constructor(
    private val api: RickAndMortyApi
) : RemoteDataSource {

    override suspend fun getAllCharacter(): GetAllCharacterResponse =
        api.getAllCharacter()


    override suspend fun getSingleCharacter(id: Int): CharacterDto =
        api.getSingleCharacter(id)

} 