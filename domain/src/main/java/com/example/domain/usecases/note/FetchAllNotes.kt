package com.example.domain.usecases.note

import com.example.core_data.Resource
import com.example.domain.models.NoteDomainModel
import kotlinx.coroutines.flow.Flow

interface FetchAllNotes {
    operator fun invoke(): Flow<Resource<List<NoteDomainModel>>>
}