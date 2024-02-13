package day2inheritancepolymorphism;

public class C01AnimalRunner {
    public static void main(String[] args) {

        //Inheritance'da "variable'lar secilirken Java object'in data type'ina bakar."
        //Oncelikle istediginiz variable'i object'in data type'i olan class'ta arar.
        //o class'ta bulamazsa parent class'lara bakara.
        //Hicbir parent class'ta bulamazsa hata verir.

        C01Cat cat1 = new C01Cat();
        System.out.println(cat1.a); //14, cat class'inin icindekini yazdirdi
        System.out.println(cat1.b); //34, cat class'inin icinde b variable'i olmadigi icin mammal class'indaki b variable'ini aldi
        System.out.println(cat1.c); //45, cat class ve mammal class'in icinde c variable'i olmadigi icin animal'daki variable'i aldi

        C01Mammal cat2 = new C01Cat();
        System.out.println(cat2.a); //13, mammal class'inin icindekini yazdirdi

        C01Animal cat3 = new C01Cat();
        System.out.println(cat3.a); //12, animal class'inin icindekini yazdirdi


        //Inheritance'da "method'lar secilirken Java Constructor'a bakar"
        //Oncelikle istediginiz metodu constructor'i kullanilan class'tan alir.
        //O class'ta bulamazsa parent class'lara bakar.
        //Hicbir yerde o methodu bulamazsa hata verir.
        C01Cat cat4 = new C01Cat();
        cat4.eat(); //Cat eat
        cat4.drink(); //Mammal drink, cat class'inda drink methodu olmadigi icin Mammal class'indan aldi.
        //Cat cat5 = new Mammal(); object olustururken sag taraf (Mammal) parent ise, sol taraf (Cat) child olamaz.

        C01Mammal cat5 = new C01Mammal();
        cat5.eat(); //Mammal eat

        C01Animal cat6 = new C01Animal();
        cat6.eat(); //Animal eat

    }
}
