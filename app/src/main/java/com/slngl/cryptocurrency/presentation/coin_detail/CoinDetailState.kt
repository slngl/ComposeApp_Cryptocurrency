package com.slngl.cryptocurrency.presentation.coin_detail

import com.slngl.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = "",
)