package Esercizio2;

import java.util.List;

public class SIM {
    private String noTelefono;
    private double credito;


    public SIM(String noTelefono){
        this.noTelefono = noTelefono;
        this.credito = 0.0;

    }

    public String getNoTelefono(){
        return noTelefono;
    }
    public double getCredito(){
        return credito;
    }

    public void stampaDatiSIM(){
        System.out.println("Numero SIM: " + noTelefono);
        System.out.println("Credito disponibile: €" + credito);
    }

}
