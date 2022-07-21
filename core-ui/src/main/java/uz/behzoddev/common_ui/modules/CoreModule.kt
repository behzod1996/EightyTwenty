package uz.behzoddev.common_ui.modules

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import uz.behzoddev.common_ui.providers.StringProvider
import uz.behzoddev.common_ui.providers.StringProviderImpl

@Module
@InstallIn(ViewModelComponent::class)
interface CoreModule {

    @Binds
    fun providesStringProvider(
        provider: StringProviderImpl
    ): StringProvider
}