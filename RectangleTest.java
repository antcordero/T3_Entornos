package projectRectangle;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
	
	 //Test 1
    @Test
    public void test1() {
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.getH());
        assertEquals(0, rectangle.getW());
        System.out.println("Test 1 completed successfully.");
    }

    //Test 2
    @Test
    public void test2() {
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.getH());
        assertEquals(0, rectangle.getW());
        assertEquals(0, rectangle.getA());
        System.out.println("Test 2 completed successfully.");
    }
    
    //Test 3
    @Test
    public void test3() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(10, rectangle.getH());
        assertEquals(20, rectangle.getW());
        assertEquals(200, rectangle.getA());
        System.out.println("Test 3 completed successfully.");
    }
    
    //Test 4
    @Test
    public void test4() {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2, 3);
        rectangles[2] = new Rectangle(4, 6);
        rectangles[3] = new Rectangle(6, 9);
        rectangles[4] = new Rectangle(8, 12);
        
        //array 1
        assertEquals(0, rectangles[0].getH());
        assertEquals(0, rectangles[0].getW());
        assertEquals(0, rectangles[0].getA());
        //array 2
        assertEquals(2, rectangles[1].getH());
        assertEquals(3, rectangles[1].getW());
        assertEquals(6, rectangles[1].getA());
        //array 3
        assertEquals(4, rectangles[2].getH());
        assertEquals(6, rectangles[2].getW());
        assertEquals(24, rectangles[2].getA());
        //array 4
        assertEquals(6, rectangles[3].getH());
        assertEquals(9, rectangles[3].getW());
        assertEquals(54, rectangles[3].getA());
        //array 5
        assertEquals(8, rectangles[4].getH());
        assertEquals(12, rectangles[4].getW());
        assertEquals(96, rectangles[4].getA());

        System.out.println("Test 4 completed successfully.");
    }
    
    //Test 5
    @Test
    public void test5() {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(11, 7);
        rectangles[2] = new Rectangle(22, 14);
        rectangles[3] = new Rectangle(33, 21);
        rectangles[4] = new Rectangle(44, 28);

        //array 1
        assertEquals(0, rectangles[0].getH());
        assertEquals(0, rectangles[0].getW());
        assertEquals(0, rectangles[0].getA());
        //array 2
        assertEquals(11, rectangles[1].getH());
        assertEquals(7, rectangles[1].getW());
        assertEquals(77, rectangles[1].getA());
        //array 3
        assertEquals(22, rectangles[2].getH());
        assertEquals(14, rectangles[2].getW());
        assertEquals(308, rectangles[2].getA());
        //array 4
        assertEquals(33, rectangles[3].getH());
        assertEquals(21, rectangles[3].getW());
        assertEquals(693, rectangles[3].getA());
        //array 5
        assertEquals(44, rectangles[4].getH());
        assertEquals(28, rectangles[4].getW());
        assertEquals(1232, rectangles[4].getA());
        
        System.out.println("Test 5 completed successfully.");
    }
    
    //Test 6
    @Test
    public void test6() {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(11, 7);
        rectangles[2] = new Rectangle(22, 14);
        rectangles[3] = new Rectangle(33, 21);
        rectangles[4] = new Rectangle(44, 28);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i]);
        }

        System.out.println("Test 6 completed successfully.");
    }
}
        