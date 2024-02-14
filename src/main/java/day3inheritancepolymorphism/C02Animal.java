package day3inheritancepolymorphism;

import day1accessmodifiersinheritance.Animal;

public class C02Animal{

    public void eat(){
        System.out.println("Animals eat");
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    //Asagidaki method "Overridden Method"
    public C02Animal create(){
        return new C02Animal();
    }

    //final methodlar override edilemezler
    public final double divide(int a, int b){
        return a/b;
    }
}
