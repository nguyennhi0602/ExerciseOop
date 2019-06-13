package exericse2test;

import exercise2.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralTest {
    @Test
    public void test_getArea(){
        Assert.assertEquals(new Quadrilateral(0,0,0,1,2,0,3,-1).getArea(),2,0);
        Assert.assertEquals(new Quadrilateral(-3,0,0,3,2,0,0,1).getArea(),5.000000000000001,0);
        Assert.assertEquals(new Quadrilateral(0,3,2,0,0,1,-3,0).getArea(),5.000000000000001,0);
    }
    @Test
    public void test_getPerimeter(){
        Assert.assertEquals(new Quadrilateral(0,0,0,1,2,0,3,-1).getPerimeter(),7.812559200041264,0);
    }
    @Test
    public void test_getAreaOfTriangle(){
        Assert.assertEquals(Quadrilateral.getAreaOfTriangle(4,5,3),6.0,0);
    }

    @Test
    public void test_showInfo(){
        Assert.assertEquals(new Quadrilateral(0,0,0,1,2,0,3,-1).showInfo(),"Dien tich: 2.0, chu vi: 7.812559200041264");
        Assert.assertEquals(new Quadrilateral(-1,0,0,0,0,4,0,4).showInfo(),"tu giac khong hop le");
    }
}
