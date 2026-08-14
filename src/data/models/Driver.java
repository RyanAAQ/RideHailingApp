package data.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class Driver extends User {
    private String licenseNumber;
    private DriverStatus status;
    private String vehiclePlate;
}
