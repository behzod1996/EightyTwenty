package uz.behzoddev.data_caching.entities;

import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import kotlinx.parcelize.Parcelize;
import java.time.Instant;

@androidx.room.Entity(tableName = "note_category")
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00061"}, d2 = {"Luz/behzoddev/data_caching/entities/NoteCategory;", "Landroid/os/Parcelable;", "id", "", "title", "", "timestamp", "", "count", "subCategory", "", "Luz/behzoddev/data_caching/entities/NoteSubCategory;", "(ILjava/lang/String;JJLjava/util/List;)V", "getCount", "()J", "setCount", "(J)V", "getId", "()I", "setId", "(I)V", "getSubCategory", "()Ljava/util/List;", "setSubCategory", "(Ljava/util/List;)V", "getTimestamp", "setTimestamp", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "data-caching_debug"})
public final class NoteCategory implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "note_category_id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private long timestamp;
    private long count;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<uz.behzoddev.data_caching.entities.NoteSubCategory> subCategory;
    public static final android.os.Parcelable.Creator<uz.behzoddev.data_caching.entities.NoteCategory> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final uz.behzoddev.data_caching.entities.NoteCategory copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, long timestamp, long count, @org.jetbrains.annotations.NotNull()
    java.util.List<uz.behzoddev.data_caching.entities.NoteSubCategory> subCategory) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NoteCategory() {
        super();
    }
    
    public NoteCategory(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, long timestamp, long count, @org.jetbrains.annotations.NotNull()
    java.util.List<uz.behzoddev.data_caching.entities.NoteSubCategory> subCategory) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getCount() {
        return 0L;
    }
    
    public final void setCount(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<uz.behzoddev.data_caching.entities.NoteSubCategory> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<uz.behzoddev.data_caching.entities.NoteSubCategory> getSubCategory() {
        return null;
    }
    
    public final void setSubCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<uz.behzoddev.data_caching.entities.NoteSubCategory> p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<uz.behzoddev.data_caching.entities.NoteCategory> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final uz.behzoddev.data_caching.entities.NoteCategory createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final uz.behzoddev.data_caching.entities.NoteCategory[] newArray(int size) {
            return null;
        }
    }
}