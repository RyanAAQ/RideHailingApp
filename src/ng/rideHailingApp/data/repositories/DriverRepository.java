package ng.rideHailingApp.data.repositories;

import ng.rideHailingApp.data.models.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {

}
