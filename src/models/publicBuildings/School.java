package models.publicBuildings;

public class School extends PublicBuilding {

    public School(boolean isInCity) {
        super(isInCity);
    }

    @Override
    public String printTypeOfBuilding() {
        return "This is a " + this.getClass().getSimpleName() + " and is a type of " + super.getClass().getSuperclass().getSimpleName();
    }
}
