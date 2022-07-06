package uz.behzoddev.data_caching.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NoteSubCategory(
    var id: Int = 0,
    var title: String = "",
    var timestamp: Long = System.currentTimeMillis(),
    var description: String = ""
): Parcelable
