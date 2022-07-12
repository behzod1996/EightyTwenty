package uz.behzoddev.data_caching.mapper

import com.example.core_data.Mapper
import com.example.domain.models.NoteCategoryDomainModel
import uz.behzoddev.data_caching.entities.notes.NoteCategoryEntity

class NoteCategoryMapper: Mapper<NoteCategoryEntity,NoteCategoryDomainModel> {

    override fun toEntity(domain: NoteCategoryDomainModel): NoteCategoryEntity {
        return NoteCategoryEntity(
            id = domain.id,
            name = domain.name,
            count = domain.count
        )
    }

    override fun toDomain(entity: NoteCategoryEntity): NoteCategoryDomainModel {
        return NoteCategoryDomainModel(
            id = entity.id,
            name = entity.name,
            count = entity.count
        )
    }

    companion object {
        fun create(): NoteCategoryMapper {
            return NoteCategoryMapper()
        }
    }
}