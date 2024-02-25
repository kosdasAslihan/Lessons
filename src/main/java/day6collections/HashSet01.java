package day6collections;

import java.util.HashSet;

public class HashSet01 {

    /*
        Hash bir tekniktir, birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
        Set'lere çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız. (öğrenci numaraları gibi)

        HashSet'ler eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcamaz bu yüzden çok hızlı çalışır.

        HashSet'ler index kullanmazlar. Çünkü sıralama rastgele yapıldığı için index manalı olmaz.

        HashSetler:
          1)Tekrarsız elemanlarda
          2)Sıralama önemli değilse
          3)Hız çok önemliyse
          4)Index kullanmazlar
     */
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemanı eklediğimizde hata vermez, son ekleneni var olan data'nın üstüne yazar. (Overwrite)
        emails.add("Mango");
        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails); //[null, Apple, Fig, Mango, Apricot, Orange]


    }
}
