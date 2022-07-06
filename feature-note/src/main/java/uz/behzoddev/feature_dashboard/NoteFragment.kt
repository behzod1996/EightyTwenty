package uz.behzoddev.feature_dashboard

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import uz.behzoddev.feature_dashboard.databinding.FragmentNoteBinding
import javax.inject.Inject

@AndroidEntryPoint
class NoteFragment : Fragment() {

    private var _binding: FragmentNoteBinding? = null
    private val binding: FragmentNoteBinding get() = _binding!!
    private val viewModel: NoteViewModel by viewModels()

    @Inject
    lateinit var navigator: NoteNavigator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setupUI()

        observeEvents()

    }

    private fun setupUI() {
        navigateToNewNote()
        navigateToCategory()
    }

    private fun observeEvents() = lifecycleScope.launchWhenCreated {
        viewModel.viewEffect.collect {
            observerNavigator(it)
        }


    }

    private fun observerNavigator(effect: NoteViewEffect) {
        when (effect) {
            NoteViewEffect.CategoryViewEffect -> {
                navigator.navigateToCategory()
            }
            NoteViewEffect.DetailViewEffect -> {

            }
            NoteViewEffect.NewNoteViewEffect -> {
                navigator.navigateToNewNote()
            }
            NoteViewEffect.SearchViewEffect -> {

            }
        }
    }

    private fun navigateToCategory() {
        binding.ivFolder.setOnClickListener {
            viewModel.onEvent(NoteEvent.CategoryViewEffect)
        }
    }

    private fun navigateToNewNote() {
        binding.btnNewNote.setOnClickListener {
            viewModel.onEvent(NoteEvent.NewNoteViewEffect)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }


}