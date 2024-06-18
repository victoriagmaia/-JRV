package org.example;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Querys {

    public static void main(String[] args) throws SQLException {

        String menu = "1-Cadastrar\n2-Veiculo\n3-Apagar\n4-Status Serviço\n0-Sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                    Long cpf  = Long.parseLong(JOptionPane.showInputDialog("Digite o seu cpf"));
                    String email = JOptionPane.showInputDialog("Digite o email do cliente");
                    int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o rg do cliente"));
                    String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente");
                    Cliente cliente = new Cliente();
                    cliente.setNome(nome);
                    cliente.setCpf(cpf);
                    cliente.setEmail(email);
                    cliente.setRg(rg);
                    cliente.setTelefone(telefone);


                    break;
                case 2:
                    String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo");
                    Long ano  = Long.parseLong(JOptionPane.showInputDialog("Digite o ano do carro"));
                    String servico = JOptionPane.showInputDialog("Digite o tipo de serviço a ser realizado");

                    Veiculo veiculo = new Veiculo();
                    veiculo.setModelo(modelo);
                    veiculo.setAno(ano);
                    veiculo.setServico(servico);
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
