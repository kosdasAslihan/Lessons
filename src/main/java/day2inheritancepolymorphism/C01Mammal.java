package day2inheritancepolymorphism;

public class C01Mammal extends C01Animal {

    public int a = 13;
    public int b = 34;

    public void eat(){
        System.out.println("Mammal eat");
    }

    public void drink(){
        System.out.println("Mammal drink");
    }
    public C01Mammal(){
        System.out.println("Mammal");
    }
}
