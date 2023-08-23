package homeWork_Lesson26;

public class Circle extends Shape {
    public Circle(double side) {
        super(side);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("side=").append(calcArea());
        sb.append('}');
        return sb.toString();
    }

    public double calcArea() {
        return side * 2 * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return side * 2 * Math.PI;
    }
}
