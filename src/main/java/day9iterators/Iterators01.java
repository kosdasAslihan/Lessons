package day9iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for-each loop kullanarak her elemanın sonuna "!" ekleyiniz
        //Not: loop'lar kendi başlarına "Collection"ları update edemezler bu yüzden Java "iterator"ları oluşturdu.
        //iterator'lar Collection'ları update etmek için kullanılır.
        for (String w : myList){
            w = w + "!";
        }
        System.out.println(myList);

        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()){
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList); //[Z!, K!, A!, J!, M!]
        
    }
}
