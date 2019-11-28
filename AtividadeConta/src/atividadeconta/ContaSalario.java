//Aryane de Alcantara Chaves RA: 3489248
//Reinaldo Henrique da Cruz Barbosa RA: 3446783
//William Santos da Costa RA: 3215160

package atividadeconta;

//classe ContaSalario recebe todos os métodos e atribrutos da classe Conta
//através de herança
public class ContaSalario extends Conta{
    
    private String nomeEmpresa;//atributos privados que 
    private String cnpjEmpresa;//necessitam de encapsulamento
    
    //setters que atribuem valor a variavel
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void setCnpjEmpresa(String cnpjEmpresa){
        this.cnpjEmpresa = cnpjEmpresa;
    }
    
    //getters que retornam valor presente na variável
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    
    public String getCnpjEmpresa(){
        return cnpjEmpresa;
    }
    
}
