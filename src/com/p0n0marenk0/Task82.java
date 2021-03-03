//task2
//Вывести в 1 строку через пробел все числа от 1 до 99 со следующими изменениями:
//- если число кратно 3 то вывести вместо него Hello
//- если число кратно 5 то вывести вместо него World
//- если число кратно и 3 и 5 то вывести вместо него HelloWorld
package com.p0n0marenk0;

public class Task82 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) & (i % 5 != 0)) {
                System.out.print("Hello ");
            } else if ((i % 5 == 0) & (i % 3 != 0)) {
                System.out.print("World ");
            } else if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.print("HelloWorld ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
