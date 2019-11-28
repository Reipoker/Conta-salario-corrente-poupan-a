//Aryane de Alcantara Chaves RA: 3489248
//Reinaldo Henrique da Cruz Barbosa RA: 3446783
//William Santos da Costa RA: 3215160

package atividadeconta;

//classe ContaCorrente recebe todos os métodos e atribrutos da classe Conta
//através de herança
public class ContaCorrente extends Conta{

    private double limite;//atributos privados que 
    private int gerente;//necessitam de encapsulamento
    private double taxaMensal;
       
    //setters que atribuem valor a variavel
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public void setGerente(int gerente){
        this.gerente = gerente;
    }
    
    public void setTaxaMensal (double taxaMensal){
        this.taxaMensal = taxaMensal;
    }
    
    //getters que retornam valor presente na variável
    public double getLimite(){
        return limite;
    }
    
    public int getGerente(){
        return gerente;
    }
    
    public double getTaxaMensal(){
        return taxaMensal;
    }
    
public void arrayCorrente(int a){//método que controla a array de objetos
                                //(recebe o indice da agencia)
    
        AbreCorrente abreC[] = new AbreCorrente[5];//cria array de 5 posições
        
        //incializando array
        abreC[0] = new AbreCorrente();
        abreC[1] = new AbreCorrente();
        abreC[2] = new AbreCorrente();
        abreC[3] = new AbreCorrente();
        abreC[4] = new AbreCorrente();
        
        //atribuindo valor
        abreC[0].gerente = 21;
        abreC[1].gerente = 25;
        abreC[2].gerente = 49;     
        abreC[3].gerente = 50;
        abreC[4].gerente = 83;
        
        abreC[0].limite = 550.30;
        abreC[1].limite = 700.00;
        abreC[2].limite = 1290.50;     
        abreC[3].limite = 2589.53;
        abreC[4].limite = 3490.87;
        
        abreC[0].taxaMensal = 13.10;
        abreC[1].taxaMensal = 22.10;
        abreC[2].taxaMensal = 28.30;     
        abreC[3].taxaMensal = 35.70;
        abreC[4].taxaMensal = 42.90;
        
        //atribuindo valor aos atributos de acordo com a escolha da agencia
        this.gerente = abreC[a].gerente;
        this.limite = abreC[a].limite;
        this.taxaMensal = abreC[a].taxaMensal;
        
    }

}
