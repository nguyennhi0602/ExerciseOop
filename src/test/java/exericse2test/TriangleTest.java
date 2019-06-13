package exericse2test;

import exercise2.Circle;
import exercise2.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void test_getArea() {
        Assert.assertEquals(new Triangle(0,0,0,1,1,0).getArea(), 0.49999999999999983, 0.01);
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(new Triangle(0,0,0,1,1,0).getPerimeter(), 3.414213562373095, 0.01);
    }

    @Test
    public void test_showInfo() {
        Assert.assertEquals(new Triangle(0,0,0,1,1,0).showInfo(), "Dien tich: 0.49999999999999983, chu vi: 3.414213562373095");
        Assert.assertEquals(new Triangle(0,0,0,1,0,-1).showInfo(), "tam giac khong hop le");
    }

    @Test
    public void test_isTriangle(){
        Assert.assertTrue(Triangle.isTriangle(1,2,2));
        Assert.assertFalse(Triangle.isTriangle(1,1,8));
    }
}
