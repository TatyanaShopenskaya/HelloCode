package seminars.ControleWork6;

/*Задание 1. Создайте программу на Java, которая принимает два списка чисел и выполняет следующие действия:
        a. Рассчитывает среднее значение каждого списка.
        b. Сравнивает эти средние значения и выводит соответствующее сообщение:
        - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
        - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
        - ""Средние значения равны"", если средние значения списков равны.*/

import java.util.Arrays;
import java.util.List;

public class CompareAverageLists {
    List<Integer> list1;
    List<Integer> list2;

    public CompareAverageLists(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double averageNumbersList(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public String compareAverageNumbersLists(List<Integer> list1, List<Integer> list2) {
        String result;

        double averageList1 = averageNumbersList(list1);
        double averageList2 = averageNumbersList(list2);

        if (averageList1 > averageList2) {
            result = "Первый список имеет большее среднее значение";
        } else if (averageList1 < averageList2) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }
        return result;
    }




    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(5, 8, 16, 1, 1);
        List<Integer> list2 = Arrays.asList(3, 8, 10, 2, 3);

        CompareAverageLists list = new CompareAverageLists(list1, list2);

        double result1 = list.averageNumbersList(list1);
        double result2 = list.averageNumbersList(list2);

        String compareResult = list.compareAverageNumbersLists(list1,list2);

        System.out.println("Среднее значение элементов списка 1 = " + result1);
        System.out.println("Среднее значение элементов списка 2 = " + result2);
        System.out.println(compareResult);

    }
}
