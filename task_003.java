/*
 * 3. Напишите метод, который принимает на вход строку (String) 
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */


import java.util.Scanner;

public class task_003 {

    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст в строку: ");
        String ln = scan.next();
        if(isPalindrome(ln)){
            System.out.printf("Строка %s является палиндромом", ln);
        } else {
            System.out.printf("Строка %s не является палиндромом", ln);
        }
    }
}
