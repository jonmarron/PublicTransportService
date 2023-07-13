package com.jontxu.PublicTransportService.data;

import com.jontxu.PublicTransportService.data.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public final class Route {
    private final List<Station> stations;
    private final List<Vehicle> vehicles;
    public Route(List<Station> stations) {
        this.stations = stations;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        if(vehicle.getStatus().equals(Status.IN_OPERATION)){
            vehicles.add(vehicle);
        } else {
            throw new IllegalArgumentException("The vehicle must be in operation.");
        }
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
    public List<Station> getStations() {
        return stations;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
