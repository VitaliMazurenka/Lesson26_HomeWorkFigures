package homeWork_Lesson26;

public abstract class Shape {
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();
}
