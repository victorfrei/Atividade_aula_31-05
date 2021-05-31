
package javaapplication20;


public class main {

    
    public static void main(String[] args) {
        Dependente d = new Dependente("dependente",14,"19781283");
        Funcionaria f = new Funcionaria("nome",23,"123712983","area de trabalho","area de atuação",21621,d);
        
        System.out.println("---------Dependente-------");
        System.out.println(f.getNomeDependente());
        System.out.println(f.getCpfDependente());
        System.out.println(f.getIdadeDependente());
        
        System.out.println("---------Funcionaria-------");
        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.println(f.getIdade());
        
    }
    
}
