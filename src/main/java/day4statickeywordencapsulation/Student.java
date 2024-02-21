package day4statickeywordencapsulation;

    //Encapsulation: "Data Hiding(Gizlemek)" demektir.
    //Data'yı niçin gizlersiniz? Data'yı dış etkenlerden korumak için.
    //Data'yı nasıl gizlersin? Access Modifier'ını "private" yaparak gizlerim.
    //Data'yı gizledikten sonra başka class'lardan okumak istersen ne yaparsın? "get" methodlar (getter) oluşturarak
    //gizlediğimiz datalarookunur hale getiririz.
    //Data'yı gizledikten sonra başka Class'lardan değiştirmek istersen ne yaparsın? "set" methodlar (setter) oluşturarak
    //gizlediğimiz dataları değiştirebiliriz.
    //variable'ın "data type"ı ile get method'un "return type"ı aynı olmalıdır.
    //get method'ları isimlendirirken "get + <variable name>" anca variable'ın data type'ı "boolean" ise "is + <variable name>"
public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

        public String getStdId() {
            return stdId;
        }

        public double getGpa() {
            return gpa;
        }

        public boolean isRetired() {
            return retired;
        }

        public void setStdId(String stdId) {
            this.stdId = stdId;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public void setRetired(boolean retired) {
            this.retired = retired;
        }
    }
