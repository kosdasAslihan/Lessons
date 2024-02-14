package day3inheritancepolymorphism;

public class C02AnimalRunner {
    public static void main(String[] args) {

        C02Cat cat = new C02Cat();

        cat.eat(); //Animals eat - override öncesi
                   //Cats eat - override sonrası


    }
}
