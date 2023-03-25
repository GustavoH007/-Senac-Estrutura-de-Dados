/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.pkg2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author gustavo.horikochi
 * Elaborar um projeto Java que gere valores aleatórios para
 * alimentar um array bidimensional 4x4 do tipo inteiro. Exiba o
 * conteúdo do array.
 */
public class Exemplo2 {
    
    static int[][]m = new int[5][3];
    static Random rd = new Random();
    
    public static void inserir() {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                m[i][j] = rd.nextInt(10);
            }
        }
    }
    
    public static void mostrar() {
//        for(int i = 0; i < m.length; i++) {
//            for(int j = 0; j < m[0].length; j++) {
//                System.out.print(m[i][j] + "  ");
//            }
//           System.out.println("");
//        }
//      for(int[] v: m){
//          for(int elemento: v) {
//             System.out.println(elemento + "  ");
//         }
//         System.out.println("");
//      }
       System.out.println(Arrays.deepToString(m).replace("]" , "\n"));
    }
    
    public static void main(String[] args) {
        
        inserir();
        mostrar();
        
    }
}
