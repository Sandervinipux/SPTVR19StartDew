
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */

class Task1 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("-------Задание 1-------");
        System.out.print("Введите в Цельсиях: ");
        int celsius = input.nextInt();
        double fahrenheit = (double) (celsius * 1.8 + 32);  
        System.out.println("По Фаренгейту это:  " + fahrenheit); 
        
        System.out.println("-------Конец первого задания-------"); 
    } 
}
