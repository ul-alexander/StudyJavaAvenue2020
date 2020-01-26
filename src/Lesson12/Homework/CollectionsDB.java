package Lesson12.Homework;

import java.util.ArrayList;

public class CollectionsDB {

    private ArrayList<Integer> collNumbers1 = new ArrayList<>();
    private ArrayList<Integer> collNumbers6 = new ArrayList<>();
    private ArrayList<String> collString = new ArrayList<>();
    private ArrayList<Double> collDouble = new ArrayList<>();

    //Constructor default

    public CollectionsDB() {
        this.addItemsToCollections();
    }

    public ArrayList<Integer> getCollNumbers1() {
        return collNumbers1;
    }

    public void setCollNumbers1(ArrayList<Integer> collNumbers1) {
        this.collNumbers1 = collNumbers1;
    }

    public ArrayList<Integer> getCollNumbers6() {
        return collNumbers6;
    }

    public void setCollNumbers6(ArrayList<Integer> collNumbers6) {
        this.collNumbers6 = collNumbers6;
    }

    public ArrayList<String> getCollString() {
        return collString;
    }

    public void setCollString(ArrayList<String> collString) {
        this.collString = collString;
    }

    public ArrayList<Double> getCollDouble() {
        return collDouble;
    }

    public void setCollDouble(ArrayList<Double> collDouble) {
        this.collDouble = collDouble;
    }

    //Add array list Numbers
    private void addItemsToCollections() {
        //Load Collections

        for (int i = 0; i < 31; i++) {
            this.collNumbers1.add(i);
            this.collString.add("Элемент " + i);
            this.collDouble.add((double)i);
            if (i % 2 == 0) {
                this.collNumbers6.add(i + this.collNumbers1.get(i));
            }
        }
    }

}
