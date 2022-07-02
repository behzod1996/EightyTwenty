package uz.behzoddev.data_caching.entities

data class NoteCategory(
    var id: Int = 0,
    var title: String = "",
    var description: Note? = null,
    var timestamp: Long = System.currentTimeMillis(),
    var count: Long = 0L,
    var type: String,
    var subCategory: List<NoteSubCategory>? = null
)
