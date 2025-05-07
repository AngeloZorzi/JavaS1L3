package Esercizio1;

public class RettangoloM {

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Rettangolo:");
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
        System.out.println();
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo rettangolo:");
        double area1 = r1.calcolaArea();
        double perimetro1 = r1.calcolaPerimetro();
        System.out.println("Area: " + area1);
        System.out.println("Perimetro: " + perimetro1);
        System.out.println();

        System.out.println("Secondo rettangolo:");
        double area2 = r2.calcolaArea();
        double perimetro2 = r2.calcolaPerimetro();
        System.out.println("Area: " + area2);
        System.out.println("Perimetro: " + perimetro2);
        System.out.println();

        System.out.println("Somma delle aree: " + (area1 + area2));
        System.out.println("Somma dei perimetri: " + (perimetro1 + perimetro2));
    }
}

