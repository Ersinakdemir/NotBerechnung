import java.util.ArrayList;

public class Kurse extends Lehrer{
    /*

----------Course Class Özellikleri :

fields (variable) : name,code,prefix,note,Teacher--> ad, ünvan, notYazılı, notSozlu, öğretmen,
Methods : Course() , addTeacher() , printTeacher()--> kurs(), öğretmenEkle(), öğretmenYazdır()

     */
    private static int wochenStunde;
    private String unterrict;
    private static double note;
    static ArrayList<Lehrer> lehrerList = new ArrayList<>();
    static ArrayList<Kurse> kurseList = new ArrayList<>();
    public Kurse(){
        super();
    }
    static Kurse kurs =new Kurse(lehrerName,fach, wochenStunde,note);
    public Kurse(String lehrerName, String fach, int wochenStunde, double note) {
        super(lehrerName, fach);
        this.wochenStunde = wochenStunde;
        this.note = note;
    }
    public  void kurs(){
        System.out.println("geben Sie bitte Unterricht ein");
        fach =scan.next();
        System.out.println("geben Sie bitte den Name des Lehrers  ein");
        lehrerName =scan.nextLine();
        System.out.println("geben Sie bitte wochenstunde des Unterichts ein");
        wochenStunde =scan.nextInt();
        System.out.println("geben Sie bitte mindesnote ein");
        note =scan.nextInt();
        //kurseList.add(kurs);
        //return kurs;
    }
    public static void lehrerAdd(){
        System.out.println("geben Sie bitte den Name des Lehrer ein");//lehrer olusturuldu
        lehrerName =scan.nextLine();
        //scan.next();//dummy cod
        System.out.println("geben Sie bitte fächer des Lerers ein");
        fach=scan.nextLine();
        Lehrer lehrer=new Lehrer(lehrerName,fach);
        lehrerList.add(lehrer);
    }
    public void lehrerAusdruck(){
        boolean flag =true;
        System.out.println("geben Sie bitte LehrerName");
        String suchLehrerName =scan.nextLine();
        for (Lehrer w:lehrerList) {
            if (w.lehrerName.equalsIgnoreCase(suchLehrerName)){
                System.out.println(w);
                flag=false;
            }
        }
        if (flag){
            System.out.println(suchLehrerName+ " nicht verfüngbar");
        }
    }
    public String getUnterrict() {
        return unterrict;
    }

    public void setUnterrict(String name) {
        this.unterrict = unterrict;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    public int getWochenStunde() {
        return wochenStunde;
    }

    public void setWochenStunde(int wochenStunde) {
        this.wochenStunde = wochenStunde;
    }

}
