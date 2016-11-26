/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Введите n: ");
        int n = Integer.parseInt(sc.nextLine());

        int j = 1;
        for (int i = 0; i < n; i++) {
            j *= x;
        }
        System.out.println(j);
    }

}
