/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author gustavo.horikochi
 */
public class Lista {

    private Elemento inicio, atual, aux;

    public void inserir(Object objeto) {
        if (inicio == null) { //Verifica lista vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual; //Fica junto do atual
        }
    }
    
    public void exibir() {
        Elemento x = inicio;
        while(x != null) {
            System.out.println(x);
            x = x.getProx();
        }
    }
}
