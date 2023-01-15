package entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {

    private String type;
    private Date date ;
    private double montent;
    private String description;

    private  Operation operation;


    public Operation() {

    }

    public Operation(String type, Date date, double montent, String description) {
        this.type = type;
        this.date = date;
        this.montent = montent;
        this.description = description;
    }

    public Operation(String type, Date date, double montent, String description, Operation operation) {
        this.type = type;
        this.date = date;
        this.montent = montent;
        this.description = description;
        this.operation = operation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontent() {
        return montent;
    }

    public void setMontent(double montent) {
        this.montent = montent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
