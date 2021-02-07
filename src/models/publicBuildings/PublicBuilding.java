package models.publicBuildings;

import models.Building;

public abstract class PublicBuilding extends Building {

    public PublicBuilding(boolean isInCity) {
        super(isInCity);
    }
}
