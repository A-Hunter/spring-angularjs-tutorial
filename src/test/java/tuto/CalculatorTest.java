package tuto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import spring.mvc.tuto.Calculator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
public class CalculatorTest {

    @Mock
    private Calculator calculator;

    @Before
    public void setup(){
        // Injecting the mock data "calculator" into the test class
        // So we don't need anymore to instantiate the Calculator object
        //  with "new" anymore
        MockitoAnnotations.initMocks(this);
//        calculator = new Calculator();
    }

    @Test
    public void test(){

//        int expected = 4;
//        int actual = calculator.abs(-4);
//        assertEquals(expected,actual);
        when(calculator.abs(-5)).thenReturn(5);
        assertEquals(5, calculator.abs(-5));
    }

    @After
    public void finalize(){
        System.out.println("finish");
    }
}
