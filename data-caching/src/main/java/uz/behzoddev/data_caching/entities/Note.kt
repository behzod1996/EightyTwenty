package uz.behzoddev.data_caching.entities

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize
import java.time.Instant

@Entity(
    tableName = "note_tb"
)
@Parcelize
data class Note(
    var id: Int = 0,
    var title: String = "",
    val createdTimestamp: Long = Instant.now().epochSecond,
    val modifiedTimestamp: Long = Instant.now().epochSecond,
    val description: String = "",
    val category: NoteCategory? = null,
    val image: String = "",
    var isDeleted: Boolean = false,
    var quantity: Long = 0L
): Parcelable
