package org.example;

public class Main {
    public static void main(String[] args) {
        Ship cargoShip = new CargoShip("CargoShip", "Ireland", 1000);
        cargoShip.getDescription();
        cargoShip.getSpeed();
        CargoShip cargoShipPlus = new CargoShipPlus("CargoShipPlus", "Sweden", 1000, 2);
        cargoShipPlus.getDescription();
        cargoShipPlus.getSpeed();
        Tanker tanker = new Tanker("Tanker", "USA", 300);
        tanker.getDescription();
        tanker.getDestination();
    }
}