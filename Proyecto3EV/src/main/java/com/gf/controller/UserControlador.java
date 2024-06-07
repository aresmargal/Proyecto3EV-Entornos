/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.controller;

import com.gf.entities.User;
import com.gf.view.AddUser;
import com.gf.view.SeleccionUser;
import com.gf.logic.UserService;

/**
 *
 * @author margalal, pinfersa, olimarno
 * 
 * Controlador del usuario, llamado por el Main.
 * 
 * Contiene métodos para mostrar las ventanas/vistas (JFrames) y
 * llama a la lógica (UserService) para añadir al usuario.
 */
public class UserControlador {

    private UserService userService;

    public UserControlador() {
        this.userService = new UserService();
    }
    
    public void mostrarAddUser(){
        AddUser addUser = new AddUser(this);
        addUser.setVisible(true);
    }

    public void mostrarSeleccionUser(){
        SeleccionUser seleccionUser = new SeleccionUser(this);
        seleccionUser.setVisible(true);
    }
    
    public void addUser(String name, String DNI, int numBusca) {
        User user = new User(name, DNI, 0);
            userService.addUser(user);
    }
}
