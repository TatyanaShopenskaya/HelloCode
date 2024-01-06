package seminars.third.coverage;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return null;
    }


    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        if (nums.length == 0) return false;
        if ((nums[0] == 6) || (nums[nums.length - 1] == 6)) return true;
        return false;
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double result = purchaseAmount - purchaseAmount * discountAmount / 100;
        if (discountAmount > 100 || discountAmount < 0) {
            throw new ArithmeticException("Скидка должна быть в диапозоне от 0 до 100%");
        }
        if (purchaseAmount < 0) {
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
        return result;
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */


    public static int luckySum(int a, int b, int c) {
        int[] number = new int[]{a, b, c};
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 13) {
                result += number[i];
            }
        }
        return result;
    }


//    public int luckySum(int a, int b, int c) {
//        if (a == 13 && b == 13 && c == 13) {
//            return 0;
//        }
//        if (a == 13) {
//            return b + c;
//        }
//        if (b == 13) {
//            return a + c;
//        }
//        if (c == 13) {
//            return a + b;
//        }
//        else return (a + b + c);
//    }
}