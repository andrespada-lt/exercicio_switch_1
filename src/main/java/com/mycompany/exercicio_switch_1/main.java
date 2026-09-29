package com.mycompany.exercicio_switch_1;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        int controle;
        double numeroa, numerob, resultado;
        controle = Integer.parseInt(JOptionPane.showInputDialog("\"Qual operação você quer executar ?\"\n" + "\n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão\""));
        numeroa = Integer.parseInt(JOptionPane.showInputDialog("insira o numero a: "));
        numerob = Integer.parseInt(JOptionPane.showInputDialog("insira o numero b: "));
        switch (controle){
            case 1:
                resultado = numeroa + numerob;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            case 2:
                resultado = numeroa - numerob;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            case 3:
                resultado = numeroa * numerob;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            case 4:
                resultado = numeroa / numerob;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida!");
            break;
        }
    }
}
