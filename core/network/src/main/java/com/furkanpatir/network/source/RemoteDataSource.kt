package com.furkanpatir.network.source

import com.furkanpatir.common.NetworkResponseState
import com.furkanpatir.network.dto.CharacterDto
import com.furkanpatir.network.dto.GetAllCharacterResponse
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    suspend fun getAllCharacter(): Flow<NetworkResponseState<GetAllCharacterResponse>>
    suspend fun getSingleCharacter(id: Int): Flow<NetworkResponseState<CharacterDto>>
} 