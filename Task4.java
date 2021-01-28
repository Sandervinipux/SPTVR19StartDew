/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

/**
 *
 * @author user
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задание 4 ------");
        System.out.println("Создайте массив из 10 элементов четных чисел: ");
        int [] myArr; 
        myArr = new int[10];
        System.out.print("Массив:  ");
        for(int i = 0; i < myArr.length; i++){
            int x = (int) (Math.random() * 10); 
            if (x % 2 == 0) { 
                myArr[i] = x ;
            }
            System.out.print(myArr[i]);
        }
        System.out.println("\n----- Конец четвертого задания ------");
    }
}
