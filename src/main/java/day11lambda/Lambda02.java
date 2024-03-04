package day11lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));

        ciftKarePrint(sayi); //16 4 36

        System.out.println();
        tekKupBirFazlaPrint(sayi); //1332 -124 344 28 3376

        System.out.println();
        ciftKarekokPrint(sayi); //2.0 1.4142135623730951 2.449489742783178

        System.out.println();
        maxElBul(sayi); //Optional[15]

        structuredMaxElBul(sayi); //en büyük sayı: 15

        ciftKareMaxPrint(sayi); //Optional[36]

        elTopla(sayi); //toplam = 43

        ciftCarp(sayi); //Optional[48]

        ciftCarp2(sayi); //carpim = 48

        minBul(sayi); //Optional[-5]

        bestenBuyukTekKucuk(sayi); //Optional[7]

        ciftKareKucuktenBuyuge(sayi); //4 16 36


    }

    //TASK: Functional Programming ile listin çift elemanlarının karelerini aynı satırda boşluklu yazdırınız.
    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).
                forEach(Lambda01::yazdir);
    }

    //TASK: Functional Programming ile listin tek elemanlarının küplerinin bir fazlasını aynı satırda boşluklu yazdırınız.
    public static void tekKupBirFazlaPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> (t * t * t) + 1).
                forEach(Lambda01::yazdir);
    }

    //TASK: Functional Programming ile listin çift elemanlarının kareköklerini aynı satırda boluklu yazdiriniz
    public static void ciftKarekokPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(Math::sqrt). //double
                forEach(t -> System.out.print(t + " "));
    }

    //TASK: Listin en büyük elemanını yazdırınız

    public static void maxElBul(List<Integer> sayi) {
        Optional<Integer> maxSayi = sayi.
                stream().
                reduce(Math::max); //eğer result tek bir değer ise o zaman reduce terminal opr kullanılır
        System.out.println(maxSayi);
    }

    //Structured yapı ile çözelim
    public static void structuredMaxElBul(List<Integer> sayi) {
        int max = Integer.MIN_VALUE;
        System.out.println("max = " + max);
        for (int i = 0; i < sayi.size(); i++) {
            if (sayi.get(i) > max) max = sayi.get(i);
        }
        System.out.println("en büyük sayı: " + max);
    }

    //TASK: List'in çift elemanlarının karelerinin en büyüğünü print ediniz.
    public static void ciftKareMaxPrint(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(a -> a * a).
                reduce(Integer::max)); //Math::max'a göre daha hızlı çalışır
    }

    //TASK: List'teki tüm elemanların toplamını yazdırınız. Lambda Expression...
    public static void elTopla(List<Integer> sayi) {
        int toplam = sayi.
                stream().
                reduce(0, (a, b) -> (a + b));
        System.out.println("toplam = " + toplam);
        /*
            a ilk değerini her zaman atanan değerden (ilk parametre) alır, bu örnekte 0 oluyor.
            b değerini her zaman stream()'den alır
            a ilk değerinden sonraki değeri işlemden alır.
         */
    }

    //TASK: List'teki çift elemanların çarpımını yazdırınız.
    public static void ciftCarp(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                reduce(Math::multiplyExact));
    }

    public static void ciftCarp2(List<Integer> sayi) {
        int carpim = sayi.
                stream().
                filter(Lambda01::ciftBul).
                reduce(1, (a, b) -> (a * b));
        System.out.println("carpim = " + carpim);
    }

    //TASK: List'teki elemanların en küçüğünü yazdırınız.
    public static void minBul(List<Integer> sayi) {
        //1.yol
        System.out.println(sayi.
                stream().
                reduce(Integer::min));
        //2.yol
        System.out.println(sayi.stream().reduce(Lambda02::minBulma));

    }

    //method oluşturarak yapalım
    public static int minBulma(int a, int b) {
        return a < b ? a : b;
    }

    //TASK: List'teki 5'ten büyük en küçük tek sayıyı yazdırınız.
    public static void bestenBuyukTekKucuk(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                filter(a -> (a > 5) && (a % 2 == 1)).
                reduce(Lambda02::minBulma));
    }

    //TASK: List'in çift elemanlarının karelerini küçükten büyüğe yazdırınız.
    public static void ciftKareKucuktenBuyuge(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).sorted().
                forEach(Lambda01::yazdir);
    }
}
