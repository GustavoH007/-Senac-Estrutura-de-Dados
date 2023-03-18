/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cliente;

/**
 *
 * @author gustavo.horikochi
 */

import lista.*;

public class UsarLista { 

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Gerson","123-333"));
        lista.inserir(new Contato("Sandra","855-235"));
        lista.inserir(new Contato("Anna","955-232"));
        lista.inserir(new Contato("José","353-232"));
        
        lista.exibir();
    }
}
