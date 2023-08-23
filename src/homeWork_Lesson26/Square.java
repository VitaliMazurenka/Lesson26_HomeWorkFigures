package homeWork_Lesson26;

public class Square extends Shape {
    public Square(double side) {
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
        return side * 4;
    }

    @Override
    public double calcArea() {
        return side * 4;
    }
}
