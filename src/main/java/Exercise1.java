public class Exercise1 {

    private double a2;
    private double b2;
    private double c2;

    public Exercise1(double x1, double y1, double x2, double y2, double x3, double y3) {
        a2 = getLength2(x1, y1, x2, y2);
        b2 = getLength2(x2, y2, x3, y3);
        c2 = getLength2(x1, y1, x3, y3);
    }

    public double geta2() {
        return a2;
    }

    public double getb2() {
        return b2;
    }

    public double getc2() {
        return c2;
    }

    public static double getLength2(double p1, double p2, double q1, double q2) {
        return (q1 - p1) * (q1 - p1) + (q2 - p2) * (q2 - p2);
    }

    public boolean isRightTriangle() {
        return a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2;
    }

    public String getType() {
        double p = getPerimeter() / 2;
        if (a2 >= p * p || b2 >= p * p || c2 >= p * p) {
            return "tam giac khong hop le";
        }
        if (a2 == b2 && c2 == b2) {
            return "tam giac deu";
        }
        if ((a2 - b2) * (a2 - c2) * (b2 - c2) == 0) {
            return "tam giac can";
        }
        if (isRightTriangle()) {
            return "tam giac vuong";
        }
        return "tam giac binh thuong";
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - (Math.sqrt(a2)) )* (p - (Math.sqrt(b2))) * (p - Math.sqrt(c2)));
    }

    public double getPerimeter() {
        return (Math.sqrt(a2) + Math.sqrt(b2) + Math.sqrt(c2));
    }
}
