/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

import static java.lang.Character.*;

/**
 *
 * @author user
 */
public class Task7 {
    public void run(){
        System.out.println("----- Задание 7 ------");
        
        System.out.print("Введите строку: ");
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        System.out.print("Введите букву: ");
        char letter = input.next().charAt(0);
        letter = toLowerCase(letter);
        
        char[] strArr = new char[str.length()] ; 
        int count = 0; 
        for (int i = 0; i < strArr.length; i++) { 
            strArr[i] = str.charAt(i); 
            if (strArr[i] == letter) count++; 
        }
        
        System.out.println("Буква " + letter + " встретилась "  + count + " раз в вашей строке." );
        System.out.println("----- Конец седьмого задания ------");
    }
}
