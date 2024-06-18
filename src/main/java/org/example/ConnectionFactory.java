/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "92912405";
    private String host = "localhost";
    private String porta = "3306";
    private String timezone = "America/Sao_Paulo";
    private String bd = "Universidade";

    public Connection obtemConexao(){
        try {
            String url = "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=" + timezone;
            Connection conectar = DriverManager.getConnection(url,usuario,senha);

            if(conectar != null ) {
                System.out.println("Conexão estabelecida com sucesso");

            }
            return conectar;

        }
        catch(SQLException e){
            System.out.println("Erro ao estabelecer a conexão com o banco");
            e.printStackTrace();
            return null;

        }
    }


    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.obtemConexao();

        if (connection != null){
            System.out.println("Conexão testada e aprovada");

        }else{
            System.out.println("Falha na conexão");
        }
    }
}
