package app;

public class Main {
    static void main() {

        Square square = new Square(2);
        Triangle triangle = new Triangle(10, 8);
        Circle circle = new Circle(5);

        GeometricFigure[] figuresList = {square, triangle, circle};

        System.out.println(getAreaSum(figuresList));

    }

    public static double getAreaSum(GeometricFigure[] list){
        double result = 0;

        for(GeometricFigure figure : list){
            result += figure.getArea();
        }

        return result;
    }
}
