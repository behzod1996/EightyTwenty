package uz.behzoddev.feature_category_note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Luz/behzoddev/feature_category_note/CategoryNoteEvent;", "", "()V", "BackEvent", "NewCategoryEvent", "NoteEvent", "SearchEvent", "Luz/behzoddev/feature_category_note/CategoryNoteEvent$BackEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent$SearchEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent$NewCategoryEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent$NoteEvent;", "feature-category-note_debug"})
public abstract class CategoryNoteEvent {
    
    private CategoryNoteEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/behzoddev/feature_category_note/CategoryNoteEvent$BackEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent;", "()V", "feature-category-note_debug"})
    public static final class BackEvent extends uz.behzoddev.feature_category_note.CategoryNoteEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uz.behzoddev.feature_category_note.CategoryNoteEvent.BackEvent INSTANCE = null;
        
        private BackEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/behzoddev/feature_category_note/CategoryNoteEvent$SearchEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent;", "()V", "feature-category-note_debug"})
    public static final class SearchEvent extends uz.behzoddev.feature_category_note.CategoryNoteEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uz.behzoddev.feature_category_note.CategoryNoteEvent.SearchEvent INSTANCE = null;
        
        private SearchEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/behzoddev/feature_category_note/CategoryNoteEvent$NewCategoryEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent;", "()V", "feature-category-note_debug"})
    public static final class NewCategoryEvent extends uz.behzoddev.feature_category_note.CategoryNoteEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uz.behzoddev.feature_category_note.CategoryNoteEvent.NewCategoryEvent INSTANCE = null;
        
        private NewCategoryEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/behzoddev/feature_category_note/CategoryNoteEvent$NoteEvent;", "Luz/behzoddev/feature_category_note/CategoryNoteEvent;", "()V", "feature-category-note_debug"})
    public static final class NoteEvent extends uz.behzoddev.feature_category_note.CategoryNoteEvent {
        @org.jetbrains.annotations.NotNull()
        public static final uz.behzoddev.feature_category_note.CategoryNoteEvent.NoteEvent INSTANCE = null;
        
        private NoteEvent() {
            super();
        }
    }
}