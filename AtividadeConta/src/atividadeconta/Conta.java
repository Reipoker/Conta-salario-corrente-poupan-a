//Aryane de Alcantara Chaves RA: 3489248
//Reinaldo Henrique da Cruz Barbosa RA: 3446783
//William Santos da Costa RA: 3215160

package atividadeconta;

public abstract class Conta {//classe abstrata, não gera objeto

    //
    protected String nomeCliente;
    protected String numeroConta;
    protected String numeroCliente;
    protected double saldo;
    protected String CPF;
    protected String RG;
    protected String agencia;
    protected String dataAbertura;
    
    void saqueConta(double valor){
        saldo = saldo - valor; // metodo
    }
    
    void depositoConta(double valor){
        saldo = saldo + valor; //metodo
    }
    
    Conta(){
        saldo = 250.00; //construtor
    }
    
}
