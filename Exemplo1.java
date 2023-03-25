/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDados.pkg1;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author gustavo.horikochi
 * Elabore um projeto Java que defina um array de tipo float
 * e tamanho igual a 10. Armazene no array valores aleatórios e
 * exiba o seu conteúdo.
 */
public class Exemplo1 {
    
    static float[] v = new float[10];
    static Random rd = new Random();
    
    public static void entrada() {
        float vi = 12;
        float vf = 100;
        for(int i = 0; i < v.length; i++) {
            v[i] = vi + rd.nextFloat()* (vf - vi);
        }
    }
    
    public static void saida() {
//        for(float n:v) {
//            System.out.println(n);
//         }
            System.out.println(Arrays.toString(v).replace((",") , ("\n")));
    }
    
    public static void main(String[] args) {
        
        entrada();
        saida();
    
    }
}
