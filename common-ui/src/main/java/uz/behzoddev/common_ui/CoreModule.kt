package uz.behzoddev.common_ui

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface CoreModule {

    @Binds
    fun providesStringProvider(
        provider: StringProviderImpl
    ): StringProvider
}