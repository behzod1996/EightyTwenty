package uz.behzoddev.eightytwenty

import androidx.navigation.NavController
import uz.behzoddev.feature_dashboard.NoteNavigator
import javax.inject.Inject

class NoteNavigatorImpl @Inject constructor(
    private val navController: NavController
): NoteNavigator {

    override fun navigateToCategory() {
        navController.navigate(R.id.action_noteFragment2_to_categoryNoteFragment)
    }

    override fun navigateToSearch() {
        TODO("Not yet implemented")
    }

    override fun navigateToNewNote() {
        navController.navigate(R.id.action_noteFragment2_to_newNoteFragment)
    }

    override fun navigateToDetail() {
        TODO("Not yet implemented")
    }
}