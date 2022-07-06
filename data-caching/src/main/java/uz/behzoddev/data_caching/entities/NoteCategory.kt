package uz.behzoddev.data_caching.entities

import java.time.Instant

data class NoteCategory(
    var id: Int = 0,
    var title: String = "",
    var description: Note? = null,
    var timestamp: Long = Instant.now().epochSecond,
    var count: Long = 0L,
    var type: String = "",
    var subCategory: List<NoteSubCategory> = listOf()
)
