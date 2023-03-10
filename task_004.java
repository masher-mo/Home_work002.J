/*
* 4*. К калькулятору из предыдущего дз добавить логирование
*/


import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;
import java.nio.file.Paths;

public class task_004 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_004.class.getName());
        Scanner sc = new Scanner(System.in, "cp866");

        String currentPath = Paths.get("")
                                  .toAbsolutePath()
                                  .toString();

        String logsPath = currentPath + "\\calcLogs.txt";

        FileHandler fh = new FileHandler(logsPath);
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        while (true) {
            System.out.print("Введите первое число: ");
            double number1 = Double.parseDouble(sc.nextLine());

            System.out.print("Введите действие: ");
            String action = sc.nextLine();

            if (action.equals("")) break;

            System.out.print("Введите второе число: ");
            double number2 = Double.parseDouble(sc.nextLine());

            String sol = number1 + " " + action + " " + number2 + " = ";
            double res = 0;

            switch (action) {
                case "+":
                    res = number1 + number2;
                    logger.info(sol + res);
                    break;
                case "-":
                    res = number1 - number2;
                    logger.info(sol + res);
                    break;
                case "*":
                    res = number1 * number2;
                    logger.info(sol + res);
                    break;
                case "/":
                    res = number1 / number2;
                    logger.info(sol + res);
                    break;
                default:
                    System.out.println("Неверно введенные данные.");
            }
        }

        sc.close();
    }
}
