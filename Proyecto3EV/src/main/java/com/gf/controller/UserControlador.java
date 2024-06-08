/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.controller;

import com.gf.view.AddUser;
import com.gf.logic.UserService;
import com.gf.view.SeleccionUser;

/**
 *
 * @author margalal, pinfersa, olimarno
 * 
 * Controlador del usuario, llamado por el Main.
 * 
 * Contiene métodos para mostrar las ventanas/vistas (JFrames)
 */
public class UserControlador {

    private UserService userService;

    public UserControlador() {
        this.userService = new UserService();
    }
    
    public void mostrarSeleccionUser(){
        SeleccionUser seleccionUser = new SeleccionUser(this);
        seleccionUser.setVisible(true);
    }
    
    public void mostrarAddUser(String tipo){
        AddUser addUser = new AddUser(this, tipo);
        addUser.setVisible(true);

    }

}
