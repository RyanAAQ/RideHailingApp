# Ride-Hailing App

The domain model and data layer for a ride-hailing platform (think Uber or Bolt), written in **Java** with **Spring Data MongoDB**. It defines the people, rides and payments such a platform needs, and the repositories to save and find them. The design was drawn up first as UML diagrams, which are included in this repo.

This project covers the **model and persistence layer**. There is no web API or user interface yet.

## What it models

A rider requests a ride, a driver accepts it, the ride goes through its stages, and a payment is recorded. An admin manages the platform.

### People

All users share a base `User` (id, username, password, phone, email), and each role extends it:

| Class | What it adds |
|---|---|
| **Rider** | Someone who books rides |
| **Driver** | Licence number, vehicle plate number, and a status (`ACTIVE` or `INACTIVE`) |
| **Admin** | Platform administrator |

### Rides

A `Ride` records the pickup location, drop-off location, price, who the rider and driver are, and its payment. It moves through these statuses:

`REQUESTED` → `ACCEPTED` → `PENDING` → `DRIVER_ARRIVING` → `DRIVER_ARRIVED` → `COMPLETED` (or `CANCELLED`)

### Payments

A `Payment` records the amount, the payment method, its status, and links to the rider who paid and the driver who was paid.

## How it is built

```
src/ng/rideHailingApp/data/
├── models/         User, Rider, Driver, Admin, Ride, Payment, RideStatus, DriverStatus
└── repositories/   One Spring Data MongoDB repository per model
```

- Object-oriented design with inheritance: `Rider`, `Driver` and `Admin` all extend `User`.
- Enums (`RideStatus`, `DriverStatus`) keep statuses to a fixed set of valid values.
- Rides and payments link to riders and drivers with MongoDB document references.
- Each domain has its own repository, which keeps booking, driver status and payment handling separate.

## Design diagrams

The system was planned in draw.io before it was coded. Open these files at [app.diagrams.net](https://app.diagrams.net):

- `Class diagram.drawio` shows the classes and how they relate
- `UseCaseRideHailing.drawio` shows what riders, drivers and admins can do

## Tech stack

Java, Spring Data MongoDB, MongoDB, Lombok, Maven, UML (draw.io)

## Next steps

- Service layer for requesting, accepting and completing rides
- REST controllers
- Password hashing and authentication
