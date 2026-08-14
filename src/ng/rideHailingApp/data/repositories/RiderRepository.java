package ng.rideHailingApp.data.repositories;

import ng.rideHailingApp.data.models.Rider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RiderRepository extends MongoRepository<Rider, String> {

}
