/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gtx_c.javaforewhile;

/**
 *
 * @gtx_ch
 */
public class JavaFOReWhile {

    public static void main(String[] args) {
        
        
        
        int i = 0;
        int J = 0;
        while(i < 11){
            System.out.println(i);
            i = i+1;
        }
        for(int j= 0; j < 11; j = ++j){   //++j = pré-incremento / j++ = pós-incremento
            System.out.println(j);
            J = j;
        }
        System.out.println(i+J);
        
        
        //Controlando o loop exemplo for
        
        int x = 0;
        int y = 0;
        for(int I = x;I < y; I++){
            if(I % 19 == 0){
                System.out.println("Achei um número divisível por 19 entre x e y");
                break;
            } 
            
        }
    }
}
