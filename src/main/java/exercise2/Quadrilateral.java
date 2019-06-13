package exercise2;

public class Quadrilateral implements Shape {

    private double a;
    private double b;
    private double c;
    private double d;
    private double dc1;
    private double dc2;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        a = calculateDistance(x1, y1, x2, y2);
        b = calculateDistance(x2, y2, x3, y3);
        d = calculateDistance(x1, y1, x4, y4);
        c = calculateDistance(x3, y3, x4, y4);
        dc1 = calculateDistance(x1, y1, x3, y3);
        dc2 = calculateDistance(x2, y2, x4, y4);
    }

    @Override
    public String showInfo() {
        if ((Triangle.isTriangle(a, b, dc1) && Triangle.isTriangle(c, d, dc1)&&Triangle.isTriangle(a,d,dc2)&&Triangle.isTriangle(b,c,dc2))) {
            return "Dien tich: " + getArea() + ", chu vi: " + getPerimeter();
        }
        return "tu giac khong hop le";

    }

    @Override
    public double getArea() {
        double s1 = getAreaOfTriangle(a, b, dc1) + getAreaOfTriangle(c, d, dc1);
        double s2 = getAreaOfTriangle(a, d, dc2) + getAreaOfTriangle(b, c, dc2);
        return s1 > s2 ? s2 : s1;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    public static double getAreaOfTriangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

}
