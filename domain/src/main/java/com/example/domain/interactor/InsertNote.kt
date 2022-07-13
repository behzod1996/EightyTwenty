package com.example.domain.interactor

import com.example.domain.models.NoteDomainModel

interface InsertNote {
    suspend operator fun invoke(note: NoteDomainModel): Long
}