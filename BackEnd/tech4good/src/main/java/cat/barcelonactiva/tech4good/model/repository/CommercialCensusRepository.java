package cat.barcelonactiva.tech4good.model.repository;

import cat.barcelonactiva.tech4good.model.domain.CommercialCensus;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialCensusRepository extends MongoRepository<CommercialCensus, ObjectId> {

}
