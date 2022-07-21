package com.example.domain.usecases.note

import com.example.domain.models.NoteDomainModel

interface DeleteNote {
    suspend operator fun invoke(note: NoteDomainModel)
}