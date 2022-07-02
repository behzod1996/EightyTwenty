package uz.behzoddev.feature_dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Luz/behzoddev/feature_dashboard/NoteNavigator;", "Luz/behzoddev/common_ui/core/Navigator;", "navigateToCategory", "", "navigateToDetail", "navigateToNewNote", "navigateToSearch", "feature-note_debug"})
public abstract interface NoteNavigator extends uz.behzoddev.common_ui.core.Navigator {
    
    public abstract void navigateToCategory();
    
    public abstract void navigateToSearch();
    
    public abstract void navigateToNewNote();
    
    public abstract void navigateToDetail();
}