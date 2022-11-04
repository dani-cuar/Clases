import com.company.herencia.SmartPhone;
import com.company.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone cel1 = new SmartPhone("xiaomi", 1900, "11T", 50.0, 0, 0, false);
       cel1.marca = "Samsung";
       cel1.llamadaentrante = true;
       cel1.presionArterial = 70;

        System.out.println(cel1);

        SmartWatch rel1 = new SmartWatch("LG", 250, "Watch3", 25, 0, 0, 0);
        rel1.hora = 12;
        rel1.precio = 90;
        rel1.ritmoCardiaco = 55;

        System.out.println(rel1);
    }
}