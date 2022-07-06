package uz.behzoddev.feature_dashboard

sealed class NoteEvent {
    object NewNoteViewEffect: NoteEvent()
    object CategoryViewEffect: NoteEvent()
    object DetailViewEffect: NoteEvent()
    object SearchViewEffect: NoteEvent()
}
