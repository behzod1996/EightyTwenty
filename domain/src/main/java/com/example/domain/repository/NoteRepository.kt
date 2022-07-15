package com.example.domain.repository

import com.example.core_data.Resource
import com.example.domain.models.NoteDomainModel
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insertNote(note: NoteDomainModel): Long

    suspend fun updateNote(note: NoteDomainModel)

    suspend fun delete(note: NoteDomainModel)

    fun fetchTrashedNotes(): Flow<Resource<List<NoteDomainModel>>>

    fun fetchAllNotes(): Flow<Resource<List<NoteDomainModel>>>
}