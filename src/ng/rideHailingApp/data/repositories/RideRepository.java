package ng.rideHailingApp.data.repositories;

import ng.rideHailingApp.data.models.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RideRepository extends MongoRepository<Ride, String> {

}
