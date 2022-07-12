package uz.behzoddev.data_caching.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.behzoddev.data_caching.mapper.NoteCategoryMapper
import uz.behzoddev.data_caching.mapper.NoteMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MapperModule {

    @Provides
    @Singleton
    fun providesNoteMapper(): NoteMapper {
        return NoteMapper.create()
    }

    @Provides
    @Singleton
    fun providesNoteCategoryMapper(): NoteCategoryMapper {
        return NoteCategoryMapper.create()
    }
}