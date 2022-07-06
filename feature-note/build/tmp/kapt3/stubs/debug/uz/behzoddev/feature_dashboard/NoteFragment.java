package uz.behzoddev.feature_dashboard;

import android.os.Bundle;
import android.view.*;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import uz.behzoddev.feature_dashboard.databinding.FragmentNoteBinding;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010\'\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Luz/behzoddev/feature_dashboard/NoteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Luz/behzoddev/feature_dashboard/databinding/FragmentNoteBinding;", "binding", "getBinding", "()Luz/behzoddev/feature_dashboard/databinding/FragmentNoteBinding;", "navigator", "Luz/behzoddev/feature_dashboard/NoteNavigator;", "getNavigator", "()Luz/behzoddev/feature_dashboard/NoteNavigator;", "setNavigator", "(Luz/behzoddev/feature_dashboard/NoteNavigator;)V", "viewModel", "Luz/behzoddev/feature_dashboard/NoteViewModel;", "getViewModel", "()Luz/behzoddev/feature_dashboard/NoteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToCategory", "", "navigateToNewNote", "observeEvents", "Lkotlinx/coroutines/Job;", "observerNavigator", "effect", "Luz/behzoddev/feature_dashboard/NoteViewEffect;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setupUI", "feature-note_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NoteFragment extends androidx.fragment.app.Fragment {
    private uz.behzoddev.feature_dashboard.databinding.FragmentNoteBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public uz.behzoddev.feature_dashboard.NoteNavigator navigator;
    
    public NoteFragment() {
        super();
    }
    
    private final uz.behzoddev.feature_dashboard.databinding.FragmentNoteBinding getBinding() {
        return null;
    }
    
    private final uz.behzoddev.feature_dashboard.NoteViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uz.behzoddev.feature_dashboard.NoteNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull()
    uz.behzoddev.feature_dashboard.NoteNavigator p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final kotlinx.coroutines.Job observeEvents() {
        return null;
    }
    
    private final void observerNavigator(uz.behzoddev.feature_dashboard.NoteViewEffect effect) {
    }
    
    private final void navigateToCategory() {
    }
    
    private final void navigateToNewNote() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}