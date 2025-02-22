package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal implements Rideable {
    private boolean isMounted;
    private boolean isRidden;
    List<Edible> eatList = new ArrayList<Edible>();

    public void eat(Edible edible, Integer qty) {
        hasEaten = true;
        eatList.add(edible);
    }
    public List<Edible> getEatList() {
        return eatList;
    }

    public boolean hasEaten() {
        return hasEaten;
    }
    public void setHasEatenFalse() {
        hasEaten = false;
    }
    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public void makeNoise() {
        System.out.println("NEEEIGH");
    }

    public boolean isMounted() {
        return isMounted;
    }
    public void setIsMounted(boolean isMounted){
        this.isMounted = isMounted;
    }

    public boolean isDismounted() {
        return false;
    }

    public boolean isRidden() {
        return isRidden;
    }
    public void setIsRidden(boolean isRidden){
        this.isRidden = isRidden;
    }
}
