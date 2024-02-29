package day8maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
        1)HashTable bir map'dir.
        2)HashTable entrySet'leri herhangi bir sıralamaya tabi tutmaz.
        3)HashTable, HashMap'lerden daha yavaştır. Çünkü HashTable'lar thread-safe ve synchronized'dır.
        4)HashTable'larda key null olamaz. Key'i null yaparsanız NullPointerException atar.
        5)HashTable'larda value null olamaz. Value'u null yaparsanız NullPointerException atar.
        6) toString() method'u obje'leri console'da detayları ile görebilmek için class'ların içinde oluşturulur.
           toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.
     */
    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations); //{USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulations.put(null,90000000); HashTable'larda key null olamaz. NullPointerException

        //countryPopulations.put("France",null); HashTable'larda value null olamaz. NullPointerException

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));
        System.out.println(myStudents); //{Math={name='Tom Hanks', email='th@gmail.com', age=21, success=true}}

        myStudents.put("Science", new Students("Mary Star", "ms@gmail.com", 32, false));
        System.out.println(myStudents);
        //{Math={name='Tom Hanks', email='th@gmail.com', age=21, success=true}, Science={name='Mary Star', email='ms@gmail.com', age=32, success=false}}

        /*Students name = myStudents.get("name"); //get method'u key ile çalışır. Key = Math bu yüzden "name"'i kullanamayız
        System.out.println(name); //null*/

        /*Students name = myStudents.get("Math");
        System.out.println(name); //{name='Tom Hanks', email='th@gmail.com', age=21, success=true}*/

        String name = myStudents.get("Math").name;
        System.out.println(name); //Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println(age); //21

    }
}
