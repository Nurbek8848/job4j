package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public boolean exist(double a, double b, double c) {
        boolean result = false;
        a = first.distance(second);
        b = first.distance(third);
        c = second.distance(third);
        if (a + b > c && b + c > a && c + a > b) {
            result = true;
        }
        return result;
    }
    public double perimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = perimeter(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        System.out.println(result);

    }
}
