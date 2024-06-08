/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

import com.gf.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author margalal, pinfersa, olimarno
 * 
 * UserDAO. 
 * LLama al DatabaseConfig.
 * 
 * Contiene métodos para añadir al usuario a la base de datos (addUser) y 
 * para encontrar el DNI en la base de datos para comprobar su 
 * existencia (encontrarDNI).
 * 
 */
public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO usuarios (nombre, apellidos, DNI, numBusca, otros) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConfig.getConnection(); 
                PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, "pruebaNombre");
            pst.setString(2, user.getApellidos());
            pst.setString(3, user.getDNI());
            pst.setInt(4, user.getNumBusca());
            pst.setString(5, user.getOtros());
            pst.executeUpdate();

        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) { 
                throw new IllegalArgumentException("El DNI ya existe en la base de datos");
        } else {
                e.printStackTrace();
            }
        }
    }

    public User encontrarDNI(String DNI) {
        String sql = "SELECT * FROM usuarios WHERE DNI = ?";
        User user = null;

        try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, DNI);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    user = new User();
                    user.setNombre(rs.getString("nombre"));
                    user.setApellidos(rs.getString("apellidos"));
                    user.setDNI(rs.getString("DNI"));
                    user.setNumBusca(rs.getInt("numBusca"));
                    user.setOtros(rs.getString("otros"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return user;
    }
}
