package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Veiculo {

    private int id_veiculo;
    private String modelo;
    private Long ano;
    private String servico;


    public void inserirVeiculo() throws SQLException {

        String sql = "INSERT INTO veiculo(modelo_veiculo, ano_veiculo, servico_veiculo)VALUES(?, ?, ?, ?)";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, getModelo());
            ps.setLong(2, getAno());
            ps.setString(3, getServico());
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @return the id_veiculo
     */
    public int getId_veiculo() {
        return id_veiculo;
    }

    /**
     * @param id_veiculo the id_veiculo to set
     */
    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    /**
     * @return the nome
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the nome to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public Long getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Long ano) {
        this.ano = ano;
    }

    /**
     * @return the servico
     */
    public String getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(String servico) {
        this.servico = servico;
    }

}

