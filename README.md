# Hoen Scanner - Car Rental and Hotel Search Microservice

A Dropwizard-based microservice that provides search functionality for car rentals and hotels in various cities.

## Features

- RESTful API endpoint for searching car rentals and hotels
- Filters results by city name (case-insensitive)
- Combines data from two JSON datasets:
  - `rental_cars.json`
  - `hotels.json`
- Uses Jackson for JSON serialization/deserialization

## Prerequisites

- Java OpenJDK 19
- Maven 3.6+
- IntelliJ IDEA (recommended) or another Java IDE
- Git
- Postman (for API testing)
