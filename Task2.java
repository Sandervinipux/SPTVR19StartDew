/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задание 2 ------");
        int max = 10; 
        int min = 2;
        Scanner input = new Scanner (System.in); 
        System.out.println("Было загадано число от 2 до 10");
        System.out.print("Попробуй отгадать: ");
        int userNum = input.nextInt(); 
        Random ran = new Random(); 
        int ranNum = ran.nextInt(9) + 2;
        if (ranNum == userNum) System.out.println("Ты выиграл"); 
        else System.out.println("Ты проиграл, \nЗагаданное число: " + ranNum);
        
        System.out.println("----- Конец второго задания ------");
    }
   
}
