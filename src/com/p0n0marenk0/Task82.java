//task2
//Вывести в 1 строку через пробел все числа от 1 до 99 со следующими изменениями:
//- если число кратно 3 то вывести вместо него Hello
//- если число кратно 5 то вывести вместо него World
//- если число кратно и 3 и 5 то вывести вместо него HelloWorld
package com.p0n0marenk0;
import java.util.Arrays;
public class Task82 {
    public static void turnAllNumbers(){
        int[] arrayOfNumbers = new int[100];
        for (int i = 0; i < 100; i++) {
        arrayOfNumbers[i] = i + 1;
            System.out.println(Arrays.toString(arrayOfNumbers));
        }
    }
}
