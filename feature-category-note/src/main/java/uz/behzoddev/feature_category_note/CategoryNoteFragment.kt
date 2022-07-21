package uz.behzoddev.feature_category_note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import uz.behzoddev.common_ui.extensions.hide
import uz.behzoddev.common_ui.extensions.show
import uz.behzoddev.feature_category_note.databinding.FragmentCategoryNoteBinding

@AndroidEntryPoint
class CategoryNoteFragment: Fragment(){

    private var _binding: FragmentCategoryNoteBinding? = null
    private val binding: FragmentCategoryNoteBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryNoteBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
    }


    private fun setupUI() {
        binding.btnNewCategoryNote.setOnClickListener {
            binding.btnNewCategory.show()
            binding.btnNewSubCategory.show()
            binding.btnNewCategoryNote.hide()
            binding.btnCancel.show()
        }
        binding.btnCancel.setOnClickListener {
            binding.btnNewCategory.hide()
            binding.btnNewSubCategory.hide()
            binding.btnCancel.hide()
            binding.btnNewCategoryNote.show()
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}