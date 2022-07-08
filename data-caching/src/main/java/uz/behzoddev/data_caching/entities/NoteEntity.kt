package uz.behzoddev.data_caching.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.time.Instant

@Entity(
    tableName = "note",
    foreignKeys = [
        ForeignKey(
            onDelete = ForeignKey.SET_NULL,
            onUpdate = ForeignKey.CASCADE,
            entity = NoteCategory::class,
            parentColumns = ["id"],
            childColumns = ["note_category_id"]
        )
    ]
)
@Parcelize
data class NoteEntity(
    @ColumnInfo(name = "note_id")
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "note_title")
    val title: String,
    @ColumnInfo(name = "note_created_timestamp")
    val createdTimestamp: Long,
    @ColumnInfo(name = "note_modified_timestamp")
    val modifiedTimestamp: Long,
    @ColumnInfo(name = "note_description")
    val description: String,
    @ColumnInfo(name = "note_category_id", index = true)
    val categoryId: Long?,
    @ColumnInfo(name = "note_image")
    val image: String,
    @ColumnInfo(name = "note_is_deleted")
    val isDeleted: Boolean,
    @ColumnInfo(name = "note_quantity")
    val quantity: Long
): Parcelable


@Parcelize
data class Note(
    val id: Long = 0L,
    val title: String = "",
    val createdTimestamp: Long = Instant.now().epochSecond,
    val modifiedTimestamp: Long = Instant.now().epochSecond,
    val description: String = "",
    val categoryId: Long? = null,
    val image: String = "",
    val isDeleted: Boolean = false,
    val quantity: Long = 0L
): Parcelable