package seminars.first;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if (num == 0) {
            return 0;
        }
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        } else {
            return (Math.sqrt(num));
        }
    }

    /*
    Задание 1.
    В классе Calculator создайте метод calculateDiscount,
    который принимает сумму покупки и процент скидки и возвращает сумму
    с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
    Если метод calculateDiscount получает недопустимые аргументы,
    он должен выбрасывать исключение ArithmeticException.
    Не забудьте написать тесты для проверки этого поведения.
    * purchaseAmount - сумма покупки
    * discountAmount - размер скидки
    * // Метод должен возвращать сумму покупки со скидкой
    */

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount == 0) {
            throw new ArithmeticException("Cannot calculate, because purchase amount is zero");
        }
        if (discountAmount == 0) {
            return purchaseAmount;
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("Cannot calculate, because purchase amount is less than amount with discount");
        }
        if (purchaseAmount < 0) {
            throw new ArithmeticException("Cannot calculate, because purchase amount is less than zero");
        }
        if (discountAmount < 0) {
            throw new ArithmeticException("Cannot calculate, because discount amount is less than zero");
        } else {
            return (purchaseAmount - purchaseAmount * discountAmount / 100);
        }
    }
}
