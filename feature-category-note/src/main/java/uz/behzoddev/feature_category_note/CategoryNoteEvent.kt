package uz.behzoddev.feature_category_note

sealed class CategoryNoteEvent {
    object BackEvent: CategoryNoteEvent()
    object SearchEvent: CategoryNoteEvent()
    object NewCategoryEvent: CategoryNoteEvent()
    object NoteEvent: CategoryNoteEvent()
}
