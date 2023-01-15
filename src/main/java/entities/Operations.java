package entities;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {

    private Date dateDebut;
    private Date dateFin;
   private List<Operation> operation = new ArrayList<>();


    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin, List<Operation> operation) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operation = operation;
    }

    public Operations(Date date, Date date1) {
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", operation=" + operation +
                "}\n" ;
    }
}
