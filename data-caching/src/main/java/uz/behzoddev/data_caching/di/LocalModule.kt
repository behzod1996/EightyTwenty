package uz.behzoddev.data_caching.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.behzoddev.data_caching.dao.NoteCategoryDao
import uz.behzoddev.data_caching.dao.NoteDao
import uz.behzoddev.data_caching.db.EightyTwentyDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun providesRoomInstance(@ApplicationContext context: Context): EightyTwentyDatabase {
        return EightyTwentyDatabase.invoke(context)
    }

    @Provides
    @Singleton
    fun providesNoteCategoryDao(database: EightyTwentyDatabase): NoteDao {
        return database.getNoteDao()
    }

    @Provides
    @Singleton
    fun providesNoteDao(database: EightyTwentyDatabase): NoteCategoryDao {
        return database.getNoteCategoryDao()
    }

}