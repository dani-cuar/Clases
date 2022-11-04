package com.company.herencia;

import com.company.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    public double hora;

    public SmartWatch(){

    }

    public SmartWatch(String marca, double precio, String modelo, double peso, int presionArterial, int ritmoCardiaco, double hora) {
        super(marca, precio, modelo, peso, presionArterial, ritmoCardiaco);
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "hora=" + hora +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", presionArterial=" + presionArterial +
                ", ritmoCardiaco=" + ritmoCardiaco +
                '}';
    }
}
