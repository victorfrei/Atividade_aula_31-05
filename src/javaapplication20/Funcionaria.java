
package javaapplication20;


public class Funcionaria extends Pessoa {
    private String area;
    private String atuacao;
    private int id;
    private Dependente d; 
    
    
    public Funcionaria(String nome, int idade, String cpf,String area, String atuacao, int id,Dependente d) {
        super(nome, idade, cpf);
        this.area = area;
        this.atuacao = atuacao;
        this.id = id;
        this.d = d;
    }        
            
       
     
    public String getNomeDependente() {
        return d.getNome();
    }
    
    
    public void setNomeDependente(String nome) {
        d.nome = nome;
    }

    
    public int getIdadeDependente() {
        return d.idade;
    }

    
    public void setIdadeDependente(int idade) {
        d.idade = idade;
    }

    
    public String getCpfDependente() {
        return this.cpf;
    }

    
    public void setCpfDependente(String cpf) {
        this.cpf = cpf;
    }
    
       

    @Override
    public String getNome() {
        return this.nome;
    }

    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
      
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    


    
   
    
    
}
