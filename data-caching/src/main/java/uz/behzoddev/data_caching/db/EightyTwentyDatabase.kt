package uz.behzoddev.data_caching.db

import android.content.Context
import androidx.room.*
import uz.behzoddev.data_caching.converter.ZoneDateTimeConverter
import uz.behzoddev.data_caching.dao.NoteCategoryDao
import uz.behzoddev.data_caching.dao.NoteDao
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity
import uz.behzoddev.data_caching.entities.notes.NoteEntity

@Database(
    entities = [NoteCategoryEntity::class,NoteEntity::class],
    version = 1
)
@TypeConverters(
    ZoneDateTimeConverter::class
)
abstract class EightyTwentyDatabase : RoomDatabase() {

    abstract fun getNoteCategoryDao(): NoteCategoryDao
    abstract fun getNoteDao(): NoteDao

    companion object {

        @Volatile
        private var INSTANCE: EightyTwentyDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK) {
            INSTANCE ?: createDatabase(context).also { INSTANCE = it }
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            EightyTwentyDatabase::class.java,
            "eighty_twenty_database"
        ).build()

    }
}