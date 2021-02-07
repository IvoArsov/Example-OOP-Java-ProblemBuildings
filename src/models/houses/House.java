package models.houses;

import models.Building;

public abstract class House extends Building{
    private int rooms;
    private int numberOfPeople;
    private int floors;
    private double area;

    public House(boolean isInCity, int rooms, int numberOfPeople, int floors, double area) {
        super(isInCity);
        this.setRooms(rooms);
        this.setNumberOfPeople(numberOfPeople);
        this.setFloors(floors);
        this.setArea(area);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms <= 0){
            throw new IllegalArgumentException("Invalid value of rooms!");
        }
        this.rooms = rooms;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        if (numberOfPeople <= 0){
            throw new IllegalArgumentException("Invalid value of numberOfPeople!");
        }
        this.numberOfPeople = numberOfPeople;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        if (floors <= 0){
            throw new IllegalArgumentException("Invalid value of floors!");
        }
        this.floors = floors;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0){
            throw new IllegalArgumentException("Invalid value of area!");
        }
        this.area = area;
    }

    public abstract double calculateLandTax();
}
