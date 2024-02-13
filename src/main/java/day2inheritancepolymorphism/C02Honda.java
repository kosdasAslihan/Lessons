package day2inheritancepolymorphism;

public class C02Honda extends C02Car {

    public String color;

    public C02Honda() {
        super("White",54000);
        System.out.println("Honda Constructor");

    }

    public C02Honda(String color) {
        this.color = color;

    }
}
