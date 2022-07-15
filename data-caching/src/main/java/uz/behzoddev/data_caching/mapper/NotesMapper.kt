package uz.behzoddev.data_caching.mapper

import com.example.core_data.Mapper
import com.example.domain.models.NoteDomainModel
import uz.behzoddev.data_caching.entities.notes.NoteEntity
import javax.inject.Inject

class NotesMapper @Inject constructor(
    private val noteMapper: NoteMapper
): Mapper<List<NoteEntity>,List<NoteDomainModel>> {

    override fun toEntity(domains: List<NoteDomainModel>): List<NoteEntity> {
        val entities = ArrayList<NoteEntity>()
        for (domain in domains) {
            entities.add(noteMapper.toEntity(domain))
        }
        return entities
    }

    override fun toDomain(entities: List<NoteEntity>): List<NoteDomainModel> {
        val domains = ArrayList<NoteDomainModel>()
        for (entity in entities) {
            domains.add(noteMapper.toDomain(entity))
        }
        return domains
    }

}
