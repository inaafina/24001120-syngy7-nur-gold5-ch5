public class Car extends Vehicle {
    private double fuelCapacity;
    private String transmissionType;

    public Car(double fuelCapacity, String transmissionType) {
        super(4); // Cars generally have 4 wheels
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
    }

    public void changeTransmission(String newTransmission) {
        this.transmissionType = newTransmission;
        System.out.println("Transmission changed to: " + newTransmission);
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
