//Aryane de Alcantara Chaves RA: 3489248
//Reinaldo Henrique da Cruz Barbosa RA: 3446783
//William Santos da Costa RA: 3215160

package atividadeconta;

import javax.swing.JOptionPane;//importe da classe Scanner

//classe ContaPoupanca recebe todos os métodos e atribrutos da classe Conta
//através de herança
public class ContaPoupanca extends Conta{

    String dataAniversarios;
    
    @Override//sobrescrita do metodo adquirido através do polimorfismo
    void saqueConta(double valor){
        if((saldo - valor) < 0){
            JOptionPane.showMessageDialog(null, "ERRO: Saldo ficará negativo");
        }else{
            saldo = saldo - valor;
            JOptionPane.showMessageDialog(null, "Saque realizado!\nSaldo "
                    + "atual: " + saldo);
        }
    }

    void dataAniversarios(String dStr) {
        dataAniversarios = dStr;
    }
    
}
