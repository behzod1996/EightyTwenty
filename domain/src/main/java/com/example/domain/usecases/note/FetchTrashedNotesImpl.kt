package com.example.domain.usecases.note

import com.example.core_data.Resource
import com.example.domain.models.NoteDomainModel
import com.example.domain.repositories.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchTrashedNotesImpl @Inject constructor(
    private val noteRepo: NoteRepository
): FetchTrashedNotes {

    override fun invoke(): Flow<Resource<List<NoteDomainModel>>> {
        return noteRepo.fetchTrashedNotes()
    }
}