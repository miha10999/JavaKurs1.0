import java.io.*;
import java.util.*;

public class Java_lesson06_4 {
    /*
     * @author khlyustov mikhail
     * Задача №4_Операторы
     ** Ввести три числа с клавиатуры x, y, z
     ** Найти и вывести в консоль среднее арифметическое этих чисел.
     ** Разделить среднее арифметическое на 2 и округлить в меньшую сторону
     ** полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
     * @since  JDK8.0
     */

    public static void main(String[] args) throws IOException {
        double x, y, z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Добрый день! Введите, пожалуйста, x =  ");
        String sAge = reader.readLine();
        x = Float.parseFloat(sAge);
        System.out.println("");
        System.out.print("Добрый день! Введите, пожалуйста, y =  ");
        sAge = reader.readLine();
        y = Float.parseFloat(sAge);
        System.out.println(" ");
        System.out.print("Добрый день! Введите, пожалуйста, z =  ");
        sAge = reader.readLine();
        z = Float.parseFloat(sAge);
        System.out.println(" ");
        double sum = (x+y+z)/3; //среднее арифметич
        System.out.println("среднее арифметическое =  " + sum);

        if (Math.floor(sum/2) > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
        else System.out.println("Повторите попытку");

    }
}
