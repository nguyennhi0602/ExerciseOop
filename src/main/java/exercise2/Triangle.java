package exercise2;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        a = calculateDistance(x1, y1, x2, y2);
        b = calculateDistance(x2, y2, x3, y3);
        c = calculateDistance(x3, y3, x1, y1);
    }

    @Override
    public String showInfo() {
        if(!isTriangle(a,b,c)){
            return "tam giac khong hop le";
        }
        return "Dien tich: " + getArea() + ", chu vi: " + getPerimeter();
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    public static boolean isTriangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        if (x >= p || y >= p || z >= p) {
            return false;
        }
        return true;
    }

}
