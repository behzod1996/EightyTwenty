package uz.behzoddev.data_caching.entities

data class NoteSubCategory(
    var id: Int = 0,
    var title: String = "",
    var timestamp: Long = System.currentTimeMillis(),
    var description: String = ""
)
