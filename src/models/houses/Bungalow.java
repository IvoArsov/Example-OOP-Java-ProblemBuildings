package models.houses;

public class Bungalow extends House{
    public Bungalow(boolean isInCity, int rooms, int numberOfPeople, int floors, double area) {
        super(isInCity, rooms, numberOfPeople, floors, area);
    }

    @Override
    public String printTypeOfBuilding() {
        return "This is a " + this.getClass().getSimpleName() + " and is a type of " + super.getClass().getSuperclass().getSimpleName();
    }

    @Override
    public double calculateLandTax() {
        return 10 * this.getArea();
    }
}
