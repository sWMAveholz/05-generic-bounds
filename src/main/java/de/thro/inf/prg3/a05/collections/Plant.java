package de.thro.inf.prg3.a05.collections;

public abstract class Plant implements Comparable <Plant> {
    protected double high;
    protected String family;
    protected String name;
    protected  PlantColor color;

    public Plant(double high, String family, String name){
        this.high = high;
        this.family = family;
        this.name = name;
    }

    public double getHigh(){
        return high;
    }

    public String getFamily(){
        return family;
    }

    public String getName(){
        return name;
    }

    public PlantColor getColor(){
        return color;
    }

    @Override
    public int compareTo (Plant t){
        Double i = Double.valueOf(this.high);
        Double j = Double.valueOf(t.high);

        return i.compareTo(j);
    }


}
