package Esercizio1;
public class Rettangolo {
    private double altezza;
    private double larghezza;

    // Costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);

        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma aree: " + sommaAree);
        System.out.println("Somma perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(4, 5);
        Rettangolo r2 = new Rettangolo(3, 6);

        stampaDueRettangoli(r1, r2);
    }
}

