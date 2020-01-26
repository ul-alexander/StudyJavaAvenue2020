package Lesson12.Homework;


import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //Create DB Collection
        CollectionsDB db = new CollectionsDB();

        System.out.println("===================================");
        System.out.println(db.getCollNumbers1());
        System.out.println(db.getCollNumbers6());
        System.out.println(db.getCollString());
        System.out.println(db.getCollDouble());
        System.out.println("===================================");

        ////////////////////////////////////////////////////
        // Interface Collection utill
        // Make Object
        CollectionUtilsImpl collectionUtils = new CollectionUtilsImpl();

        // Method union
        Collection<Integer> result =  collectionUtils.union(db.getCollNumbers1(),db.getCollNumbers6());
        System.out.println("====================");
        System.out.println(result);
        System.out.println("====================");
        // Method intersection
        Collection<Integer> result2 = collectionUtils.intersection(db.getCollNumbers1(),db.getCollNumbers6());
        System.out.println("====================");
        System.out.println(result2);
        System.out.println("====================");
        // Method unionWithoutDuplicate
        Collection<Integer> result3 = collectionUtils.unionWithoutDuplicate(db.getCollNumbers1(),db.getCollNumbers6());
        System.out.println("====================");
        System.out.println(result3);
        System.out.println("====================");
        // Method intersectionWithoutDuplicate
        Collection<Integer> result4 = collectionUtils.intersectionWithoutDuplicate(db.getCollNumbers1(),db.getCollNumbers6());
        System.out.println("====================");
        System.out.println(result4);
        System.out.println("====================");
        // Method difference
        Collection<Integer> result5 = collectionUtils.difference(db.getCollNumbers1(),db.getCollNumbers6());
        System.out.println("====================");
        System.out.println(result5);
        System.out.println("====================");
        // Interface List utils
        ////////////////////////////////////////////////////
        ListUtilsImpl listUtils = new ListUtilsImpl();
        //listUtils.setListStrings(db.getCollString());
        // Interface Set utils

    }


}
