package data.repositories;

import data.models.Driver;
import data.models.DriverStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {

}
