import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Schuler {
    /*
    ----------Student Class Özellikleri :

fields : name,stuNo,classes,course1,course2,course3
Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
-->öğrenci(), topluSınavNotuEkle(), gectiMi() ortlamaHesapla(), notYazdır()

     */
     static String schulerName;
     static String schulerNachname;
     static int schulNo;
     static int klase;
     static String kurs1;
     static String kurs2;
     static String kurs3;

    //Kurse kurs1 =new Kurse();

    public String getSchulerName() {
        return schulerName;
    }

    public void setSchulerName(String schulerName) {
        this.schulerName = schulerName;
    }

    public String getSchulerNachname() {
        return schulerNachname;
    }

    public void setSchulerNachname(String schulerNachname) {
        this.schulerNachname = schulerNachname;
    }

    public int getSchulNo() {
        return schulNo;
    }

    public void setSchulNo(int schulNo) {
        this.schulNo = schulNo;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public String getKurs1() {
        return kurs1;
    }

    public void setKurs1(String kurs1) {
        this.kurs1 = kurs1;
    }

    public String getKurs2() {
        return kurs2;
    }

    public void setKurs2(String kurs2) {
        this.kurs2 = kurs2;
    }

    public String getKurs3() {
        return kurs3;
    }

    public void setKurs3(String kurs3) {
        this.kurs3 = kurs3;
    }



    /*Kurse mathe =new Kurse("Ali","Mathe",8,45);
    Kurse sprach =new Kurse("Veli" ,"sprac",4,50);
    Kurse fizik =new Kurse("Ersin","Fizik",4,35);
    */
    public Schuler(){

    }
    public Schuler(String schulerName, String schulerNachname, int schulNo, int klase, String kurs1, String kurs2, String kurs3) {
        this.schulerName = schulerName;
        this.schulerNachname = schulerNachname;
        this.schulNo = schulNo;
        this.klase = klase;
        this.kurs1 = kurs1;
        this.kurs2 = kurs2;
        this.kurs3 = kurs3;

    }
}

