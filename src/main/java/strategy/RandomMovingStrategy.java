package strategy;

import enums.ConstVariable;
import util.RandomUtil;

public class RandomMovingStrategy implements MoveStrategy {

    @Override
    public boolean movable() {
        return RandomUtil.getRandomNumber() > ConstVariable.MOVE_FORWARD_LIMITATION.getValue();
    }
}
