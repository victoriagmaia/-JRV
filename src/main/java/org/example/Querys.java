package org.example;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Querys {

    public static void main(String[] args) throws SQLException {

        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                    Long cpf  = Long.parseLong(JOptionPane.showInputDialog("Digite o seu cpf"));
                    String email = JOptionPane.showInputDialog("Digite o email do cliente");
                    int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o rg do cliente"));
                    String telefone = JOptionPane.showInputDialog("Digite o telefone do aluno");
                    Cliente cliente = new Cliente();
                    cliente.setNome(nome);
                    cliente.setCpf(cpf);
                    cliente.setEmail(email);
                    cliente.setRg(rg);
                    cliente.setTelefone(telefone);
                    cliente.inserirAluno();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 0);
    }
}
