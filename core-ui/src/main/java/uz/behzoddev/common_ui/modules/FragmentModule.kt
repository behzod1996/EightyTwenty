package uz.behzoddev.common_ui.modules

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import uz.behzoddev.common_ui.extensions.navController

@Module
@InstallIn(FragmentComponent::class)
object FragmentModule {

    @Provides
    fun providesNavController(
        fragment: Fragment
    ): NavController {
        return fragment.navController
    }
}