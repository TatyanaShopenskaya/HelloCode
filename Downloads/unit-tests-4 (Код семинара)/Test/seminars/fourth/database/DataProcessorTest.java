//Задание №6
//        Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
//        Условие: У вас есть класс Database с методом public List<String> query(String sql), который выполняет SQLзапрос и возвращает результат.
//        Вам необходимо проверить правильность работы класса DataProcessor, который использует Database для
//        выполнения запроса и обработки результатов
package seminars.fourth.database;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.Times;

import java.util.List;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


public class DataProcessorTest {

    DataProcessor dataProcessor;   //его будем тестировать
    Database databaseMock;         //а его будем мокировать
    String testSql;
    List<String> testData;


    @BeforeEach    //именно здесь необязателен этот блок, т.к. только 1 проверка
    void setup() {
        testSql = "Test sql query";
        testData = List.of("1", "2", "3");
        databaseMock = mock(Database.class);
        dataProcessor = new DataProcessor(databaseMock);
        when(databaseMock.query(testSql)).thenReturn(testData);
    }

    @Test
    public void queryMethodInvokedOnce() {    // InvokedOnce - перевод -вызывается 1 раз
        dataProcessor.processData(testSql);
        verify(databaseMock, times(1)).query(testSql);//проверка на выполнение
    }



    @Test
    public void processDataMethodTest() {
        List<String> result = dataProcessor.processData(testSql);
        assertEquals(testData, result);
    }
}