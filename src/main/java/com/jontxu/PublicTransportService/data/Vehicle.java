package com.jontxu.PublicTransportService.data;

import java.time.LocalDate;

public abstract class Vehicle {
    private final int id;
    private final String licensePlate;
    private final int maxCapacity;
    private LocalDate lastService;

    public Vehicle(int id, String licensePlate, int maxCapacity) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.maxCapacity = maxCapacity;
    }

    public int getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public LocalDate getLastService() {
        return lastService;
    }

    public void setLastService(LocalDate lastService) {
        this.lastService = lastService;
    }

    public abstract Status getStatus();
    public abstract FuelType getFuelType();
}
