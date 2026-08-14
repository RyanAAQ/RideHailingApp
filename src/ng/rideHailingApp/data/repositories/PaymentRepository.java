package ng.rideHailingApp.data.repositories;

import ng.rideHailingApp.data.models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {

}
