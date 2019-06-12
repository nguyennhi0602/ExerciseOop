package oop2;

public class Triangle implements Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double c1;
    private double c2;
    private double c3;

    public Triangle() {
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        c1 = calculateDistance(x1, y1, x2, y2);
        c2 = calculateDistance(x2, y2, x3, y3);
        c3 = calculateDistance(x3, y3, x1, y1);
    }

    @Override
    public String showInfo() {
        double p = this.getPerimeter() / 2;
        if (this.c1 <= 0 || this.c2 <= 0 || this.c3 <= 0 || this.c1 >= p || this.c2 >= p || this.c3 >= p) {
            
        }
        return "";
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.c1) * (p - this.c2) * (p - this.c3));
    }

    @Override
    public double getPerimeter() {
        return this.c1 + this.c2 + this.c3;
    }


}
