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
public class Task5 {
    public void run(){
        System.out.println("----- Задание 5 ------");
        int[][] myArr;
        myArr = new int [10][5]; 
        System.out.print("Массив:  ");

        for (int i = 0; i < myArr.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < myArr[i].length; j++) {
               myArr[i][j] = (int) (Math.random() * 10);
               System.out.print(myArr[i][j]); 
            }
        }
        System.out.println("\n----- Конец пятого задания ------");
    }
}