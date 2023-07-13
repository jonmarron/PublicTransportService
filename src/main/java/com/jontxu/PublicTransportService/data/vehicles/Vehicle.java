package com.jontxu.PublicTransportService.data.vehicles;

import com.jontxu.PublicTransportService.data.FuelType;
import com.jontxu.PublicTransportService.data.Status;

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

    public Status getStatus(){
        long monthsSinceLastService = getLastService().until(LocalDate.now()).toTotalMonths();
        if(monthsSinceLastService <= 6){
            return Status.IN_OPERATION;
        } else if(monthsSinceLastService > 6 && monthsSinceLastService<=36){
            return Status.NEED_REPAIR;
        }
        return Status.FOR_SCRAP;
    };
    public abstract FuelType getFuelType();

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
}
