package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(4, 6);
        Rettangolo r2 = new Rettangolo(3.5, 2.0);


        RettangoloM.stampaRettangolo(r1);


        RettangoloM.stampaDueRettangoli(r1, r2);
    }
}

