package uz.behzoddev.data_caching.entities.notes

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Relation
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryAndNotes(
    @Embedded val noteCategoryEntity: NoteCategoryEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "note_category_id"
    )
    val notes: List<NoteEntity>
): Parcelable
