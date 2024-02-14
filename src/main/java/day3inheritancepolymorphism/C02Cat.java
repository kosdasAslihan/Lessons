package day3inheritancepolymorphism;

import day1accessmodifiersinheritance.Animal;

public class C02Cat extends C02Mammal {

    public void meow() {
        System.out.println("Cat meow");
    }

    @Override //@Override annotation'ini kullanarak, Java'nin yaptigimiz Override islemini kontrol etmesini saglariz
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a + b + 1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b + 1;
    }

    //Asagidaki method "Overriding Method"
    @Override
    public C02Mammal create() { // public C02Animal create() yerine  public C02Mammal create()'i kabul eder
        return new C02Mammal();
    }

    /*
        1)Override yaparken "method'un body"si degistirilir.
        2)Override yaparken asla method signature'a (isim ve parametre) degistirilemez.
        3)Override yaparken inheritance olmak zorundadir.
        4)Override yaparken "access modifier"lar belli kurallara göre farklilastirilabilirler.
            i)"private" method'lar override edilemezler.
            ii)Child class'taki "override edilen" method'un access modifier'i Parent class'taki
               method'un access modifier'i ile ayni veya daha genis olmalidir.
               not: Child class'taki method'un access modifier'i daha dar olamaz.
            iii)default method'lar ayni package icindeyse override edilebilirler,
                farkli package'dan override edilemezler.
        5)Parent class'taki method'un "return type"i void ise "return type" degistirilemez.
        6)Parent class'taki method'un "return type"i primitive ise "return type" degistirilemez.
        7)Parent class'taki method'un "return type"i Wrapper Class ise "return type" degistirilemez.
        8)Parent class'taki method'un "return type"i Parent Class ise "return type" child'lardan biri olabilir.
          Not:Child class'taki return type Parent class'takinden genis olamaz.
          Not:Aralarinda "Parent Child" iliskisi olmayan class'lar Overriding'de Return Type degisiminde kullanilamazlar.
              Mesela "Short", "Integer"dan kucuktur, fakat aralarinda parent child iliskisi olmadigindan Integer yerine
              Short kullanamayiz.
          Not:Child'daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste "IS-A" relationship olmali.
          Not:Aralarinda "IS-A" relationship olan Data Type'lara "Covariant" denir.
        9)Child<Parent ==> IS-A (Her kedi hayvandır ama her hayvan kedi degildir.)
                           HAS-A (Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.)
        10)"final" method'lar Override edilemezler. Cunku "Overriding" de method body degistirilir fakat
           "final" method body degistirilmesine musaade etmez.
        11)Polymorphism = Overloading + Overriding
           Not:Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin.
        12)Overloading + Overriding arasindaki farklar nelerdir?
            i)Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir.
            ii)"private" method'lar Overload edilebilir, Override edilemezler.
            iii)"final" methodlar Overload edilebilir, Override edilemezler.
            iv)"Overloading" static polymorphism olarak, Overriding dynamic polymorphism olarak adlandirilir.
                Cunku "static" method'lar Overload edilebilir, Override edilemezler.
            v)"Overloading" de method signature degisir ama "Overriding" method signature'a dokunulmaz.
     */
}
