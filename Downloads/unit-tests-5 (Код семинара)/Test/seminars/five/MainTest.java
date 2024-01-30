//5.1     Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
//        максимальное число в этом списке.
//        Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
//        тест, который проверяет, что оба модуля работают вместе правильно

package seminars.five;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MainTest {
    //5.1.1.
    @Test
    void randomNumberTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        List<Double> result = randomNumberModule.generateList(7);
        assertEquals(7, result.size());
        assertThat(result).hasSize(7).isNotEmpty();
    }

    //5.1.2.
    @Test
    void maxNumberListTest() {
        List<Double> doubleList = new ArrayList<>(Arrays.asList(30.0, 32.7, 70.5));
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        double result = maxNumberModule.findMaxNumberList(doubleList);
        Double expected = Collections.max(doubleList);

        assertEquals(expected, result);
    }

    //5.1.3.
    @Test
    void integrationTest() {  //общий тест, что оба модуля вместе работают правильно
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Double> randomList = randomNumberModule.generateList(7);
        double result = maxNumberModule.findMaxNumberList(randomList);


        assertEquals(Collections.max(randomList), result);
    }


    //    5.2. У вас есть два класса - UserService и UserRepository. UserService использует UserRepository для
//         получения информации о пользователе. Ваша задача - написать интеграционный тест, который
//         проверяет, что UserService и UserRepository работают вместе должным образом.

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 10})
    void integrationUserTest(int i) {  //общий тест, что оба класса UserService и UserRepository вместе работают правильно
        //блок подготовки:
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        //блок запуска:
        String result = userService.getUserName(i);

        //блок проверки:
        assertThat(result).isEqualTo("User " + i);
    }

    // 5.3. У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и
    //PaymentService. Класс OrderService обрабатывает заказы и делает вызовы к
    //PaymentService для обработки платежей. Ваша задача - написать интеграционный тест,
    //который проверяет, что OrderService и PaymentService взаимодействуют корректно
    @Test
    void integrationServiceTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("1",200.45);

        assertTrue(result);
    }
}