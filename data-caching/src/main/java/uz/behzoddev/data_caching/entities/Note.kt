package uz.behzoddev.data_caching.entities


data class Note(
    var id: Int = 0,
    var title: String = "",
    val timestamp: Long = System.currentTimeMillis(),
    val description: String = "",
    val category: NoteCategory? = null,
    val image: String = "",
    var isDeleted: Boolean = false,
    var quantity: Long = 0L
)
