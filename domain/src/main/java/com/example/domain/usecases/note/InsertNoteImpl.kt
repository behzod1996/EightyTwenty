package com.example.domain.usecases.note

import com.example.domain.models.NoteDomainModel
import com.example.domain.repositories.NoteCategoryRepository
import com.example.domain.repositories.NoteRepository
import javax.inject.Inject

class InsertNoteImpl @Inject constructor(
    private val noteRepository: NoteRepository,
    private val noteCategoryRepository: NoteCategoryRepository
) : InsertNote {

    override suspend fun invoke(note: NoteDomainModel) {
        noteCategoryRepository.incrementNoteCount(note.categoryId)
        noteRepository.insertNote(note)
    }
}