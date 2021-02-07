package models.publicBuildings;

public class Bank extends PublicBuilding {

    public Bank(boolean isInCity) {
        super(isInCity);
    }

    @Override
    public String printTypeOfBuilding() {
        return "This is a " + this.getClass().getSimpleName() + " and is a type of " + super.getClass().getSuperclass().getSimpleName();
    }
}
