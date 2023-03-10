/*
 * 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
 * результат после каждой итерации запишите в лог-файл
 */

 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;
 import java.util.logging.FileHandler;
 import java.util.logging.Logger;
 import java.util.logging.SimpleFormatter;
 
 public class task_001 {
     private static final Logger LOGGER = Logger.getLogger(task_001.class.getName());
 
     public static void main(String[] args) throws SecurityException, IOException {
        
         FileHandler fileTxt = new FileHandler("bubblesort.log");
         SimpleFormatter formatterTxt = new SimpleFormatter();
         fileTxt.setFormatter(formatterTxt);
         LOGGER.addHandler(fileTxt);
         
 
         int[] arr = {26, 8, 12, 7, 39, 0, 3, 9};
         LOGGER.info("Incoming List: " + Arrays.toString(arr));
         List<Integer> sortedList = sort(arr);
         LOGGER.info("Sorted List: " + sortedList);
     }
 
     public static List<Integer> sort(int[] arr) {
         boolean swapped;
         int temp;
         List<Integer> sortedList = new ArrayList<Integer>();
 
         for (int i = 0; i < arr.length - 1; i++) {
             swapped = false;
             for (int j = 0; j < arr.length - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     swapped = true;
                     LOGGER.info("Swapped: " + arr[j] + " and " + arr[j + 1]);
                 }
             }
             if (!swapped)
                 break;
         }
         for (int j : arr) {
             sortedList.add(j);
         }
         return sortedList;
     }
 }