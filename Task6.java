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
public class Task6 {
    public void decrease(int i, int j, int x, int[][] myArr) {
        for (i = 0; i < myArr.length; i++) {
            if (x > 5) x--;
            else break;
            System.out.println();
            for (j = 0; j < x; j++) {
                myArr[i][j] = (int) (Math.random() * 10);
                System.out.print(myArr[i][j]);
            }
        }
    }
    
    public void run(){
        System.out.println("----- Задание 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив и \nзаполняем его случайными числами, и выводим.");
        int[][] myArr; 
        int x = 4;
        myArr = new int[10][9];
        int i;
        int j = 0;
        for (i = 0; i < myArr.length; i++) {
            if (x < 9) x++;
            else {
                decrease(3, j, x, myArr);
                break;
            }
            System.out.println();
            for(j = 0; j < x; j++) {
                myArr[i][j] = (int) (Math.random() * 10);
                System.out.print(myArr[i][j]);

            }


        }


        System.out.println("\n----- Конец шестого ------");
    }
}
