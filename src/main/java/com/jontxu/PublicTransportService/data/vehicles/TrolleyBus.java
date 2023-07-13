package com.jontxu.PublicTransportService.data.vehicles;

import com.jontxu.PublicTransportService.data.FuelType;

public class TrolleyBus extends Vehicle {
    public TrolleyBus(int id, String licensePlate, int maxCapacity) {
        super(id, licensePlate, maxCapacity);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.HYBRID;
    }
}
