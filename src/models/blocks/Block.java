package models.blocks;

import models.Building;

public abstract class Block extends Building {
    private int rooms;
    private int numberOfPeople;

    public Block(boolean isInCity, int rooms, int numberOfPeople) {
        super(isInCity);
        this.setRooms(rooms);
        this.setNumberOfPeople(numberOfPeople);
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

    public abstract double calculateWaterConsumptionPerMount();
}
