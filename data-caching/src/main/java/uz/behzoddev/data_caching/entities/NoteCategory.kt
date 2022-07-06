package uz.behzoddev.data_caching.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.Instant

@Parcelize
data class NoteCategory(
    var id: Int = 0,
    var title: String = "",
    var description: Note? = null,
    var timestamp: Long = Instant.now().epochSecond,
    var count: Long = 0L,
    var type: String = "",
    var subCategory: List<NoteSubCategory> = listOf()
):Parcelable
