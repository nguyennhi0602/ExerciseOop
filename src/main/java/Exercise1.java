public class Exercise1 {

    private double a;
    private double b;
    private double c;

    public Exercise1() {
    }

    public Exercise1(double x1, double y1, double x2, double y2, double x3, double y3) {
        a = getLength(x1, y1, x2, y2);
        b = getLength(x2, y2, x3, y3);
        c = getLength(x1, y1, x3, y3);
    }

    public double geta() {
        return this.a;
    }

    public double getb() {
        return this.b;
    }

    public double getc() {
        return this.c;
    }

    public static double getLength(double p1, double p2, double q1, double q2) {
        return Math.sqrt((q1 - p1) * (q1 - p1) + (q2 - p2) * (q2 - p2));
    }

    public boolean isRightTriangle() {
        return (this.a * this.a + this.b * this.b == this.c * this.c
                || this.a * this.a + this.c * this.c == this.b * this.b
                || this.b * this.b + this.c * this.c == a * a);
    }

    public String getType() {
        double p = (this.a + this.b + this.c) / 2;
        if (this.a <= 0 || this.b <= 0 || this.c <= 0 || this.a >= p || this.b >= p || this.c >= p) {
            return "tam giac khong hop le";
        }
        if (this.a == this.b && this.c == this.b) {
            return "tam giac deu";
        }
        if ((this.a - this.b) * (this.a - this.c) * (this.b - this.c) == 0) {
            return "tam giac can";
        }
        if (isRightTriangle()) {
            return "tam giac vuong";
        }
        return "tam giac binh thuong";
    }

    public double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double getPerimeter() {
        return this.a + this.c + this.b;
    }
}
