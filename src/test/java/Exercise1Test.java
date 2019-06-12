import org.junit.Assert;
import org.junit.Test;

public class Exercise1Test {
    Exercise1 triangle = new Exercise1(8, 4, 10, 5, 7, 2);

    @Test
    public void test_getLength() {
        Assert.assertEquals(triangle.getAB(), 2.2, 0.1);
        Assert.assertEquals(triangle.getBC(), 4.2, 0.1);
        Assert.assertEquals(triangle.getAC(), 2.2, 0.1);
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(triangle.getPerimeter(), 8.6, 0.1);
    }

    @Test
    public void test_getArea() {
        Assert.assertEquals(triangle.getArea(), 1.37, 0.1);
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
