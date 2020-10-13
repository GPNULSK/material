package com.example.domain;

import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;


public class Material {

    private String QHNDI;
    private String QORD;
    private String QHND;
    private String ITEM;
    private String CWAR;
    private String DSCA;
    private String DSCA2;

    public void setQHNDI(String QHNDI) {
        this.QHNDI = QHNDI;
    }

    public void setQORD(String QORD) {
        this.QORD = QORD;
    }

    public void setQHND(String QHND) {
        this.QHND = QHND;
    }

    public void setITEM(String ITEM) {
        this.ITEM = ITEM;
    }

    public void setCWAR(String CWAR) {
        this.CWAR = CWAR;
    }

    public void setDSCA(String DSCA) {
        this.DSCA = DSCA;
    }

    public void setDSCA2(String DSCA2) {
        this.DSCA2 = DSCA2;
    }

    public String getQHNDI() {
        return QHNDI;
    }

    public String getQORD() {
        return QORD;
    }

    public String getQHND() {
        return QHND;
    }

    public String getITEM() {
        return ITEM;
    }

    public String getCWAR() {
        return CWAR;
    }

    public String getDSCA() {
        return DSCA;
    }

    public String getDSCA2() {
        return DSCA2;
    }

    @Override
    public String toString() {
        return "Material{" +
                "QHNDI='" + QHNDI + '\'' +
                ", QORD='" + QORD + '\'' +
                ", QHND='" + QHND + '\'' +
                ", ITEM='" + ITEM + '\'' +
                ", CWAR='" + CWAR + '\'' +
                ", DSCA='" + DSCA + '\'' +
                ", DSCA2='" + DSCA2 + '\'' +
                '}';
    }
}
