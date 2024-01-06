package seminars.third.coverage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;



class SomeServiceTest {
    // 3.1.
    private SomeService someService;


    void multipleThreeNotFiveReturnsFizz(int n) {
        // assertEquals...
    }

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzTest() {
        String result = someService.fizzBuzz(3);
        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    void buzzTest() {
        String result = someService.fizzBuzz(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzzTest() {
        String result = someService.fizzBuzz(75);
        assertThat(result).isEqualTo("FizzBuzz");
    }


    @Test
    void startingSixReturnTrue() {
        boolean res = someService.firstLast6(new int[]{6, 10, 5, 15});
        assertTrue(res);
    }

    @Test
    void endingSixReturnTrue() {
        boolean res = someService.firstLast6(new int[]{5, 10, 5, 6});
        assertTrue(res);
    }

    @Test
    void bothEndsSixReturnTrue() {
        boolean res = someService.firstLast6(new int[]{6, 10, 5, 15, 6});
        assertTrue(res);
    }

    @Test
    void noSixReturnFalse() {
        boolean res = someService.firstLast6(new int[]{4, 10, 5, 15});
        assertFalse(res);
    }

    @Test
    void emptyReturnFalse() {
        boolean res = someService.firstLast6(new int[]{});   //проверка на пустой массив
        assertFalse(res);
    }


    /**
     * @param i      discount
     * @param result result
     * @apiNote Обычная скидка
     */
    @ParameterizedTest
    @CsvSource({
            "50, 1000",
            "100, 0",
            "0, 2000"
    })
    void correctDiscountCalculatingTest(int i, int result) {
        assertThat(someService.calculatingDiscount(2000, i)).isEqualTo(result);
    }

    /**
     * @param i
     * @apiNote Некорректная скидка
     */
    @ParameterizedTest
    @ValueSource(ints = {101, -1})
    void incorrectDiscountValue(int i) {
        assertThatThrownBy(() -> someService.calculatingDiscount(2000, i))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапозоне от 0 до 100%");
    }

    @Test
    void incorrectPurchaseAmount() {
        assertThatThrownBy(() -> someService.calculatingDiscount(-1, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void luckySumWithoutA() {
        assertThat(someService.luckySum(13,1,2)).isEqualTo(3);
    }

    @Test
    void luckySumWithoutB() {
        assertThat(someService.luckySum(1,13,6)).isEqualTo(7);
    }

    @Test
    void luckySumWithoutC() {
        assertThat(someService.luckySum(3,2,13)).isEqualTo(5);
    }

    @Test
    void luckySumAllNumbers13() {
        assertThat(someService.luckySum(13,13,13)).isEqualTo(0);
    }

}
