package inheritance.randomList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {



    public Object getRandomElement() {
        int endIndex = super.size();
        Random random = new Random();
        int removeElement = random.nextInt(endIndex);
        return this.remove(removeElement);
    }

}
