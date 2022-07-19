package com.example.core_data

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface CoreModule {

    @Binds
    fun providesDispatcherProviders(
        provider: DispatcherProviderImpl
    ): DispatcherProvider

}