

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FinalPracticeUnitTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FinalPracticeUnitTests
{
    /**
     * Convert Fahrenheit to Celcius
     */
    @Test
    public void Test1FahrenheitToCelciusCalc()
    {
        assertEquals(0, Helper.FahrenheitToCelsius(32), 0.01);
        assertEquals(5, Helper.FahrenheitToCelsius(41), 0.01);
        assertEquals(10, Helper.FahrenheitToCelsius(50), 0.01);
        assertEquals(20, Helper.FahrenheitToCelsius(68), 0.01);
    }

    /*
     * Check if a temperature is above, below or at freezing
     */
    @Test
    public void Test2Freezing()
    {
    	assertEquals("at freezing", Helper.isFreezing(32));
    	assertEquals("below freezing", Helper.isFreezing(0));
    	assertEquals("below freezing", Helper.isFreezing(20));
    	assertEquals("above freezing", Helper.isFreezing(40));
    	assertEquals("above freezing", Helper.isFreezing(100));
    }
}
