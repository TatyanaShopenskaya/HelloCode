package seminars.ControleWork6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareAverageListsTest {
    public List<Integer> list1;
    public List<Integer> list2;


    @Test
    void сorrectAverageValueTest() {
        list1 = Arrays.asList(-2, 2, 0, 2, 2);    //среднее = 0.8
        list2 = Arrays.asList(1, 2, 10, 4, 7);

        CompareAverageLists myLists = new CompareAverageLists(list1, list2);

        double sum = 0;

        for (int i = 0; i < list1.size(); i++) {
            sum += i;
            double average = sum / list1.size();


            assertEquals(0.8, myLists.averageNumbersList(list1));
        }
    }

    @Test
    void averageList1MoreThanAverageList2Test() {
        list1 = Arrays.asList(16, 3, 9, 9, 10);    //большее значение average
        list2 = Arrays.asList(1, 2, 10, 4, 7);     //меньшее значение average

        CompareAverageLists myLists = new CompareAverageLists(list1, list2);

        assertEquals("Первый список имеет большее среднее значение",
                myLists.compareAverageNumbersLists(list1, list2));
    }

    @Test
    void averageList2MoreThanAverageList1Test() {
        list1 = Arrays.asList(1, 2, 3, 9, 2);        //меньшее значение average
        list2 = Arrays.asList(12, 12, 10, 4, 7);     //большее значение average

        CompareAverageLists myLists = new CompareAverageLists(list2, list1);

        assertEquals("Второй список имеет большее среднее значение",
                myLists.compareAverageNumbersLists(list1, list2));
    }

    @Test
    void averageList1EqualAverageList2Test() {
        list1 = Arrays.asList(1, 2, 3, 9, 2);
        list2 = Arrays.asList(1, 2, 3, 9, 2);

        CompareAverageLists myLists = new CompareAverageLists(list2, list1);

        assertEquals("Средние значения равны",
                myLists.compareAverageNumbersLists(list1, list2));
    }
}



