import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(2, Week4.max2Int(2, 1));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(10, Week4.max2Int(5, 10));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(15, Week4.max2Int(15, -15));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(3, Week4.max2Int(3, 3));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(9, Week4.max2Int(0, 9));
    }

    @Test
    public void testMinArray1() {
        assertEquals(0, Week4.minArray(new int[]{0}));
    }

    @Test
    public void testMinArray2() {
        assertEquals(1, Week4.minArray(new int[]{1, 3, 2}));
    }

    @Test
    public void testMinArray3() {
        assertEquals(1, Week4.minArray(new int[]{4, 5, 1, 2, 3}));
    }

    @Test
    public void testMinArray4() {
        assertEquals(5, Week4.minArray(new int[]{5, 6, 6, 6}));
    }

    @Test
    public void testMinArray5() {
        assertEquals(0, Week4.minArray(new int[]{1, 0, 2}));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thieu can", Week4.calculateBMI(18, 1));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Binh thuong", Week4.calculateBMI(20, 1));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thua can", Week4.calculateBMI(23, 1));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Beo phi", Week4.calculateBMI(25, 1));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Binh thuong", Week4.calculateBMI(79, 2));
    }
}