package day6collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    /*
        (oncelik)PriorityQueue Java kendisine göre bir öncelik belirleyerek sıralama yapar
        biz istersek sıralamayı belirleyebiliriz
     */
    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue); //[A, C, B, G, E]

    }
}
