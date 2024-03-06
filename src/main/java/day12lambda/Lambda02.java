package day12lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    /*
    TASK:
    fields --> Universite (String)
               bolum (String)
               ogrSayisi (int)
               notOrt (int)
               olan POJO class create edip main method içinde 5 farklı obj'den List create ediniz.
     */
    public static void main(String[] args) {
        Universite u01 = new Universite("Bogazici", "Matematik", 571, 93);
        Universite u02 = new Universite("Istanbul Tk", "Matematik", 600, 81);
        Universite u03 = new Universite("Istanbul", "Hukuk", 1400, 71);
        Universite u04 = new Universite("Marmara", "Pc Muhendis", 1080, 77);
        Universite u05 = new Universite("ODTU", "Gemi Muhendis", 333, 74);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println(notOrt74BykUnv(unv));

        System.out.println(matVarMi(unv));

        System.out.println(ogrSayiBykKck(unv));
        //[Universite{universite='Istanbul', bolum='Hukuk', ogrSayisi=1400, notOrt=71},
        // Universite{universite='Marmara', bolum='Pc Muhendis', ogrSayisi=1080, notOrt=77},
        // Universite{universite='Istanbul Tk', bolum='Matematik', ogrSayisi=600, notOrt=81},
        // Universite{universite='Bogazici', bolum='Matematik', ogrSayisi=571, notOrt=93},
        // Universite{universite='ODTU', bolum='Gemi Muhendis', ogrSayisi=333, notOrt=74}]


    }

    //TASK: Bütün ünilerin norOrt'larının 74'ten büyük olduğunu kontrol ediniz.
    public static boolean notOrt74BykUnv(List<Universite> unv) {
        return unv.
                stream().
                allMatch(t -> t.getNotOrt() > 74);
    }

    //TASK: Uni'lerde herhangi birinde matematik olup olmadığını kontrol ediniz
    public static boolean matVarMi(List<Universite> unv){
        return unv.
                stream().
                anyMatch(t-> t.getBolum().toLowerCase().contains("mat"));
    }

    //TASK: unileri ogr sayılarına göre büyükten küçüğe sıralayınız.

    public static List<Universite> ogrSayiBykKck(List<Universite> unv){
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrSayisi).reversed()).
                collect(Collectors.toList());
    }
}
