package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rec")
public class Records {
    @Id
    @Column(name="barcode")
    protected String barcode;

    @Column(name="name")
    protected String name;

    @Column(name="color")
    protected String color;

    @Column(name="descr")
    protected String descr;
    
    public Records() {
    }
    
    public Records(String barcode, String name, String color, String descr) {
        this.barcode = barcode;
        this.name = name;
        this.color = color;
        this.descr = descr;
    }
    
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
