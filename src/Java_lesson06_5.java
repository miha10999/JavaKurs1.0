import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_lesson06_5 {
    /*
     * @author khlyustov mikhail
     * Задача №4_Операторы
     ** Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
     ** в зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции
     * @since  JDK8.0
     */

    public static void main(String[] args) throws IOException {
        double x, y;
        String z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Добрый день! Введите, пожалуйста, x =  ");
        String sAge = reader.readLine();
        x = Float.parseFloat(sAge);
        System.out.println("");
        System.out.print(" Введите, пожалуйста, y =  ");
        sAge = reader.readLine();
        y = Float.parseFloat(sAge);
        System.out.println(" ");
        System.out.print(" Введите, пожалуйста,  один из символов для выполнения ариф.операции ‘+’, ‘-’, ‘*’ или ‘/’: ");
        sAge = reader.readLine();
        switch (sAge) {
            case "+":   System.out.println("Результат сложения = " + (x+y));break;
            case "-":   System.out.println("Результат вычитания = " + (x-y));break;
            case "*":   System.out.println("Результат сложения = " + (x*y));break;
            case "/":   System.out.println("Результат вычитания = " + (x/y));break;
            default : System.out.println("Повторите попытку");
                ;
        }

}}
