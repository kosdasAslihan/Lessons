package day10lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        1)Lambda, method create etme değil mevcut method'ları(library) seçip kullanmaktır.
          Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.

        2)"Functional Programming" de "Nasıl yaparım?" değil "Ne yaparım?" düşünülür.
           "Structured Programming" de "Ne yaparım?" dan çok "Nasıl yaparım?" düşünülür.

        3)"Functional Programming" hız, code kısalığı, code okunabilirliği ve hatasız code yazma açılarından çok faydalıdır.

        4)Lambda sadece collections'larda(List, Queue ve Set) ve arrayler'de kullanılabilir.
          Ancak map'lerde kullanılmaz.
         */

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        printElStructured(sayi); //34 22 16 11 35 20 63 21 65 44 66 64 81 38 15

        System.out.println();
        printElFunctional1(sayi); //34 22 16 11 35 20 63 21 65 44 66 64 81 38 15

        System.out.println();
        printElFunctional2(sayi); //342216113520632165446664813815

        System.out.println();
        printElFunctional3(sayi); //34 22 16 11 35 20 63 21 65 44 66 64 81 38 15

        System.out.println();
        printCiftElFunctional(sayi); //34 22 16 20 44 66 64 38

        System.out.println();
        printCiftOtzKckFunctional(sayi); //22 16 11 20 21 15

        System.out.println();
        printCiftOtzBykFunctional(sayi); //34 22 16 35 20 63 65 44 66 64 81 38


    }

    //TASK: "Structured Programming" kullanarak list elemanlarını aynı satırda aralında boşluk olacak şekilde yazdırınız.
    public static void printElStructured(List<Integer> sayi) {

        for (Integer w : sayi) {
            System.out.print(w + " ");
        }
    }

    //TASK: "Functional Programming" kullanarak list elemanlarını aynı satırda aralında boşluk olacak şekilde yazdırınız.
    public static void printElFunctional1(List<Integer> sayi) {
        sayi.
                stream().
                forEach((t) -> System.out.print(t + " ")); //lambda expression
    }

    public static void printElFunctional2(List<Integer> sayi) {
        sayi.
                stream().
                forEach(System.out::print); //method referance
    }

    //--> kendimiz bir method oluşturalım
    public static void yazdir(int a) {
        System.out.print(a + " ");
    }

    public static void printElFunctional3(List<Integer> sayi) {
        sayi.
                stream().
                forEach(Lambda01::yazdir);
    }

    //TASK: "Functional Programming" ile list elemanlarının çift olanlarını aynı satırda boşluklu bir şekilde yazdırınız.
    public static void printCiftElFunctional(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0).
                forEach(Lambda01::yazdir);
    }

    //TASK: "Functional Programming" ile list elemanlarının 34'den küçük ve çift olanlarını aynı satırda boşluklu bir şekilde yazdırınız.
    public static void printCiftOtzKckFunctional(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t < 34).
                forEach(Lambda01::yazdir);
    }
    //TASK: "Functional Programming" ile list elemanlarının 34'den büyük veya  çift olanlarını aynı satırda boşluklu bir şekilde yazdırınız.
    public static void printCiftOtzBykFunctional(List<Integer> sayi){
        sayi.
                stream().
                filter(t-> t % 2 == 0 || t > 34).
                forEach(Lambda01::yazdir);
    }


}
