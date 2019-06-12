import java.text.DecimalFormat;

public class Exercise1 {

    private static DecimalFormat df = new DecimalFormat("0.0");

    private double a1;
    private double a2;
    private double b1;
    private double b2;
    private double c1;
    private double c2;
    private double AB;
    private double BC;
    private double AC;

    public Exercise1() {
    }

    public Exercise1(double a1, double a2, double b1, double b2, double c1, double c2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
        AB = getLength(a1, a2, b1, b2);
        BC = getLength(b1, b2, c1, c2);
        AC = getLength(a1, a2, c1, c2);
    }

    public double getAB() {
        return this.AB;
    }

    public double getBC() {
        return this.BC;
    }

    public double getAC() {
        return this.AC;
    }

    public static double getLength(double p1, double p2, double q1, double q2) {
        return Double.parseDouble(df.format(Math.sqrt((q1 - p1) * (q1 - p1) + (q2 - p2) * (q2 - p2))));
    }

    public boolean isRightTriangle() {
        return (this.AB * this.AB + this.BC * this.BC == this.AC * this.AC
                || this.AB * this.AB + this.AC * this.AC == this.BC * this.BC
                || this.BC * this.BC + this.AC * this.AC == AB * AB);
    }

    public String getType() {
        double p = (this.AB + this.BC + this.AC) / 2;
        if (this.AB <= 0 || this.BC <= 0 || this.AC <= 0 || this.AB >= p || this.BC >= p || this.AC >= p) {
            return "tam giac khong hop le";
        }
        if (this.AB == this.BC && this.AC == this.BC) {
            return "tam giac deu";
        }
        if ((this.AB - this.BC) * (this.AB - this.AC) * (this.BC - this.AC) == 0) {
            return "tam giac can";
        }
        if (isRightTriangle()) {
            return "tam giac vuong";
        }
        return "tam giac binh thuong";
    }

    public double getArea() {
        double p = (this.AB + this.BC + this.AC) / 2;
        return Math.sqrt(p * (p - this.AB) * (p - this.BC) * (p - this.AC));
    }

    public double getPerimeter() {
        return this.AB + this.AC + this.BC;
    }
}
