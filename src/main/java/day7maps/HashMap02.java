package day7maps;

import java.util.HashMap;

public class HashMap02 {

    /*
        1)HashMap<String, Double> salaries = new HashMap<>(); kodu yazıldığında Java memory'de 16 kutu(bucket) içeren
        bir yapı oluşturur ve bu yapıdaki her bir kutuya index verir. Index'ler 0'dan 15'e kadardır.
        2)salaries.put("QA", 110000.00); kodu yazıldığında Java, key için bir HashCode oluşturur bu HashCode'u 15'e böler
        ve kalanı index olarak kullanır. Sonrasında bu elemanı o index'e yerleştirir.
        3)Yerleştirirken 4'lü bir yapı oluşturur. ilk bölümüne "HashCode", ikinci bölüme "Key", üçüncü bölüme "Value"
        ve dördüncü bölüme "pointer"ı koyar. Bu çok bölümlü yapı LinkedList'lerdeki "Node"dur. Yani HashMap bucket'ları
        koyduğu data'yı LinkedList olarak depolar.
        4)Java "null" için hep HashCode olarak "zero" üretir. O yüzden key null olduğunda eleman ilk bucket'a yerleştirilir.
        Bundan dolayı key'i null olan elemanlar map'in içinde genellikle ilk sırada gözükürler.
        5)Java normalde HashCode'ları unique yapar ama bazen trafik kazası gibi farklı iki eleman için aynı HashCode üretilebilir.
        Buna "Hash Collision" denir. Hash Collision meşhur bir Java Development problemidir. Bu problemle karşılaşıldığında
        developer'lar bu problemi çözmek için kodlar yazarlar, ama bu Core Java'nın konusu değildir.
     */
    public static void main(String[] args) {

        HashMap<String, Double> salaries = new HashMap<>();

        salaries.put("QA", 110000.00);
        salaries.put("Dev", 130000.00);
        salaries.put("SalesForce", 125000.00);
    }
}