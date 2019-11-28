//Aryane de Alcantara Chaves RA: 3489248
//Reinaldo Henrique da Cruz Barbosa RA: 3446783
//William Santos da Costa RA: 3215160

package atividadeconta;

import java.text.DateFormat; //importando classe que formata data
import java.util.Date; //importando classe que pega a data do sistema
import javax.swing.JComboBox; //importando classe para a utilização do JComboBox
import javax.swing.JOptionPane; //importando classe para a utilização do JoptionPane

public class DigitaConta {

    public static void main(String[] args) { //classe principal
        
        int r, aux, x; //variaveis do tipo inteiro
        double valor; // variavel do tipo double
        String ag; // variavel do tipo String
        //Criando objetos
        java.util.Date d = new Date(); 
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaSalario  cs = new ContaSalario();
        //Atribui à variável "dStr" a data formatada
        String dStr = java.text.DateFormat.getDateInstance
        (DateFormat.MEDIUM).format(d);
        //cria um vetor de opções
        Object[] agencia = {"1235", "6162", "5789", "3426", "9098"};
                    JComboBox optionList = new JComboBox(agencia);
        Object getAgencia;//vaiável do tipo Object
        
        do{//repetirá o código até que a resposta "r" seja 0
            
            Object[] op1 = { "Sair", "Conta Corrente", "Conta Poupança", 
                "Conta Salário"};//cria um vetor de opções 
            r = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Olá",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
            null, op1, op1[0]);//atribui a resposta à variável "r"
            
            switch (r){//executa escolha do usuario
                case 0://caso tenha escolhido 0
                    break;
                case 1://caso tenha escolhido 1
                    
                    optionList.setSelectedIndex(0);//manda um indice para o comboBox
                    JOptionPane.showMessageDialog(null, optionList, "Escolha "
                            + "a Agência", JOptionPane.QUESTION_MESSAGE);//apresenta o comboBox 
                    getAgencia = optionList.getSelectedItem();//atribui à variável "getAgencia" o item selecionado
                    ag = getAgencia.toString();//atribui à variável "ag" getAgencia convertido
                    cc.agencia = ag; //manda para o atributo agencia da ContaCorrente
                    x = optionList.getSelectedIndex(); //atribui à variável "x" o valor do indice selecionado
                    cc.arrayCorrente(x);//chama o método "arrayCorrente" da classe ContaCorrente 
                    
                    JOptionPane.showMessageDialog(null, "Entrada de dados");//exibe uma mensagem na tela
                    
                    //pegando valores
                    cc.nomeCliente = JOptionPane.showInputDialog("Digite o "
                             + "nome do Cliente:", null);
                    
                    cc.numeroConta = JOptionPane.showInputDialog("Digite o "
                            + "número da conta", null);
                    
                    cc.numeroCliente = JOptionPane.showInputDialog("Digite o "
                            + "número do cliente", null);
                    
                    cc.RG = JOptionPane.showInputDialog("Digite o RG do "
                            + "Cliente", null);
                    
                    cc.CPF = JOptionPane.showInputDialog("Digite o CPF do "
                            + "Cliente", null);        
                
                    cc.dataAbertura = dStr;

                    do{//executa código até que "aux" seja 4
                        
                        //cria um vetor de opções
                        Object[] op2 = { "Consultar Saldo", "Fazer Depósito", 
                            "Realizar Saque", "Ver Informações", "Voltar"};
                        //atribui a resposta à variável "aux"
                        aux = JOptionPane.showOptionDialog(null, "Escolha uma"
                                + " opção:", "Olá, " + cc.nomeCliente,
                                    JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.WARNING_MESSAGE, null, op2, op2[0]);
                    
                        switch(aux){//executa escolha do usuário
                            case 0://caso tenha escolhido 0
                                //mostra saldo da ContaCorrente
                                JOptionPane.showMessageDialog(null, "Saldo "
                                        + "conta corrente: " + cc.saldo);
                                break;
                            case 1://caso tenha escolhido 1
                                //Executa método "depositoConta" da ContaCorrente
                                valor = Double.parseDouble(JOptionPane.
                                        showInputDialog("Digite o valor a ser "
                                                + "depositado: ", null ));
                                cc.depositoConta(valor);
                                JOptionPane.showMessageDialog(null, "Depósito "
                                        + "realizado\nSaldo conta "
                                            + "corrente: " + cc.saldo);
                                break;
                            case 2://caso tenha escolhido 2
                                //Executa método "saqueConta" da ContaCorrente
                                valor = Double.parseDouble(JOptionPane.
                                        showInputDialog("Digite o valor a ser "
                                                + "creditado: ", null ));
                                cc.saqueConta(valor);
                                JOptionPane.showMessageDialog(null, "Saque "
                                        + "realizado\nSaldo conta "
                                            + "corrente: " + cc.saldo);
                                break;
                            case 3://caso tenha escolhido 3
                                //mostra informações da ContaCorrente
                                JOptionPane.showMessageDialog(null, "Olá, "+ cc.nomeCliente
                                    + "\nNúmero do Cliente: " + cc.numeroCliente
                                    + "\nCPF Cliente: " + cc.CPF
                                    + "\nRG Clente: " + cc.RG
                                    + "\nAgencia: " + cc.agencia
                                    + "\nNúmero da Conta: " + cc.numeroConta
                                    + "\nGerente: " + cc.getGerente()
                                    + "\nLimite: " + cc.getLimite()
                                    + "\nSaldo: " + cc.saldo
                                    + "\nTaxa Mensal: " + cc.getTaxaMensal()
                                    + "\nData de Abertura: " + cc.dataAbertura);
                                break;
                            default://caso tenha escolhido outra opção
                                break;
                        }//fim do switch
                    }while(aux != 4);//fim do doWhile
                    
                    break;
                    
                case 2://caso tenha escolhido 2
                    
                    optionList.setSelectedIndex(0);//manda um indice para o comboBox
                    JOptionPane.showMessageDialog(null, optionList, "Escolha "
                            + "a Agência", JOptionPane.QUESTION_MESSAGE);//apresenta o comboBox
                    getAgencia = optionList.getSelectedItem();//atribui à variável "getAgencia" o item selecionado
                    ag = getAgencia.toString();//atribui à variável "ag" getAgencia convertido
                    cp.agencia = ag;//manda para o atributo agencia da ContaPoupanca
                    
                    //exibe mensagem
                    JOptionPane.showMessageDialog(null, "Entrada de dados");
                    
                    //pegando valores
                    cp.nomeCliente = JOptionPane.showInputDialog("Digite o "
                             + "nome do Cliente:", null);
                    
                    cp.numeroConta = JOptionPane.showInputDialog("Digite o "
                            + "número da conta", null);
                    
                    cp.numeroCliente = JOptionPane.showInputDialog("Digite o "
                            + "número do cliente", null);
                    
                    cp.RG = JOptionPane.showInputDialog("Digite o RG do "
                            + "Cliente", null);
                    
                    cp.CPF = JOptionPane.showInputDialog("Digite o CPF do "
                            + "Cliente", null);        
                
                    cp.dataAbertura = dStr;
                    cp.dataAniversarios = dStr;
                    
                    do{//executa o código até que "aux" = 4
                        
                        //cria um vetor de opções
                        Object[] op2 = { "Consultar Saldo", "Fazer Depósito", 
                            "Realizar Saque", "Ver Informações", "Voltar"};
                        //atribui a resposta à variável "aux"
                        aux = JOptionPane.showOptionDialog(null, "Escolha uma"
                                + " opção:", "Olá, " + cc.nomeCliente,
                                    JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.WARNING_MESSAGE, null, op2, op2[0]);
                        
                        switch(aux){//executa escolha do usuário
                            case 0://caso tenha escolhido 0
                                //mostra saldo da ContaPouoanca
                                JOptionPane.showMessageDialog(null, "Saldo "
                                        + "conta poupança: " + cp.saldo);
                                break;
                            case 1://caso tenha escolhido 1
                                 //Executa método "depositoConta" da ContaPoupanca
                                valor = Double.parseDouble(JOptionPane.
                                        showInputDialog("Digite o valor a ser "
                                                + "depositado: ", null ));
                                cp.depositoConta(valor);
                                cp.dataAniversarios(dStr);
                                JOptionPane.showMessageDialog(null, "Depósito "
                                        + "realizado\nPróximo  Aniversário: "
                                        + cp.dataAniversarios + "\nSaldo conta "
                                            + "poupança: " + cp.saldo);
                                break;
                            case 2://caso tenha escolhido 2
                                //Executa método "saqueConta" da ContaPoupanca
                                valor = Double.parseDouble(JOptionPane.
                                        showInputDialog("Digite o valor a ser "
                                                + "creditado: ", null ));
                                cp.saqueConta(valor);
                                break;
                            case 3://caso tenha escolhido 3
                                //mostra informações de ContaPoupanca
                                JOptionPane.showMessageDialog(null, "Olá, "+ cp.nomeCliente
                                    + "\nNúmero do Cliente: " + cp.numeroCliente
                                    + "\nCPF Cliente: " + cp.CPF
                                    + "\nRG Clente: " + cp.RG
                                    + "\nAgencia: " + cp.agencia
                                    + "\nSaldo: " + cp.saldo
                                    + "Próximo aniversário: " + cp.dataAniversarios
                                    + "\nData de Abertura: " + cp.dataAbertura);
                                break;
                            default://caso tenha escolhido outra opção
                                break;
                        }//fim do switch
                        
                    }while(aux != 4);//fim do doWhile
                    break;
                    
                case 3://caso tenha escolhido 3
                    optionList.setSelectedIndex(0);//manda um indice para o comboBox
                    JOptionPane.showMessageDialog(null, optionList, "Escolha "
                            + "a Agência", JOptionPane.QUESTION_MESSAGE);//apresenta o comboBox
                    getAgencia = optionList.getSelectedItem();//atribui à variável "getAgencia" o item selecionado
                    ag = getAgencia.toString();//atribui à variável "ag" getAgencia convertido
                    cs.agencia = ag;//manda para o atributo agencia da ContaSalario
                    
                    //exibe mensagem na tela
                    JOptionPane.showMessageDialog(null, "Entrada de dados");
                    
                    //pegando valores
                    cs.nomeCliente = JOptionPane.showInputDialog("Digite o "
                             + "nome do Cliente:", null);
                    
                    cs.numeroConta = JOptionPane.showInputDialog("Digite o "
                            + "número da conta", null);
                    
                    cs.numeroCliente = JOptionPane.showInputDialog("Digite o "
                            + "número do cliente", null);
                    
                    cs.RG = JOptionPane.showInputDialog("Digite o RG do "
                            + "Cliente", null);
                    
                    cs.CPF = JOptionPane.showInputDialog("Digite o CPF do "
                            + "Cliente", null);        
                
                    cs.setNomeEmpresa(JOptionPane.showInputDialog("Digite o "
                            + "nome da empresa", null));
                    
                    cs.setCnpjEmpresa(JOptionPane.showInputDialog("Digite o CNPJ da "
                            + "Empresa", null));
                    
                    cs.dataAbertura = dStr;
                    
                    do{//executa código até que "aux" = 3
                        
                        //cria um vetor de opções
                        Object[] op2 = { "Consultar Saldo", "Realizar Saque", 
                            "Ver Informações", "Voltar"};
                        //atribui a resposta à variável "aux"
                        aux = JOptionPane.showOptionDialog(null, "Escolha uma"
                                + " opção:", "Olá, " + cc.nomeCliente,
                                    JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.WARNING_MESSAGE, null, op2, op2[0]);
                        
                        switch(aux){//executa escolha do usuário
                            case 0://caso tenha escolhido 0
                                //mostra saldo da ContaSalario
                                JOptionPane.showMessageDialog(null, "Saldo "
                                        + "conta poupança: " + cs.saldo);
                                break;
                            case 1://caso tenha escolhido 1
                                 //Executa método "saqueConta" da ContaSalario
                                valor = Double.parseDouble(JOptionPane.
                                        showInputDialog("Digite o valor a ser "
                                                + "creditado: ", null ));
                                cs.saqueConta(valor);
                                JOptionPane.showMessageDialog(null, "Saque "
                                        + "realizado\nSaldo conta "
                                            + "salário: " + cs.saldo);
                                break;
                            case 2://caso tenha escolhido 2
                                //mostra informações da classe ContaSalario
                                JOptionPane.showMessageDialog(null, "Olá, "+ cs.nomeCliente
                                    + "\nNúmero do Cliente: " + cs.numeroCliente
                                    + "\nCPF Cliente: " + cs.CPF
                                    + "\nRG Clente: " + cs.RG
                                    + "\nAgencia: " + cs.agencia
                                    + "\nSaldo: " + cs.saldo
                                    + "\nData de Abertura: " + cs.dataAbertura
                                    + "\nEmpregador: " + cs.getNomeEmpresa()
                                    + "\nCNPJ do Empregador: " + cs.getCnpjEmpresa());
                                break;
                            default://caso tenha escolhido outra opção
                                break;
                        }//fim do switch
                        
                    }while(aux != 3);//fim do doWhile
                    break;
                    
                default://caso tenha escolhido outra opção
                    break;
            }//fim do switch
            
        }while(r != 0);//fim do doWhile
        
    }
    
}
