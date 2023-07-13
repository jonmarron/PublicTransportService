package com.jontxu.PublicTransportService.data.vehicles;

import com.jontxu.PublicTransportService.data.FuelType;

public class Tram extends Vehicle {
    private int yearsInService;

    public int getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }

    public Tram(int id, String licensePlate, int maxCapacity) {
        super(id, licensePlate, maxCapacity);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.ELECTRIC;
    }
}
