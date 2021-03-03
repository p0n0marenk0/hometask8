//task3
//Написать метод.
//Входящий параметр:
//Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
//Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленькие.
package com.p0n0marenk0;

import java.util.Scanner;

public class Task83 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку со словами разделенными пробелом, которые состоят из больших и маленьких букв: ");
        String text = scanner.nextLine();
        System.out.println(changeLettersOnText(text));
    }

    private static String changeLettersOnText(String text) {
        String text1 = text.toLowerCase();
        boolean flagOfSpace = false;
        for (int i = 0; i < text1.length(); i++) {
            if ((i == 0) || (flagOfSpace)) {
                char tmp;
                char tmp1;
                String tmp2;
                String tmp3;
                tmp = text1.charAt(i);
                tmp2 = Character.toString(tmp);
                tmp3 = tmp2.toUpperCase();
                tmp1 = tmp3.charAt(0);
                text1 = changeCharInPosition(i, tmp1, text1);
                flagOfSpace = false;
            }
            if (text1.charAt(i) == 32) {
                flagOfSpace = true;
            }
        }
        return (text1);
    }

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
}
