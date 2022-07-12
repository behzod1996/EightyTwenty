package uz.behzoddev.data_caching.mapper

import com.example.core_data.Mapper
import com.example.domain.models.NoteDomainModel
import uz.behzoddev.data_caching.entities.notes.NoteEntity

class NoteMapper: Mapper<NoteEntity,NoteDomainModel> {

    override fun toEntity(domain: NoteDomainModel): NoteEntity {
        return NoteEntity(
            id = domain.id,
            title = domain.title,
            description = domain.description,
            timestamp = domain.timestamp,
            isTrashed = domain.isTrashed,
            categoryId = domain.categoryId
        )
    }

    override fun toDomain(entity: NoteEntity): NoteDomainModel {
        return NoteDomainModel(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            timestamp = entity.timestamp,
            isTrashed = entity.isTrashed,
            categoryId = entity.categoryId
        )
    }

    companion object {
        fun create(): NoteMapper {
            return NoteMapper()
        }
    }
}