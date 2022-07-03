package uz.behzoddev.feature_dashboard;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Luz/behzoddev/feature_dashboard/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_viewEffect", "Lkotlinx/coroutines/channels/Channel;", "Luz/behzoddev/feature_dashboard/NoteViewEffect;", "viewEffect", "Lkotlinx/coroutines/flow/Flow;", "getViewEffect", "()Lkotlinx/coroutines/flow/Flow;", "onEvent", "", "event", "Luz/behzoddev/feature_dashboard/NoteEvent;", "setNoteViewEffects", "effect", "feature-note_debug"})
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.channels.Channel<uz.behzoddev.feature_dashboard.NoteViewEffect> _viewEffect;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<uz.behzoddev.feature_dashboard.NoteViewEffect> viewEffect = null;
    
    @javax.inject.Inject()
    public NoteViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<uz.behzoddev.feature_dashboard.NoteViewEffect> getViewEffect() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    uz.behzoddev.feature_dashboard.NoteEvent event) {
    }
    
    private final void setNoteViewEffects(uz.behzoddev.feature_dashboard.NoteViewEffect effect) {
    }
}