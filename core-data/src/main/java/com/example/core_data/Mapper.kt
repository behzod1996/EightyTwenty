package com.example.core_data

interface Mapper<E, D> {
    fun toEntity(domain: D): E
    fun toDomain(entity: E): D
}