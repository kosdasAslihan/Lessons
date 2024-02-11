package day1accessmodifiersinheritance;

public class AnimalRunner {

    /*
        1)Inheritance sayesinde
            i)Code tekrarlarindan kurtuluruz
            ii)Code tamiri(maintenance) kolay olur.
            iii)Child class'ları daha atomic yapmis oluruz

        2)Bir class'i baska bir class'in Child class'i yapmak icin
        "extends" keyword kullanilir. Ilk yazilan class child, ikinci
        yazilan class parent olur

        3)Child class object'leri Parent class'tan method ve variable'lari
        kullanabilirler.

        4)Parent class object'leri Child class'tan method ve variable'lari
        kullanamazlar.

        5)Object class her class'in parent'idir.
          Java da Object class hariç her class'in parent'i vardir.
          Java da parent'i olmayan tek class Object class'tir.

        6)"private" method ve variable'lar Child class'lar tarafindan kullanilamaz.
        "protected" method ve variable'lar Child class'lar tarafindan kullanilabilir.
        "default" method ve variable'lar ayni package'deki Child class'lar tarafindan kullanilabilir.
        NOT:Child class'lar tarafindan kullanilabilir olmak "inherit edilebilir" demekdir

        7)4 tip inheritance vardir
          i)Multilevel Inheritance: Java bunu kabul eder
          ii)Hierarchical Inheritance: Java bunu kabul eder
          iii)Multiple Inheritance: Bir Child'a coklu Paretn, Java bunu desteklemez.
          iv)Single Inheritance: Bir Child class icin bir Parent class demektir. Java bunu kabul eder
     */
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat(); //Animals eat...
        c1.drink(); //Animals drink...
        c1.meow(); //Cats meow...

        Dog d1 = new Dog();
        d1.bark(); //Dogs bark...
        d1.eat(); //Animals eat...
        d1.drink(); //Animals drink...

    }
}
