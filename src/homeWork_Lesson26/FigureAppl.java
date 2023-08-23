package homeWork_Lesson26;

public class FigureAppl {
    public static void main(String[] args) {
        /*Create an abstract class Shape with field side type double and an abstract methods calcArea and calcPerimeter.
Create classes Circle, Triangle, Square which extends class Shape and implements abstract methods.
Write class FigureAppl with method main. In method create array of Shapes. Add to array two circles,
one triangle and one square. Calculate total area and total perimeter of all figures from array of Shapes.
Calculate total area of circles. (*)
P.S. We are bear in mind regular shapes
                 */

        Shape[] shape = new Shape[4];
        shape[0] = new Circle(10);
        shape[1] = new Circle(15);
        shape[2] = new Triangle(3);
        shape[3] = new Square(5);

        double total = totalArea(shape);
        System.out.printf("Total area is %.2f", total);
        System.out.println();
        total = totalPerimeter(shape);
        System.out.printf("Total perimeter is %.2f", total);

    }

    private static double totalPerimeter(Shape[] shape) {
        double sum1 = 0;
        for (int i = 0; i < shape.length; i++)
            if (shape[i] != null) {
                sum1 += shape[i].calcPerimeter();
            }
        return sum1;
    }

    private static double totalArea(Shape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++)
            if (shape[i] != null) {
                sum += shape[i].calcArea();
            }
        return sum;
    }
}