package uz.behzoddev.feature_dashboard

import uz.behzoddev.common_ui.core.Navigator

interface NoteNavigator : Navigator {
    fun navigateToCategory()
    fun navigateToSearch()
    fun navigateToNewNote()
    fun navigateToDetail()
}
