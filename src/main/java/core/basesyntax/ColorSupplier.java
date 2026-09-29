package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final String[] colors;
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
        this.colors = new String[] {"red", "green", "blue", "black", "white", "yellow"};
    }

    public String getRandomColor() {
        int index = new Random().nextInt(colors.length);
        return colors[index];
    }
}
