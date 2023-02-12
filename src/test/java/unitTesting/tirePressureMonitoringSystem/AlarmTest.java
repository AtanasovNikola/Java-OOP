package unitTesting.tirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class AlarmTest {

    private static final double HIGH_PRESSURE_THRESHOLD = 50;
    private static final double LOW_PRESSURE_THRESHOLD = 10;
    private static final double NORMAL_PRESSURE_THRESHOLD = 18;

    @Test
    public void testConstructor() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);
        new Alarm(fakeSensor);
    }

    @Test
    public void testAlarmTurnsOnForLowPressure() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(LOW_PRESSURE_THRESHOLD);

        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        Assert.assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void testAlarmTurnsOnForHighPressure() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(HIGH_PRESSURE_THRESHOLD);

        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        Assert.assertTrue(alarm.isAlarmOn());
    }


    @Test
    public void testAlarmTurnsOffForNormalPressure() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(NORMAL_PRESSURE_THRESHOLD);

        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        Assert.assertFalse(alarm.isAlarmOn());
    }
}