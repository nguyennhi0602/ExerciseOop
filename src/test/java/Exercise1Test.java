import org.junit.Assert;
import org.junit.Test;

public class Exercise1Test {
    Exercise1 triangle = new Exercise1(8, 4, 10, 5, 7, 2);

    @Test
    public void test_getLength() {
        Assert.assertEquals(triangle.geta(), 2.23, 0.01);
        Assert.assertEquals(triangle.getb(), 4.24, 0.01);
        Assert.assertEquals(triangle.getc(), 2.23, 0.01);
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(triangle.getPerimeter(), 8.7, 0.1);
    }

    @Test
    public void test_getArea() {
        Assert.assertEquals(triangle.getArea(), 1.5, 0.1);
    }

    @Test
    public void test_type() {
        Assert.assertEquals(triangle.getType(), "tam giac can");
    }

    @Test
    public void test_isRightTriangle() {
        Assert.assertFalse(triangle.isRightTriangle());
    }

}
