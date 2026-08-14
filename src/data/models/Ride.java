package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "rides")
public class Ride {
    @Id
    private String rideId;
    private RideStatus status;
    private String pickupLocation;
    private String dropLocation;
    private double price;

    @DBRef
    private Rider rider;

    @DBRef
    private Driver driver;

    @DBRef
    private Payment payment;
}
