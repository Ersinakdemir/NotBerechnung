import java.util.ArrayList;
import java.util.List;

public class Kurse extends Lehrer{
    /*

----------Course Class Özellikleri :

fields (variable) : name,code,prefix,note,Teacher--> ad, ünvan, notYazılı, notSozlu, öğretmen,
Methods : Course() , addTeacher() , printTeacher()--> kurs(), öğretmenEkle(), öğretmenYazdır()

     */
    private static int wochenStunde;
    private static String unterrict;
    private static double note;
    static double meinungsNoteProzent;



    static ArrayList<Lehrer> lehrerList = new ArrayList<>();
    static ArrayList<Kurse> kurseList = new ArrayList<>();
    static List<Kurse> kursNoteList = new ArrayList<>();
    public Kurse(){
        super();
    }

    static Lehrer lehrer=new Lehrer(lehrerName,fach);
    static Kurse kurs =new Kurse(lehrerName,fach, wochenStunde,note);
    static Kurse kursNote =new Kurse(unterrict, note, meinungsNoteProzent);

    public Kurse(String unterrict,double note, double meinungsNoteProzent) {
        this.unterrict = unterrict;
        this.setNote(note);
        this.setMeinungsNoteProzent(meinungsNoteProzent);
    }

    public Kurse(String lehrerName, String fach, int wochenStunde, double note) {
        super(lehrerName, fach);
        this.wochenStunde = wochenStunde;
        this.note = note;
    }
    public Kurse kurs(){
        System.out.println("geben Sie bitte Unterricht ein");
        fach =scan.next();
        System.out.println("geben Sie bitte den Name des Lehrers  ein");
        lehrerName =scan.next();
        System.out.println("geben Sie bitte wochenstunde des Unterichts ein");
        wochenStunde =scan.nextInt();
        System.out.println("geben Sie bitte mindesnote ein");
        note =scan.nextInt();
        kurseList.add(kurs);
        return kurs;
    }
    public static void kursNote(){
        System.out.println("geben Sie bitte Unterrichtname  ein");
        unterrict =scan.next();
        System.out.println("geben Sie bitte mindesnote für " + unterrict +"  ein");
        note =scan.nextDouble();
        System.out.println("geben Sie bitte Meinungsnoteprozent für " + unterrict+"  ein");
        meinungsNoteProzent=scan.nextDouble();
        kursNoteList.add(kursNote);
    }


    public static Lehrer lehrerAdd(){
        System.out.println("geben Sie bitte den Name des Lehrer ein");//lehrer olusturuldu
        lehrerName =scan.nextLine();
        //scan.next();//dummy cod
        System.out.println("geben Sie bitte fächer des Lerers ein");
        fach=scan.nextLine();
        lehrerList.add(lehrer);
        System.out.println(lehrerList);
        return lehrer;
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
    public double getMeinungsNoteProzent() {
        return meinungsNoteProzent;
    }
    public void setMeinungsNoteProzent(double meinungsNoteProzent) {
        this.meinungsNoteProzent = meinungsNoteProzent;
    }

    public int getWochenStunde() {
        return wochenStunde;
    }

    public void setWochenStunde(int wochenStunde) {
        this.wochenStunde = wochenStunde;
    }


}
