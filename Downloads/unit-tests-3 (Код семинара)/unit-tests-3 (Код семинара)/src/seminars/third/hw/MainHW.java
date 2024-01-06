package seminars.third.hw;

public class MainHW {

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
   int n;
   boolean isEven = false;

    public MainHW(int n) {
        this.n = n;
    }

    public boolean evenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean interval(int n) {
        if (n>25 && n<100) {
            return true;
        } else {
            return false;
        }
    }
}
