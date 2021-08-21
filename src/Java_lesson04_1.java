import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Java_lesson04_1 {

    /*
     * @author khlyustov mikhail
     * Задача №3_ Массивы
     ** Задайте массив из 5 любых целых чисел.
     ** Поменяйте местами первый и последний элемент в массиве.
     ** Вывести в консоль результат суммы первого и среднего элемента.
     * @since  JDK8.0
     */

    public static void main(String[] args) {
        int []m1 = new int[] {1,2,3,4,5};
        int []m2 = new int[1];
        m2[0] = m1[0];
        m1[0] = m1[m1.length -1];
        m1[m1.length -1] = m2[0];
        //ывыв
        System.out.println("результат суммы первого и среднего элемента =  "  + (m1[0] + m1[m1.length/2]) );
}}
