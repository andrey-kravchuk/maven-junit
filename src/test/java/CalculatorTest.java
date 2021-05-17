import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {



    @Test
    public void testSumm(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.calculateSumma(2, 3));

    }

    @Ignore
    @Test
    public void testSumm2() throws InterruptedException {
        Calculator calculator = new Calculator();

        Assert.assertEquals(6, calculator.calculateSumma(2, 3));

    }

    @Ignore
    @Test
    public void failedTest() throws InterruptedException {
        Calculator calculator = new Calculator();

        Assert.assertEquals(7, calculator.calculateSumma(2, 4));
    }

    @Ignore
    @Test
    public void testSumma3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(8, calculator.calculateSumma(2, 3));
    }


    @Test
    public void testSumma4() throws InterruptedException {
        Calculator calculator = new Calculator();

        Assert.assertEquals(9, calculator.calculateSumma(2, 3));
    }

    @Test
    public void testSummaWithLongNameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee4() throws InterruptedException {
        Calculator calculator = new Calculator();

        Assert.assertEquals(9, calculator.calculateSumma(2, 3));
    }

}
