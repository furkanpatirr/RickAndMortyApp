package com.furkanpatir.network.source

import com.furkanpatir.common.NetworkResponseState
import com.furkanpatir.network.api.RickAndMortyApi
import com.furkanpatir.network.dto.CharacterDto
import com.furkanpatir.network.dto.GetAllCharacterResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class RemoteDataSourceImpl @Inject constructor(
    private val api: RickAndMortyApi
) : RemoteDataSource {

    override suspend fun getAllCharacter(): Flow<NetworkResponseState<GetAllCharacterResponse>> =
        flow {
            emit(NetworkResponseState.Loading)
            try {
                val response = api.getAllCharacter()
                emit(NetworkResponseState.Success(response))
            } catch (e: Exception) {
                emit(NetworkResponseState.Error(e))
            }
        }


    override suspend fun getSingleCharacter(id: Int): Flow<NetworkResponseState<CharacterDto>> =
        flow {
            emit(NetworkResponseState.Loading)
            try {
                val response = api.getSingleCharacter(id)
                emit(NetworkResponseState.Success(response))
            } catch (e: Exception) {
                emit(NetworkResponseState.Error(e))
            }
        }
}