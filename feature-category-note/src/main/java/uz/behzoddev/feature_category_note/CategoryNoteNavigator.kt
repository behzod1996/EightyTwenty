package uz.behzoddev.feature_category_note

import uz.behzoddev.common_ui.core.Navigator

interface CategoryNoteNavigator: Navigator {
    fun navigateToSearch()
    fun navigateToBack()
    fun navigateToNote()
    fun navigateToNewCategory()
}