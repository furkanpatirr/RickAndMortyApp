package com.furkanpatir.network.dto

data class GetAllCharacterResponse(
    val info: Info,
    val results: List<CharacterDto>
)