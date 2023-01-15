package entities;

import java.util.Date;

public class Releve {

    private String RIB;
    private Date dateReleve;
    private double solde;
    private Operations operations;

    public Releve() {
    }

    public Releve(String RIB, Date dateReleve, double solde, Operations operations) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.operations = operations;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }
}
