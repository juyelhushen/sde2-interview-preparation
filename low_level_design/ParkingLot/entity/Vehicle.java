package low_level_design.ParkingLot.entity;

import low_level_design.ParkingLot.enums.SpotType;
import low_level_design.ParkingLot.enums.VehicleType;

import java.util.List;

abstract public class Vehicle {
    private final String licensePlate;
    private final VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public abstract List<SpotType> getCompatibleSpot();

}
