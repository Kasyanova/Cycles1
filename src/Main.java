/*Напишите программу:

        1. Пользователь вводит размер массива и данные с клавиатуры в массив

        2. Сравнить элементы массива с заранее заданными константами x, y, z.

        3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".

        */
package com.max.idea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int arrayL = in.nextInt(); //длина массива

        int[] myArray = new int[arrayL]; //задать длину массива
        for (int i=0;i<myArray.length;i++){
            System.out.print("Введите значение элемента "+i+" : ");
            myArray[i] = in.nextInt(); //присвоить значение каждому следующему элементу массива, начиная с нулевого
        }

        //объявить и задать значение константам
        int x = 1;
        int y = 2;
        int z = 3;
        int m = 0;//дополнительная переменная

        for (int j=0;j<myArray.length;j++){
            if (myArray[j] == x) m = 1;
        }
        for (int j=0;j<myArray.length;j++){
            if (myArray[j] == y) m = 1;
        }
        for (int j=0;j<myArray.length;j++){
            if (myArray[j] == z) m = 1;
        }

        if (m>0) System.out.println("Данное значение имеется в константах");

    }
}