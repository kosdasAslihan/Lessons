package day1accessmodifiersinheritance;

public class Student {
    /*
        Access Modifier
        1)public  2)protected  3)default(Access Modifier'i default yapmak icin access modifier yazmayiz)  4)private  (genişten dara doğru)
     */

    //public her class'tan kullabilabilir
    public String stdName = "TomHanks";

   //protected olanlar baska package'lardan kullanilamaz ancak baska package'de "child class" icinden kullanilabilir.
    protected String address = "Miami";

    //default olanlar baska package'dan kullanilamazlar
    String email = "th@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private String stdId = "20206517004";

    /*
    protected ile default'un farki:
    -protected olanlar baska package'lardan kullanilamaz ancak baska package'de "child class" icinden kullanilabilir.
    -default olanlar baska package'dan kullanilamazlar
     */

    /*
    class'lar icin hangi access modifier'lar kullanilabilir.
    public, default kullanilir. protected ve private kullanilamaz
     */
}
