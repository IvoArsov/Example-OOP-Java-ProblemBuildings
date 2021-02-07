package models.blocks;

public class BlockOfFlats extends Block {
    public BlockOfFlats(boolean isInCity, int rooms, int numberOfPeople) {
        super(isInCity, rooms, numberOfPeople);
    }

    @Override
    public double calculateWaterConsumptionPerMount() {
        return 20 * this.getNumberOfPeople();
    }

    @Override
    public String printTypeOfBuilding() {
        return "This is a " + this.getClass().getSimpleName() + " and is a type of " + super.getClass().getSuperclass().getSimpleName();
    }
}
