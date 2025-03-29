/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class GerenciadorConexao {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/bdmodelo";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    private Connection conexao;
    
    public GerenciadorConexao() {
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
}
