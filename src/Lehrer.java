import java.util.Scanner;

public class Lehrer {
    /*
    ---------Teacher Class Özellikleri :

fields : name,branch--> ad, branş
Methods : Teacher()-->öğretmen()
     */
    public static Scanner scan = new Scanner(System.in);
     static String lehrerName;
     static String fach;

    public Lehrer(){

    }
    public Lehrer(String lehrerName, String fach) {
        this.lehrerName = lehrerName;
        this.fach = fach;
    }

    public String getlehrerName() {
        return lehrerName;
    }

    public void setlehrerName(String lehreName) {
        this.lehrerName = lehrerName;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public void lehrer(){
        System.out.println("geben Sie bitte den Name des Lehrer ein");//lehrer olusturuldu
        lehrerName =scan.nextLine();
        scan.next();//dummy cod
        System.out.println("geben Sie bitte fächer des Lerers ein");
        fach=scan.nextLine();
    }

}
