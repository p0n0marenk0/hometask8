//task4
//Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
//Пароль состоит из 8 символов
//В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
//Пароль обязательно должен содержать Большие, маленькие буквы и цифры
package com.p0n0marenk0;

import java.util.Random;

public class Task84 {
    private static final String SYMBOLS = "abcdefghijklmnopqrstuvwxyz_ABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";

    public static void main(String[] args) {

        String password = "";
        do {
            password = generatePassword();
        }
        while (!checkPassword(password));
        System.out.println(password);
    }

    private static String generatePassword() {
        Random random = new Random();
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += SYMBOLS.charAt(random.nextInt(64));
        }
        return password;
    }

    private static boolean checkPassword(String password) {
        boolean checkPasswordForSymbols = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < 91 & password.charAt(i) > 64) {
                for (int j = 0; j < password.length(); j++) {
                    if ((password.charAt(j) < 58 & password.charAt(j) > 47)) {
                        for (int k = 0; k < password.length(); k++) {
                            if ((password.charAt(k) < 123 & password.charAt(k) > 96)) {
                                checkPasswordForSymbols = true;
                                break;
                            }
                            checkPasswordForSymbols = false;
                        }
                        break;
                    }
                    checkPasswordForSymbols = false;
                }
                break;
            }
            checkPasswordForSymbols = false;
        }
        return (checkPasswordForSymbols);
    }
}
