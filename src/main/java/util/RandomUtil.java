package util;


import enums.ConstVariable;

import java.util.Random;

public class RandomUtil {
    public static int getRandomNumber() {
        return new Random().nextInt(ConstVariable.RANDOM_NUMBER_RANGE.getValue());
    }
}
