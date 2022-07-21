package com.example.domain.usecases.note

import com.example.domain.models.NoteDomainModel
import com.example.domain.repositories.NoteRepository
import javax.inject.Inject

class UpdateNoteImpl @Inject constructor(
    private val noteRepository: NoteRepository
) : UpdateNote {

    override suspend fun invoke(note: NoteDomainModel) {
        return noteRepository.updateNote(note)
    }

}