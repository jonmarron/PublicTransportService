package com.jontxu.PublicTransportService.data.vehicles;

import com.jontxu.PublicTransportService.data.FuelType;
import com.jontxu.PublicTransportService.data.Status;

import java.time.LocalDate;

public class Bus extends Vehicle {
    private int pollutionIndicator;

    public Bus(int id, String licensePlate, int maxCapacity) {
        super(id, licensePlate, maxCapacity);
    }

    public void setPollutionIndicator(int pollutionIndicator) {
        this.pollutionIndicator = pollutionIndicator;
    }

    public int getPollutionIndicator() {
        return pollutionIndicator;
    }

    @Override
    public Status getStatus() {
        long totalMonths = getLastService().until(LocalDate.now()).toTotalMonths();
        if(totalMonths <= 6 && pollutionIndicator > 5){
            return Status.IN_OPERATION;
        }
        if(totalMonths <= 12 && (pollutionIndicator >= 3 || pollutionIndicator <= 5)){
            return Status.NEED_REPAIR;
        }
        return Status.FOR_SCRAP;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GAS;
    }
}
