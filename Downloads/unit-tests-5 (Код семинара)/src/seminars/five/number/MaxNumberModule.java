package seminars.five.number;

import java.util.Arrays;
import java.util.List;

public class MaxNumberModule {

    public double findMaxNumberList(List<Double> doubleList) {
        double tmp = doubleList.get(0);
        for (int i = 1; i < doubleList.size(); i++) {
            if (tmp < doubleList.get(i)) {
                tmp = doubleList.get(i);
            }
        }
        return tmp;
    }
}
