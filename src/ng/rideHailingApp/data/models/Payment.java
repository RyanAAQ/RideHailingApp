package ng.rideHailingApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "payments")
public class Payment {
    @Id
    private String paymentId;
    private double amount;
    private String method;
    private String status;

    @DBRef
    private Rider rider;

    @DBRef
    private Driver driver;
}
