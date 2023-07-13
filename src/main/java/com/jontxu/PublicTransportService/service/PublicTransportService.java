package com.jontxu.PublicTransportService.service;

import com.jontxu.PublicTransportService.data.Status;
import com.jontxu.PublicTransportService.data.vehicles.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PublicTransportService {
    public List<Vehicle> vehiclesWithAStatus(List<Vehicle> vehicles, Status status){
        return vehicles.stream()
                .filter(vehicle -> vehicle.getStatus().equals(status))
                .collect(toList());
    }
}
