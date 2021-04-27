import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

class CalculatorTestWithLoooooooooooooooooooooooooooooooooooooooooooongName {



    @Test
    public void testSumma(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(5, calculator.calculateSumma(2, 3));
    }

    @Ignore
    @Test
    public void testSumma1(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.calculateSumma(2, 3));
    }

//    @Ignore
    @Test
    public void failedTestWithLooooooooooooooooooooooooooooooooooooooooooooongName(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(7, calculator.calculateSumma(2, 3));
    }

//    @Ignore
    @Test
    public void testSumma3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(8, calculator.calculateSumma(2, 3));
    }

    @Ignore
    @Test
    public void testSumma4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(9, calculator.calculateSumma(2, 3));
    }

}
