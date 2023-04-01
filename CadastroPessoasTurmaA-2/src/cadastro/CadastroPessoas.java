package cadastro;

import estrutura.MeuArray;
import estrutura.Pessoa;


/*
*  Professor Gerson Risso
 */
public class CadastroPessoas {

    public static void main(String[] args) { 
        MeuArray.inserir(new Pessoa("Gerson", 31));
        MeuArray.inserir(new Pessoa("Sandra", 31));
        MeuArray.inserir(new Pessoa("Mel", 3));
        MeuArray.inserir(new Pessoa("Gaia", 4));
        MeuArray.inserir(new Pessoa("Tonica", 8));
        MeuArray.mostrar();
        System.out.println("==== Pesquisando ... ====");
        
        Pessoa p=MeuArray.pesquisar(-5000);
        if(p!=null){
            System.out.println(p);
        }else{
            System.out.println("Não achei!!");
        }
    }
}
