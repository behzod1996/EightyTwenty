package com.example.domain.usecases.note_category

import com.example.domain.models.CategoryAndNotesDomainModel
import com.example.domain.models.NoteCategoryDomainModel
import com.example.domain.repositories.NoteCategoryRepository
import com.example.domain.repositories.NoteRepository
import javax.inject.Inject

class DeleteNoteCategoryAndMoveNoteToTrashFolderImpl @Inject constructor(
    private val noteRepo: NoteRepository,
    private val noteCategoryRepo: NoteCategoryRepository
): DeleteNoteCategoryAndMoveNoteToTrashFolder {

    override suspend fun invoke(params: CategoryAndNotesDomainModel) {
        for(param in params.notes) {
            val trashedNotes = param.copy(isTrashed = true)
            noteRepo.updateNote(trashedNotes)
        }
        noteCategoryRepo.deleteNoteCategory(params.noteCategory)
    }
}