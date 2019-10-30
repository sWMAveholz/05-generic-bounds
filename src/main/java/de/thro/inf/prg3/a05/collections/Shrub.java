package de.thro.inf.prg3.a05.collections;

public class Shrub extends Plant{

    public Shrub(double high, String family, String name, PlantColor color){
        super(high, family, name);
        if(color != PlantColor.GREEN){
            throw new IllegalArgumentException("Shrub is not green.");
        }
        this.color = color;

    }
}
