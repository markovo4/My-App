package app;

public record Triangle(double base, double height) implements GeometricFigure {

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
