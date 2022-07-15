package com.example.core_data

import java.lang.Exception

suspend fun <T>execute(block: suspend() -> T): Resource<T> {
    return try {
        Resource.Success(block.invoke())
    } catch (e: Exception) {
        Resource.Failure(e.message.toString())
    }
}