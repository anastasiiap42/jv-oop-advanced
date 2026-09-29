package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class FigureSupplier {

    private final ColorSupplier colorSupplier;
    private Figure[] figures;
    private final Random random;
    private final static int RANDOM_MAX = 100;

    public FigureSupplier() {
        this.random = new Random();
        colorSupplier = new ColorSupplier(random);
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(color, random.nextInt(RANDOM_MAX) + 1);
            case 1 -> new IsoscelesTrapezoid(color, random.nextInt(RANDOM_MAX) + 1,
                    random.nextInt(RANDOM_MAX) + 1, random.nextInt(RANDOM_MAX) + 1);
            case 2 -> new RightTriangle(color, random.nextInt(RANDOM_MAX) + 1,
                    random.nextInt(RANDOM_MAX) + 1);
            case 3 -> new Rectangle(color, random.nextInt(RANDOM_MAX) + 1,
                    random.nextInt(RANDOM_MAX) + 1);
            case 4 -> new Square(color, random.nextInt(RANDOM_MAX) + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
