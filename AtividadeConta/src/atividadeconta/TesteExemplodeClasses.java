//Aryane de Alcantara Chaves RA: 3489248
//Reinaldo Henrique da Cruz Barbosa RA: 3446783
//William Santos da Costa RA: 3215160

package atividadeconta;

import java.util.Scanner;//importação para a utilização da classe scanner

public class TesteExemplodeClasses { 
    
    public static void main(String[] args) { //classe principal
        
        Scanner ler = new Scanner(System.in);//cria o objeto tipo Scanner
        ContaCorrente cc = new ContaCorrente();//cria o objeto tipo ContaCorrente
        ContaPoupanca cp = new ContaPoupanca();//cria o objeto tipo ContaPoupanca
        int aux = 0; //variavel auxiliar para indice de while tipo inteiro
        double valor; //variavel para valor tipo double
        
        while(aux != 3){//executará o código enquanto "aux" for diferente de 3
            
            //menu
            System.out.println("Escolha uma opcão:");
            System.out.println("1 - Saque Conta Corrente");
            System.out.println("2 - Saque Conta Poupança");
            System.out.println("3 - Sair");
            aux = ler.nextInt();//atribui entrada do usuario na variavel "aux"
            switch(aux){//executa escolha do usuario
                case 1://caso tenha digitado 1
                    //informa o saldo atual da conta corrente
                    System.out.println("Saldo em Conta Corrente: " + cc.saldo);
                    System.out.println("Informe o valor do saque desejado: ");
                    valor = ler.nextDouble();//recebe valor que deseja creditar
                    cc.saqueConta(valor);//credita valor
                    //informa novo saldo
                    System.out.println("Saldo em Conta Corrente: " + cc.saldo);
                    break;
                case 2://caso tenha digitado 2
                    //informa o saldo atual da conta poupança
                    System.out.println("Saldo em Poupança: " + cp.saldo);
                    System.out.println("Informe o valor do saque desejado: ");
                    valor = ler.nextDouble();//recebe valor que deseja creditar
                    cp.saqueConta(valor);//credita valor
                    //informa novo saldo
                    System.out.println("Saldo em Poupança: " + cp.saldo);
                    break;
                case 3://caso tenha digitado 3
                    //o programa se encerra
                    break;
                default://caso tenha digitado outra opção
                    System.err.println("Opção Inválida");
                    break;
            }//fim do switch
        }//fim do while
    }
    
}