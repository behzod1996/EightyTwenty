package uz.behzoddev.data_caching.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.behzoddev.data_caching.LocalDataSource
import uz.behzoddev.data_caching.LocalDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun providesLocalDataSource(
        source: LocalDataSourceImpl
    ): LocalDataSource
}