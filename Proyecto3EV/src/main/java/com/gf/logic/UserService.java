/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.logic;

import com.gf.dao.UserDAO;
import com.gf.entities.User;

/**
 *
 * @author margalal, pinfersa, olimarno
 * 
 * Archivo de lógica, UserService. 
 * Es llamado por controlador.
 * 
 * Contiene el método para llamar al UserDAO para añadir al usuario.
 */

public class UserService {
    private UserDAO userDao;

    public UserService() {
        this.userDao = new UserDAO();
    }

    public void addUser(User user){ 
        userDao.addUser(user);
    }
}

