package uz.behzoddev.data_caching.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import kotlinx.parcelize.Parcelize
import java.time.Instant

@Parcelize
@Entity(tableName = "note_category")
data class NoteCategory(
    @ColumnInfo(name = "note_category_id")
    var id: Int = 0,
    var title: String = "",
    var timestamp: Long = Instant.now().epochSecond,
    var count: Long = 0L,
    var subCategory: List<NoteSubCategory> = listOf()
):Parcelable
