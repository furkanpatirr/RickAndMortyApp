package com.furkanpatir.network.source

import com.furkanpatir.network.dto.CharacterDto
import com.furkanpatir.network.dto.GetAllCharacterResponse

interface RemoteDataSource {
    suspend fun getAllCharacter(): GetAllCharacterResponse
    suspend fun getSingleCharacter(id: Int): CharacterDto
} 