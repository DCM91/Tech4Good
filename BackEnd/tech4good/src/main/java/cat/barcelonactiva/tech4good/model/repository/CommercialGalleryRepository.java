package cat.barcelonactiva.tech4good.model.repository;

import cat.barcelonactiva.tech4good.model.domain.CommercialGallery;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommercialGalleryRepository extends MongoRepository<CommercialGallery, ObjectId> {

}
