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
public class Task3 {
    public void run(){
        int sum = 0; 
        int max = 0; 
        int min = 10; 
        
        System.out.println("----- Задание 2 ------\n");
        
        int[] myArr;
        myArr = new int[10];
        
        for (int i = 0; i < myArr.length; i++ ) {
            myArr[i] = (int) (Math.random() * 10);
        }
        // array print 
        System.out.print("Массив: " );
        for (int i = 0; i <myArr.length; i++ ) {
            System.out.print (myArr[i]);
            
            if (myArr[i] > max) max = myArr[i]; 
            if (myArr[i] < min) min = myArr[i]; 
            sum += myArr[i];
        }
        
        
        System.out.println("\nСумма всех элементов в массиве: " + sum);
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("\n----- Конец третьего задания ------");
    }
}
