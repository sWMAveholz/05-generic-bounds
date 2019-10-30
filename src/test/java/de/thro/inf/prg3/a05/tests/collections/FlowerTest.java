package de.thro.inf.prg3.a05.tests.collections;

import de.thro.inf.prg3.a05.collections.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FlowerTest {

    @Test
    void testConstructorFlower(){
        assertThrows(IllegalArgumentException.class, ()-> new Flower(10,"Iris","m", PlantColor.GREEN));
    }

    @Test
    void testConstructorShrub(){
        assertThrows(IllegalArgumentException.class, ()-> new Shrub(10,"Iris","m", PlantColor.RED));
    }

    @Test
    void testPlantBedByColor(){
        Flower f1 = new Flower(12,"a","a", PlantColor.RED);
        Flower f2 = new Flower(10,"b","b",PlantColor.BLUE);

        PlantBed b1 = new PlantBed();
        b1.add(f1);
        b1.add(f2);

        SimpleList<Plant> rb1 = b1.getPlantsByColor(PlantColor.RED);
        assertEquals(1,rb1.size());

    }


}
