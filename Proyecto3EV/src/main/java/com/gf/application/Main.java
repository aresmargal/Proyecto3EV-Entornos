/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.application;

import com.gf.controller.UserControlador;

/**
 *
 * @author margalal, pinfersa, olimarno
 * 
 * Archivo Main. Llama al controlador, ubicado en com.gf.UserControlador
 */
public class Main {
    public static void main(String[] args) {
        UserControlador controlador = new UserControlador();
        controlador.mostrarSeleccionUser();
    }
}
