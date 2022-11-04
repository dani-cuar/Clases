package com.company.clases;

public class SmartDevice {

    // 1. Atributos

    public String marca;
    public double precio;
    public String modelo;
    public double peso;
    public int presionArterial;
    public int ritmoCardiaco;

    // 2. Constructor

    public SmartDevice(){

    }

    public SmartDevice(String marca, double precio, String modelo, double peso, int presionArterial, int ritmoCardiaco) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.peso = peso;
        this.presionArterial = presionArterial;
        this.ritmoCardiaco = ritmoCardiaco;
    }
}
