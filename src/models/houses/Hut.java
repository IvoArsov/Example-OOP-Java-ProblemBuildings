package models.houses;

public class Hut extends House{
    public Hut(boolean isInCity, int rooms, int numberOfPeople, int floors, double area) {
        super(isInCity, rooms, numberOfPeople, floors, area);
    }

    @Override
    public double calculateLandTax() {
        return 10 * this.getArea();
    }

    @Override
    public String printTypeOfBuilding() {
        return "This is a " + this.getClass().getSimpleName() + " and is a type of " + super.getClass().getSuperclass().getSimpleName();
    }
}
