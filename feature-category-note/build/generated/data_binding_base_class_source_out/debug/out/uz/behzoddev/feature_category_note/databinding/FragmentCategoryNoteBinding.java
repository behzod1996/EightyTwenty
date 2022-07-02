// Generated by view binder compiler. Do not edit!
package uz.behzoddev.feature_category_note.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.behzoddev.feature_category_note.R;

public final class FragmentCategoryNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton btnNewCategory;

  @NonNull
  public final FloatingActionButton btnNewCategoryNote;

  @NonNull
  public final FloatingActionButton btnNewSubCategory;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivSearch;

  private FragmentCategoryNoteBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton btnNewCategory,
      @NonNull FloatingActionButton btnNewCategoryNote,
      @NonNull FloatingActionButton btnNewSubCategory, @NonNull ImageView ivBack,
      @NonNull ImageView ivSearch) {
    this.rootView = rootView;
    this.btnNewCategory = btnNewCategory;
    this.btnNewCategoryNote = btnNewCategoryNote;
    this.btnNewSubCategory = btnNewSubCategory;
    this.ivBack = ivBack;
    this.ivSearch = ivSearch;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCategoryNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCategoryNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_category_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCategoryNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_new_category;
      FloatingActionButton btnNewCategory = ViewBindings.findChildViewById(rootView, id);
      if (btnNewCategory == null) {
        break missingId;
      }

      id = R.id.btn_new_category_note;
      FloatingActionButton btnNewCategoryNote = ViewBindings.findChildViewById(rootView, id);
      if (btnNewCategoryNote == null) {
        break missingId;
      }

      id = R.id.btn_new_sub_category;
      FloatingActionButton btnNewSubCategory = ViewBindings.findChildViewById(rootView, id);
      if (btnNewSubCategory == null) {
        break missingId;
      }

      id = R.id.iv_back;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.iv_search;
      ImageView ivSearch = ViewBindings.findChildViewById(rootView, id);
      if (ivSearch == null) {
        break missingId;
      }

      return new FragmentCategoryNoteBinding((ConstraintLayout) rootView, btnNewCategory,
          btnNewCategoryNote, btnNewSubCategory, ivBack, ivSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
