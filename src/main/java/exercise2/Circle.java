package exercise2;

public class Circle implements Shape {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String showInfo() {
        if(r<=0){
            return "hinh tron khong hop le";
        }
        return "Dien tich: " + this.getArea() + ", chu vi: " + this.getPerimeter();
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * this.r * this.r;
    }

}
