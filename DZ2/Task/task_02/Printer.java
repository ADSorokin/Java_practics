/**
 * Сортировка пузырьком с логированием
 *
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 *
 * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
 *
 * int[] arr - числовой массив
 *
 * После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.
 *
 * Пример
 *
 * arr = new int[]{9, 4, 8, 3, 1};
 * sort(arr)
 *
 * // При чтении лог-файла получим:
 * 2023-05-19 07:53 [4, 8, 3, 1, 9]
 * 2023-05-19 07:53 [4, 3, 1, 8, 9]
 * 2023-05-19 07:53 [3, 1, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
*/


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;




class BubbleSort {
    private static File log = new File("log.txt");
    private static FileWriter fileWriter ;
    static Date d = new Date();


    public static void sort(int[] mas) throws IOException {

        fileWriter = new FileWriter(log);
        DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        for (int i = 0; i < mas.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < mas.length - i-1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    isSorted = false;
                }

            }


            fileWriter.append(formater.format(d) + " " + Arrays.toString(mas) + '\n');
            fileWriter.flush();
            if (isSorted){
                break;}
        }



    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
 public  class Printer {
    public static void main(String[] args) throws IOException {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
