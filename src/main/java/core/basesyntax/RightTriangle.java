package core.basesyntax;

public class RightTriangle extends Figure {

    private int rightLeg;
    private int leftLeg;

    public RightTriangle(String color, int rightLeg, int leftLeg) {
        super(color);
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    public void setRightTriangle(int rightLeg) {
        this.rightLeg = rightLeg;
    }

    public int getRightTriangle() {
        return this.rightLeg;
    }

    public void setLeftTriangle(int leftLeg) {
        this.leftLeg = leftLeg;
    }

    public int getLeftTriangle() {
        return this.leftLeg;
    }

    @Override
    public double getArea() {
        return this.rightLeg * this.leftLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("right triangle, area: " + this.getArea()
                + " sq. units, right leg: " + this.rightLeg + ", left leg: "
                + this.leftLeg + " , color: " + this.getColor());
    }
}
