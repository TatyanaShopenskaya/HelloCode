package seminars.five.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public List<Double> generateList(int size) {
        Random random = new Random();
        List<Double> aDoubles = new ArrayList<>();
        for(int i = 0; i<size;i++){
            aDoubles.add(random.nextDouble());
        }
        return aDoubles;
    }
}
