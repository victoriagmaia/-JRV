package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente {

    private int id_cliente;
    private String nome;
    private Long cpf;
    private String email;
    private int rg;
    private String telefone;

    public void inserirAluno() throws SQLException {

        String sql = "INSERT INTO cliente(nome_cliente, idade_cliente, cpf_cliente, email_aluno, telefone_aluno)VALUES(?, ?, ?, ?, ?)";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, getNome());
            ps.setLong(2, getCpf());
            ps.setInt(3, getRg());
            ps.setString(4, getEmail());
            ps.setString(5, getTelefone());
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_aluno to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}