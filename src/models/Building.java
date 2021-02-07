package models;

public abstract class Building {
    private boolean isInCity;

    public Building(boolean isInCity) {
        this.setInCity(isInCity);
    }

    public boolean isInCity() {
        return isInCity;
    }

    public void setInCity(boolean inCity) {
        isInCity = inCity;
    }

    public abstract String printTypeOfBuilding();
}
