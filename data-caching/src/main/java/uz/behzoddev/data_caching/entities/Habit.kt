package uz.behzoddev.data_caching.entities

data class Habit(
    var id: Int = 0,
    var title: String = "",
    var frequency: String = "",
    var description: String = "",
    var color: String = "",
    var isCompleted: Boolean = false,
    var totalCount: Int = 0,
)
