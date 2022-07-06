package uz.behzoddev.feature_dashboard

sealed class NoteViewEffect {
    object NewNoteViewEffect: NoteViewEffect()
    object CategoryViewEffect: NoteViewEffect()
    object DetailViewEffect: NoteViewEffect()
    object SearchViewEffect: NoteViewEffect()
}