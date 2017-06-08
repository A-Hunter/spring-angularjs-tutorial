package tuto;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import spring.mvc.tuto.trash.Car;
import spring.mvc.tuto.trash.Engine;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
public class CarTest {

    @Mock
    Engine engine;

    /**
     * The @InjectMocks annotation will inject the the mock data "engine"
     * into the constructor of the "Car" in order to create the object "car"
     */
    @InjectMocks
    private Car car;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test(){
        when(engine.getRpm()).thenReturn(6000);
        car.accelerate();
        assertEquals("Slow down !",car.getWarningMessage());
    }
}
