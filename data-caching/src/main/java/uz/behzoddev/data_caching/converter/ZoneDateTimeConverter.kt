package uz.behzoddev.data_caching.converter

import androidx.room.TypeConverter
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class ZoneDateTimeConverter {

    @TypeConverter
    fun fromZoneDateTime(timestamp: ZonedDateTime): String {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault())
        return formatter.format(timestamp)
    }

    @TypeConverter
    fun toZoneDateTime(timestamp: String): ZonedDateTime {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault())
        return ZonedDateTime.parse(timestamp, formatter)
    }
}