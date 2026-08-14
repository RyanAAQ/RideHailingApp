package data.repositories;

import data.models.Ride;
import data.models.RideStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RideRepository extends MongoRepository<Ride, String> {

}
