package com.example.core_data

import com.example.core_common.Provider
import kotlinx.coroutines.CoroutineDispatcher

interface DispatcherProvider : Provider {

    val io: CoroutineDispatcher
    val main: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher

}