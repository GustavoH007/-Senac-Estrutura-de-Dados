package cadastro;

import estrutura.MeuArray;
import estrutura.Pessoa;


/*
*  Gustavo Horikochi
 */
public class CadastroPessoas {
    public static void main(String[] args) {

        MeuArray.inserir(new Pessoa("Gerson", 31));
        MeuArray.inserir(new Pessoa("Sandra", 32));
        MeuArray.inserir(new Pessoa("Mel", 3));
        MeuArray.inserir(new Pessoa("Gaia", 4));
        MeuArray.inserir(new Pessoa("Tonica1", 8));
        MeuArray.inserir(new Pessoa("Tonica2", 8));
        MeuArray.inserir(new Pessoa("Tonica3", 8));
        MeuArray.inserir(new Pessoa("Tonica4", 8));
        MeuArray.inserir(new Pessoa("Tonica5", 8));
        MeuArray.inserir(new Pessoa("Tonica6", 8));
        //MeuArray.mostarar();
/*         System.out.println("\n====== ...PESQUISANDO... ======");
        Pessoa p = MeuArray.pesquisar(2);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Nào Achei");
        } */

        MeuArray.mostrar();
        System.out.println("\n===== ...REMOVENDO... ======");

        int id = 5;
        if (MeuArray.remover(id)) {
            System.out.println("ID = " + id + " removido com sucesso");
        } else {
            System.out.println("Cadastro não removido");
        }
        MeuArray.mostrar();
    }    
}
