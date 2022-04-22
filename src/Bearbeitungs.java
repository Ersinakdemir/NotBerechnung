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
    static Kurse kurs =new Kurse();
    //static Schuler schuler =new Schuler();

    static public void eingangsPanel(){
        System.out.println("====================================\nSchuler, Lehrer Leitung und Kurs Panel\n" +
                "==================================\n" +
                "1 - Schulerleitung\n2 - Lehrerleitung\n3 - Kurse\n4 - Verlassen ");
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
                weitereProzes();
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
            //obj1.schuler();
        }else if(welcheProzes.equalsIgnoreCase("Lehrer")){
            System.out.println("wählen Sie bitte ein anderes Prozess aus");
            weitereProzes();
        }else if (welcheProzes.equalsIgnoreCase("Kurs")){

        }
        else{
            System.out.println("Wählen Sie bitte Prozes aus");
            weitereProzes();
        }
    }

    public static void einfügen() {
        if (welcheProzes.equalsIgnoreCase("schuler")){
            schuler();
            eingangsPanel();
        }else if(welcheProzes.equalsIgnoreCase("Lehrer")){
            Kurse.lehrerAdd();
            eingangsPanel();
        }else if (welcheProzes.equalsIgnoreCase("Kurs")){
            kurs.kurs();
            eingangsPanel();
        }
        else{
            System.out.println("Wählen Sie bitte Prozes aus");
            weitereProzes();
            weitereProzes();
        }
    }

    static List<Schuler>schulerList = new ArrayList<>();
    public static void schuler(){
        System.out.println("geben Sie bitte der Name des Schulers ein");
        schulerName =scan.next();
        System.out.println("geben Sie bitte der Nachname des Schulers ein");
        schulerNachname =scan.next();
        System.out.println("geben Sie bitte die SchulNo des Schulers ein");
        schulNo =scan.nextInt();
        System.out.println("geben Sie bitte die klase des Schulers ein");
        klase =scan.nextInt();
        System.out.println("geben Sie bitte kurs1 des Schulers ein");
        kurs1 =scan.next();
        System.out.println("geben Sie bitte kurs2 des Schulers ein");
        kurs2 =scan.next();
        System.out.println("geben Sie bitte kurs3 des Schulers ein");
        kurs3 =scan.next();
        Schuler schuler =new Schuler(schulerName,schulerNachname,schulNo,klase,kurs1,kurs2,kurs3);
        schulerList.add(schuler);
        System.out.println(schulerList);
    }

}
