package day2inheritancepolymorphism;

public class C02Car extends C02Vehicle {

    public String color;
    int km;

    public C02Car() {

    }

    public C02Car(String color, int km) {
        super("Car");
        this.color = color;
        this.km = km;
        System.out.println("Car Constructor");

    }
}
