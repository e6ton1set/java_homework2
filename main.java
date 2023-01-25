package homework2;

import java.util.Scanner;

/*1. Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение).*/

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = "";
        inputString = input.nextLine();
        inputString = inputString.toLowerCase();
        System.out.println(isPalindrome(inputString));
    }

    private static boolean isPalindrome(String inputString) {

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
