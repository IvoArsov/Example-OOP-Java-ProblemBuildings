import models.blocks.Block;
import models.blocks.Skyscraper;
import models.houses.House;
import models.houses.Hut;


public class Test {

    public static void main(String[] args) {
        try{
            House hut = new Hut(true, 4, 3,1, 74.15);
            Block skyscraper = new Skyscraper(false, 500, 2312);

            System.out.println(hut.printTypeOfBuilding() + ". There are " + hut.getNumberOfPeople() + " people living here.");
            System.out.println(skyscraper.printTypeOfBuilding() + ". The consumption of water per month is: " + Math.round(skyscraper.calculateWaterConsumptionPerMount()) + " liters." );
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
