/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3_1;

/**
 *
 * @author hanif
 */
import java.util.Scanner;
public class TugasPertemuan3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String angka1 ="";
        String angka2 ="";
        String angka3 ="";
    
   
            System.out.print("number 1 = ");
            angka1 = input.next();
            
            System.out.print("number 2 = ");
            angka2 = input.next();
            
            System.out.print("number 3 = ");
            angka3 = input.next();
        
        int a1 = Integer.parseInt(angka1);
        int a2 = Integer.parseInt(angka2);
        int a3 = Integer.parseInt(angka3);
               
        System.out.println("Rata-rata = "+(a1+a2+a3)/3);
    }
    
}
