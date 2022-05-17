import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    /**
     * Test of GetMake method, of class Car.
     */
    @Test
    public void testGetMake() {
        System.out.println("GetMake");
        Car instance = new CarImpl();
        String expResult = "Toyota";
        String result = instance.GetMake();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("GetModel");
        Car instance = new CarImpl();
        String expResult = "Celica";
        String result = instance.GetModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetSeats method, of class Car.
     */
    @Test
    public void testGetSeats() {
        System.out.println("GetSeats");
        Car instance = new CarImpl();
        int expResult = 4;
        int result = instance.GetSeats();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetHorsePower method, of class Car.
     */
    @Test
    public void testGetHorsePower() {
        System.out.println("GetHorsePower");
        Car instance = new CarImpl();
        int expResult = 140;
        int result = instance.GetHorsePower();
        assertEquals(expResult, result);
    }

    /**
     * Test of Info method, of class Car.
     */
    @Test
    void info() {
        System.out.println("Info");
        Car instance = new CarImpl();
        String expResult = "Márka: Toyota, Típus: Celica, Ülések: 4, Lóerő: 140";
        String result = instance.Info();
        assertEquals(expResult, result);
    }

    public static class CarImpl extends Car {

        public String GetMake() {
            return "Toyota";
        }

        public String GetModel() {
            return "Celica";
        }

        public int GetSeats() {
            return 4;
        }

        public int GetHorsePower() {
            return 140;
        }
    }
}