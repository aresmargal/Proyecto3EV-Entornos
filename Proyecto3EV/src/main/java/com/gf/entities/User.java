/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.entities;

/**
 *
 * @author margalal, pinfersa, olimarno
 * 
 * Clase usuario.
 */
public class User {
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numBusca;
    private String otros;
    private String tipo; //administrador, paciente...

    public User() {
    }
    
    public User(String nombre, String DNI, int numBusca) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.numBusca = numBusca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumBusca() {
        return numBusca;
    }

    public void setNumBusca(int numBusca) {
        this.numBusca = numBusca;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
    
}
