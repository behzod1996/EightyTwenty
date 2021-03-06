package uz.behzoddev.feature_dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(): ViewModel() {

    private var _viewEffect = Channel<NoteViewEffect>(Channel.BUFFERED)
    val viewEffect: Flow<NoteViewEffect> = _viewEffect.receiveAsFlow()

    fun onEvent(event: NoteEvent) {
        when(event) {
            NoteEvent.CategoryViewEffect -> {
                setNoteViewEffects(NoteViewEffect.CategoryViewEffect)
            }
            NoteEvent.DetailViewEffect -> {
                setNoteViewEffects(NoteViewEffect.DetailViewEffect)
            }
            NoteEvent.NewNoteViewEffect -> {
                setNoteViewEffects(NoteViewEffect.NewNoteViewEffect)
            }
            NoteEvent.SearchViewEffect -> {
                setNoteViewEffects(NoteViewEffect.SearchViewEffect)
            }
        }
    }

    private fun setNoteViewEffects(effect: NoteViewEffect) {
        viewModelScope.launch {
            when(effect) {
                NoteViewEffect.CategoryViewEffect -> {
                    _viewEffect.trySend(NoteViewEffect.CategoryViewEffect)
                }
                NoteViewEffect.DetailViewEffect -> {
                    _viewEffect.trySend(NoteViewEffect.DetailViewEffect)
                }
                NoteViewEffect.NewNoteViewEffect -> {
                    _viewEffect.trySend(NoteViewEffect.NewNoteViewEffect)
                }
                NoteViewEffect.SearchViewEffect -> {
                    _viewEffect.trySend(NoteViewEffect.SearchViewEffect)
                }
            }
        }

    }
}