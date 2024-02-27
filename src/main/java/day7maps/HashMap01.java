package day7maps;

/*
    1)Map'ler key-value structure kullanır.
    2)Key'ler unique'dir.
    3)Value'lar tekrarlı data içerebilir.
    4)Map'lerde eleman değil EntrySet kullanırız.
    5)Key'lerde null tekrarsız olarak kullanılır.
    6)Value'lar null kabul eder.
    7)HashMap'ler EntrySet'leri herhangi bir sıralamaya tabi tutmaz, rastgele sıralanır.
    8)Sıralama ile vakit kaybetmediği için HashMap'ler çok hızlı çalışırlar.
 */

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);

        studentAges.put("Ali", 88); //Aynı key değerini tekrar yazdığımızda hata vermez "overwrite" yapar. Yani üstüne yazar
        studentAges.put(null, 55);
        studentAges.put(null, 66); //overwrite yaptı.
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);

        System.out.println(studentAges); //{null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //Map'den sadece key'ler nasıl alınır?
        Set<String> keys = studentAges.keySet();
        System.out.println(keys); //[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        //Map'den sadece value'ler nasıl alınır?
        Collection<Integer> values = studentAges.values();
        System.out.println(values); //[66, null, null, 21, 76, 12, 75, 88]

        //Belli bir key'e ait value nasıl alınır?
        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge); //75

        //Example 1: Tüm integer yaşların ortalamasını hesaplayan kodu yazınız.
        Collection<Integer> ages = studentAges.values();
        Integer sum = 0;
        double counter = 0;

        for (Integer w : ages) {
            if (w != null) {
                sum = sum + w;
                counter++;
            }
        }
        System.out.println("Ortalama Yas: " + (sum / counter)); //Ortalama Yas: 56.333333333333336

        //Example 2: A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız.
        Set<String> names = studentAges.keySet();
        int sum1 = 0;

        for (String w : names) {
            if (w != null && !w.startsWith("A")) {
                sum1 = sum1 + w.length();
            }
        }
        System.out.println(sum1); //25

        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);//true, sildiği için true döndü. Ama 76 yerine 77 yazsaysık false dönecekti.

        Integer result1 = studentAges.remove(null);
        System.out.println(result1); //66 - aldığı key'i sildi ve value'sunu döndürdü

        //Key varsa value'u ver, key yoksa sizin istediğiniz değeri verir
        /*Integer result2 = studentAges.getOrDefault("Brad",0);
        System.out.println(result2); //12 - map içinde Brad'in değeri 12 oldugu icin*/

        Integer result2 = studentAges.getOrDefault("Brandon",0);
        System.out.println(result2); //0 - map'de Brandon olmadığı için bizim verdiğimiz değer olan 0'ı döndürdü

        //Value null ise ekleme yapar, value null değilse ekleme yapmaz
        /*Integer result3 = studentAges.putIfAbsent("Ayhan Isik",100);
        System.out.println(result3); //null - map içinde olduğu için var olanı döndürdü*/

        Integer result3 = studentAges.putIfAbsent("Brad",100);
        System.out.println(result3); //12
        System.out.println(studentAges); //{Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik",100);
        System.out.println(result4); //null
        System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        //key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali",200);
        System.out.println(result5); //nul
        System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}

        //replace() method'u value'ları değiştirmek için kullanılır
        studentAges.replace("Acun Ilicali",49);
        System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //replace() method'u value'ları, key ve value'yu kontrol ettikten sonra değiştirdi.
        studentAges.replace("Acun Ilicali",49,53);
        System.out.println(studentAges); //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}

        //Example 3: map'teki herbir entry'i ekrana farklı bir satırda olacak şekilde yazdırınız.
        //entrySet() methodu map'deki elemanları bir Set'in içine koyarak size verir.
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();

        for (Map.Entry<String,Integer> w : entries){
            System.out.println(w);
            //Ayhan Isik=100
            //Sadri Alisik=null
            //Tom=21
            //Brad=12
            //Cuneyt=75
            //Acun Ilicali=53
            //Ali=88
        }


    }
}
