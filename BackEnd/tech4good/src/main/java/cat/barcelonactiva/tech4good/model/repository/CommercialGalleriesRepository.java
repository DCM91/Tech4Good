package cat.barcelonactiva.tech4good.model.repository;

import cat.barcelonactiva.tech4good.model.domain.CommercialCensus;
import cat.barcelonactiva.tech4good.model.domain.CommercialGalleries;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommercialGalleriesRepository extends MongoRepository<CommercialGalleries, ObjectId> {

}
