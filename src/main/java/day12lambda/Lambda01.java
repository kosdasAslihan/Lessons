package day12lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havuçDilim", "güveç", "kokoreç",
                "küşleme", "arabAşı", "waffle", "künefe", "güveç"));

        alfBuyukTekrarsiz(menu); //ARABAŞI GÜVEÇ HAVUÇDİLİM KOKOREÇ KÜNEFE KÜŞLEME TRİLEÇE WAFFLE

        System.out.println();
        chrSayisiTersTekrarsiz(menu); //10 7 6 5

        System.out.println();
        chrSayisiKucuktenBuyuge(menu); //güveç güveç waffle künefe trileçe kokoreç küşleme arabAşı havuçDilim

        System.out.println();
        harfSayisiYedidenAz(menu); //list elemanları 7 harften fazla

        wIleBaslayanElemanKontrol(menu); //w ile başlayan yemek bulunuyor

        xIleBitenBirElVarMi(menu); //x ile biten yemek ismi yok

        charSayisiEnBuyuk(menu); //[havuçDilim]

        ilkElHaricSonHarfSiraliPrint(menu); //küşleme waffle künefe havuçDilim güveç kokoreç güveç arabAşı

    }

    //TASK: List elemanlarını alfabetik, büyük harf ve tekrarsız yazdırınız.
    public static void alfBuyukTekrarsiz(List<String> yemek) {
        yemek.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    //TASK: List elemanlarının character sayısını ters sıralı olarak tekrarsız yazdırınız.
    public static void chrSayisiTersTekrarsiz(List<String> ikram) {
        ikram.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(t -> System.out.print(t + " "));
    }

    //TASK: List elemanlarını, character sayısına göre küçükten büyüğe doğru yazdırınız.
    public static void chrSayisiKucuktenBuyuge(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::yazdir);
    }

    //anyMatch(): en az bir eleman şartı sağlarsa true, aksi durumda false return eder
    //allMatch(): tüm elemanlar şartı sağlarsa true, en az bir eleman şartı sağlamazsa false return eder
    //noneMatch(): hiçbir şartı sağlamazsa true, en az bir eleman şartı sağlarsa false return eder

    //TASK:List elemanlarının hepsinin karakter sayısını 7 ve 7'den az olma durumunu kontrol ediniz.
    public static void harfSayisiYedidenAz(List<String> menu) {
        System.out.println(menu.
                stream().
                allMatch(t -> t.length() <= 7) ? "List elemanları 7 ve daha az harften oluşuyor" :
                "list elemanları 7 harften fazla");
    }

    //TASK: List elemanlarından birinin "w" ile başlamasını noneMatch() ile kontrol ediniz.
    public static void wIleBaslayanElemanKontrol(List<String> menu){
        System.out.println(menu.
                stream().
                noneMatch(t -> t.startsWith("w")) ? "w ile başlayan yemek ismi yok" :
                "w ile başlayan yemek bulunuyor");
    }

    //TASK: List elemanlarının "x" ile biten en az bir elemanı var mı kontrol ediniz
    public static void xIleBitenBirElVarMi(List<String> menu){
        System.out.println(menu.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "x ile biten yemek ismi var" :
                "x ile biten yemek ismi yok");
    }

    //TASK: karakter sayısı en büyük elemanı yazdırınız.
    public static void charSayisiEnBuyuk(List<String> yemek){
        Stream<String> sonIsim = yemek.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                limit(1); //limit methodu kullanılarak sadece ilk eleman çağrıldı
                //limit() metodunun dönen değeri Stream<String> yapıdadır

        System.out.println(Arrays.toString(sonIsim.toArray()));
        //sonIsim.toArray() --> stream olan akışı Array'e çevirdi
        //Arrays.toString(sonIsim.toArray()) --> Array'i Strin yapıya çevirdi
    }

    //TASK: List elemanlarını son harfine göre sıralayıp ilk eleman hariç kalan elemanları yazdırınız.
    public static void ilkElHaricSonHarfSiraliPrint(List<String> ikram){
        ikram.
                stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                skip(1).
                forEach(Utils::yazdir);
    }


}
