package com.slngl.cryptocurrency.domain.repository

import com.slngl.cryptocurrency.data.remote.dto.CoinDetailDto
import com.slngl.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}