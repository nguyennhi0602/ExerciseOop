package exericse2test;

import exercise2.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void test_getArea() {
        Assert.assertEquals(new Circle(-1, 1, 3).getArea(), 18.84955592153876, 0.01);
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(new Circle(-1, 1, 3).getPerimeter(), 28.274333882308138, 0.01);
    }

    @Test
    public void test_showInfo() {
        Assert.assertEquals(new Circle(-1, 1, 3).showInfo(), "Dien tich: 18.84955592153876, chu vi: 28.274333882308138");
        Assert.assertEquals(new Circle(-1, 1, -1).showInfo(), "hinh tron khong hop le");
    }
}
