package basic.library;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapsTest {
    @Test
    public void missingTemp(){
        Maps bananaWeather = new Maps();

        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String bananaResult = bananaWeather.weatherReport(weeklyMonthTemperatures);
//        assertTrue("this should be the high temp", highTemp == 72);

        String testString = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69";
        assertEquals(testString, bananaResult);
    }
}
