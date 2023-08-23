package homeWork_Lesson26;

public class Triangle extends Shape {
    public Triangle(double side) {
        super(side);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("side=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcPerimeter() {
        return side + side + side;
    }

    @Override
    public double calcArea() {
        return side + side + side;
    }
}
