/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.logic;

import com.gf.dao.UserDAO;
import com.gf.entities.User;

/**
 *
 * @author Ares
 */



public class UserService {
    private UserDAO userDao;

    public UserService() {
        this.userDao = new UserDAO();
    }


    public void addUser(User user){
        if(user.getNombre() == null || user.getNombre().isEmpty()){
            System.out.println("El campo 'nombre' es necesario");
        }
        if(userDao.encontrarDNI(user.getDNI())!= null){
            System.out.println("Ese DNI ya existe");
        }
        
        userDao.addUser(user);
    }
}

