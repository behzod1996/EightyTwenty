package com.example.domain.usecases.note

import com.example.domain.models.NoteDomainModel
import com.example.domain.repositories.NoteCategoryRepository
import com.example.domain.repositories.NoteRepository
import javax.inject.Inject

class DeleteNoteImpl @Inject constructor(
    private val noteRepo: NoteRepository,
    private val noteCategoryRepo: NoteCategoryRepository
): DeleteNote {

    override suspend fun invoke(note: NoteDomainModel) {
        if (!note.isTrashed) {
            noteCategoryRepo.decrementNoteCount(note.categoryId)
        } else {
            noteRepo.delete(note)
        }
    }

}