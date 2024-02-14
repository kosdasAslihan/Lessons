package day3inheritancepolymorphism;

public class C01Math extends C01Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

    public C01Math(){
        super("X");
        System.out.println("Constructor 1");
    }

    public C01Math(int a){
        this(); //Ayni class'in icindeki diger constructor'i kullan
        System.out.println("Constructor 2");
    }
}
