//Задание №2
//        Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы
//        оплаты на сайте. Вместо реальной кредитной карты используйте мок-объект

package seminars.fourth.card;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */
    @Test
    void payTest() {
        CreditCard creditCard = mock(CreditCard.class);   //создали мок кредитной карты
        PaymentForm paymentForm = new PaymentForm(creditCard);
        //вызываем метод
        paymentForm.pay(100); //т.к. мы хотим протестировать вызов метода
        //verify аналог assert
        verify(creditCard,times(1)).charge(100);   //мы говорим, что кредитная карта использовалась 1 раз и вызывался метод charge с параметрами amount
    }

}