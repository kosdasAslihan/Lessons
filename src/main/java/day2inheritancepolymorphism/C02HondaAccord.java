package day2inheritancepolymorphism;

public class C02HondaAccord extends C02Honda {

    /*
        1)Siz class olusturdugunuzda Java otomatik olarak gorunmez bir constructor verir, cunku
          Java, class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
          Constructor'in sart oldugunu bilir.
        2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir.
        3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.
        4)Bir class'ta birden fazla const. olabilir. Fakat bu constructor'larin parametreleri farkli olmalidir.
        5)"this" keyword "bu class" anlamindadir. "this.price" demek "bu class'taki price isimli variable" demektir.
          "this.price" syntax'i constructor'larin icinde kullanilir.
        6)Constructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin
        degerlerini degistirir. Class'taki variable degerlerini degistiremez.
     */

    public int price;
    public int year;
    public String make;
    public String model;

    public C02HondaAccord() {

    }

    public C02HondaAccord(int price) {
        this.price = price;

    }

    public C02HondaAccord(int price, int year) {
        //super(String color, int km); parametre degil deger koymamiz lazim
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public C02HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;

    }
}
