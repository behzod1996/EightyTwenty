package uz.behzoddev.data_caching.entities.notes

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.core_data.Empty
import kotlinx.parcelize.Parcelize


@Entity(
    tableName = "note_category_table",
    indices = [Index(value = ["name"], unique = true)]
)
@Parcelize
data class NoteCategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = Long.Empty,
    @ColumnInfo(name = "note_category_name")
    val name: String = String.Empty,
    @ColumnInfo(name = "note_category_count")
    val count: Int = Int.Empty
): Parcelable
