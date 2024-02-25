package day5abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    /*
        1)LinkedList'deki her eleman iki bölümden oluşur i)Data ii)Pointer
        2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
        3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
        4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
        5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin
          çok yapılacağı durumlarda LinkedList kullanılmalıdır.
        6)ArrayList'ler index kullanır, LinkedList'ler index kullanmaz.
        7)ArrayList kullanmak eleman bulma işlemlerinde çok başarılıdır.
          Bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */

    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Jolie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors); //[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //LinkedList'ler ekleme ve silme işlemlerinde çok başarılı olduklarından
        //ekleme ve silme ile alakalı çok fazla method içerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors); //[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors); //[Cuneyt Arkin, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();
        System.out.println(visitors); //[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors); //[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors); //[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]


        /*
            Removes and returns the first element of this list.
            This method is equivalent to removeFirst().
            Throws: NoSuchElementException - if this list is empty
        */

        String firstEl = visitors.pop(); //Cut + Paste ==> Ctrl + X
        System.out.println(firstEl); //Tom
        System.out.println(visitors); //[Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        /* LinkedList<String> myList = new LinkedList<>();
        myList.pop(); //NoSuchElementException attı çünkü LinkedList boş */

        //31. derse başlanacak

    }
}
