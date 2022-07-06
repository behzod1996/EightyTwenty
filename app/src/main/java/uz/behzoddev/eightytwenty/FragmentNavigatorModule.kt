package uz.behzoddev.eightytwenty

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import uz.behzoddev.feature_dashboard.NoteNavigator

@Module
@InstallIn(FragmentComponent::class)
interface FragmentNavigatorModule {

    @Binds
    fun providesNoteNavigator(
        navigator: NoteNavigatorImpl
    ): NoteNavigator
}