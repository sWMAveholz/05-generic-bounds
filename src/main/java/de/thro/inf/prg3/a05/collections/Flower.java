package de.thro.inf.prg3.a05.collections;

public class Flower extends Plant {
    public Flower(double high, String family, String name, PlantColor color){
        super(high,family,name);
        if(color == PlantColor.GREEN){
            throw new IllegalArgumentException("Plant can´t be green.");
        }
        this.color = color;
    }

}
