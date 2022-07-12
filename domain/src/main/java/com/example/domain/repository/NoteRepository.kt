package com.example.domain.repository

import com.example.domain.models.NoteDomainModel
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insertNote(note: NoteDomainModel): Long

    suspend fun updateNote(note: NoteDomainModel)

    suspend fun delete(note: NoteDomainModel)

    fun fetchTrashedNotes(): Flow<List<NoteDomainModel>>

    fun fetchAllNotes(): Flow<List<NoteDomainModel>>
}