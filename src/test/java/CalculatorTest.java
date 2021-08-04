import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {



    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.calculateSumma(2, 3));

    }

    @Test
    public void testSumOk(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.calculateSumma(2, 3));

    }

    @Test
    public void testSum2() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(6, calculator.calculateSumma(2, 3));

    }

    @Test
    public void failedTest() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(7, calculator.calculateSumma(2, 4));
    }

    @Ignore
    @Test
    public void testSum3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(8, calculator.calculateSumma(2, 3));
    }

    @Ignore
    @Test
    public void testSum4() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(9, calculator.calculateSumma(2, 3));
    }@Test

    public void testSum5() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(9, calculator.calculateMulti(3, 3));
    }


}
