package de.thro.inf.prg3.a05.collections;

import java.util.Iterator;

public class PlantBed<T extends Plant>  {

    SimpleList<T> plants;

    public PlantBed(){
        plants = new SimpleListImpl<T>();
    }

    public void add(T p){
        plants.add(p);
    }

    public int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
         return plants.filter(new SimpleFilter<T>() {
            @Override
            public boolean include(T item) {
                if(item.color == color) return true;
                return false;
            }
        });

    }
}

