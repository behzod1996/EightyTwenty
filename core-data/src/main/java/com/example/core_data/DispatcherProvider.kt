package com.example.core_data

import kotlinx.coroutines.CoroutineDispatcher

interface DispatcherProvider : Provider {

    val io: CoroutineDispatcher
    val main: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher

}