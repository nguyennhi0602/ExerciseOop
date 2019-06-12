package oop2;

public interface Shape {
    public  String showInfo();
    public double getArea();
    public double getPerimeter();
    default public double calculateDistance(double p1, double p2, double q1, double q2){
        return Math.sqrt((q1 - p1) * (q1 - p1) + (q2 - p2) * (q2 - p2));
    }
}
