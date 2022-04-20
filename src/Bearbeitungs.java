import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Bearbeitungs extends Schuler{
    //static ArrayList<Person> schulerList = new ArrayList<>();
    //static ArrayList<Lehrer>lehrerList = new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static String welcheProzes;

public Bearbeitungs(){

}
    static public void eingangsPanel(){
        System.out.println("====================================\nSchuler, Lehrer Leitung und Kurs Panel\n" +
                "==================================\n" +
                "1 - Schulerleitung\n2 - Lehrerleitung\n3 - Kurse\n4 -  Verlassen ");
        System.out.println("wählen Sie bitte Ihr Prozes aus");
        int auswänlen =scan.nextInt();

        switch (auswänlen){
            case 1:
                welcheProzes ="Schuler";
                weitereProzes();
                break;
            case 2:
                welcheProzes ="Lehrer";
                weitereProzes();
                break;
            case 3:
                welcheProzes ="Kurs";

                break;
            case 4:
                verlassen();
                break;
            default:
                System.out.println("hatali giris yaptiniz");
                eingangsPanel();//recursive method call
                break;
        }

    }

    private static void verlassen() {
        System.out.println("Aufwiedersehen");
    }

    public static void weitereProzes(){
        System.out.println("wählen Sie bitte für "+welcheProzes +" weitereprozes aus.\r\n"
                +"==========Prozese==========\r\n" +
                "1 - Einfügen\r\n" +
                "2 - für Schuler NoteBewerten\n  -  für Kurse mindesNote\n  -  für Lehrer nicht zu tun\r\n" +
                "3 - Ausdrucken\r\n" +
                "0 - hauptmenu\r\n");
        int wunschProzes = scan.nextInt();

        switch (wunschProzes){
            case 1:
                einfügen();
                break;
            case 2:
                noteBewerten();
                weitereProzes();
                break;
            case 3:
                //ausdruken();
                weitereProzes();
                break;
            case 4:
                //Löschen();
                weitereProzes();
                break;
            case 0:
                eingangsPanel();
                break;
            default:
                System.out.println("geben sie bitte Ihr Wunschprozes ein");
                weitereProzes();
        }
    }
    private static void noteBewerten() {
        if (welcheProzes.equalsIgnoreCase("schuler")){
            obj1.schuler();
        }else if(welcheProzes.equalsIgnoreCase("Lehrer")){
            lehrerAdd();
        }else if (welcheProzes.equalsIgnoreCase("Kurs")){
            obj.kurs();
        }
        else{
            System.out.println("Wählen Sie bitte Prozes aus");
            weitereProzes();
        }
    }

    static Kurse obj =new Kurse();
    static Schuler obj1 =new Schuler();
    public static void einfügen() {
        if (welcheProzes.equalsIgnoreCase("schuler")){
            obj1.schuler();
        }else if(welcheProzes.equalsIgnoreCase("Lehrer")){
            lehrerAdd();
        }else if (welcheProzes.equalsIgnoreCase("Kurs")){
            obj.kurs();
        }
        else{
            System.out.println("Wählen Sie bitte Prozes aus");
            weitereProzes();
        }
    }
}
