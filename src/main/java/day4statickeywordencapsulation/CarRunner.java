package day4statickeywordencapsulation;

public class CarRunner {

    /*
        "static keyword" nedir?
        static keyword class'a bağlanmış class elemanlarıdır.
        static class elemanları bütün Object'lerin ortak elemanıdır.
        staticler üzerinde yapılan her değişiklik bütün objeleri etkiler tüm objelerde görünür.
        static class elemanlarına Class üzerinden ulaşılır
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variable'lara objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez.
        System.out.println(car1.counter); //4
        //static variable'lara class ismi kullanarak ulaşılmalıdır.
        System.out.println(Car.counter);
        System.out.println(car1.price); //20001

        System.out.println(Car.counter); //4
        System.out.println(car2.price); //20001


    }
}
