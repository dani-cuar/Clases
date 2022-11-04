package com.company.herencia;

import com.company.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public boolean llamadaentrante;

    public SmartPhone(String marca, int precio, String modelo, double peso, int presionArterial, int ritmoCardiaco, boolean llamadaentrante) {
        super(marca, precio, modelo, peso, presionArterial, ritmoCardiaco);
        this.llamadaentrante = llamadaentrante;
    }

    public SmartPhone(){

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "llamadaentrante=" + llamadaentrante +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", presionArterial=" + presionArterial +
                ", ritmoCardiaco=" + ritmoCardiaco +
                '}';
    }
}
