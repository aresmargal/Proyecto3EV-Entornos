/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

import com.gf.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ares
 */
public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO users (nombre, apellidos, DNI, numBusca, otros, tipo) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConfig.getConnection(); 
                PreparedStatement pst = conn.prepareStatement(sql)) {

                pst.setString(1, user.getNombre());
                pst.setString(2, user.getApellidos());
                pst.setString(3, user.getDNI());
                pst.setInt(4, user.getNumBusca());
                pst.setString(5, user.getOtros());
                pst.setString(6, user.getTipo());
                pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
}

