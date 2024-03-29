import org.junit.Assert;
import org.junit.Test;

public class Exercise1Test {
    Exercise1 triangle = new Exercise1(8, 4, 10, 5, 7, 2);

    @Test
    public void test_getLength() {
        Assert.assertEquals(triangle.geta2(), 5, 0.01);
        Assert.assertEquals(triangle.getb2(), 18, 0.01);
        Assert.assertEquals(triangle.getc2(), 5, 0.01);
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
        Assert.assertEquals(new Exercise1(3, 0, -3, 0, 0, 3 * Math.sqrt(3)).getType(), "tam giac deu");
        Assert.assertEquals(new Exercise1(3, 4,1, 3, 2, 1).getType(), "tam giac can");
        Assert.assertEquals(triangle.getType(), "tam giac can");
        Assert.assertEquals(new Exercise1(0, 0, 2, 0, -1, 0).getType(), "tam giac khong hop le");
        Assert.assertEquals(new Exercise1(-1, 0, 0, 0, 2, 0).getType(), "tam giac khong hop le");
        Assert.assertEquals(new Exercise1(2, 0, -1, 0, 0, 0).getType(), "tam giac khong hop le");
        Assert.assertEquals(new Exercise1(0, 0, 0, 3, 4, 0).getType(), "tam giac vuong");
        Assert.assertEquals(new Exercise1(4, 0, 0, 0, 0, 3).getType(), "tam giac vuong");
        Assert.assertEquals(new Exercise1(0, 3, 4, 0, 0, 0).getType(), "tam giac vuong");
        Assert.assertEquals(new Exercise1(0, 0, 0, 2, 1, 4).getType(), "tam giac binh thuong");
    }

    @Test
    public void test_isRightTriangle() {
        Assert.assertFalse(triangle.isRightTriangle());
    }

}
