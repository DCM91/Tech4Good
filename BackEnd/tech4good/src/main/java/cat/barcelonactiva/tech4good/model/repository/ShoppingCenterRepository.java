package cat.barcelonactiva.tech4good.model.repository;

import cat.barcelonactiva.tech4good.model.domain.ShoppingCenter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingCenterRepository extends MongoRepository<ShoppingCenter, ObjectId> {

}
