package day2inheritancepolymorphism;

public class C01CatRunner {

    /*
        1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
        2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
        3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
        4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, hata vermez.
        5)"super()" kodunu gorunur sekilde yazarsaniz ilk satir disinda baska satira yazildiginda hata verir.
        6)"super()" kodu Parent class'tan constructor cagirmaya yarar.
     */
    public static void main(String[] args) {

        C01Cat cat1 = new C01Cat();
        //Animal
        //Mammal
        //Cat
        //Java da ustten alta dogru bi olusum oldugu icin once parent olan Animal cikti, sonraki parent olan Mammal cikti
        //en son child olan Cat ciktisini aldik.


    }
}
