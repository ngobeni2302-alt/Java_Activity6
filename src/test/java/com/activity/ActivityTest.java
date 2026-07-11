package com.activity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    @Test
    public void testConditionals() {
        Conditionals cond = new Conditionals();
        // 1
        assertTrue(cond.checkMaintenanceUrgency(45));
        assertFalse(cond.checkMaintenanceUrgency(15));
        // 2
        assertEquals(40.0, cond.getRentalRate("Car"));
        assertEquals(30.0, cond.getRentalRate("Motorcycle"));
        // 3
        assertEquals(0.20, cond.calculateInsuranceDiscount(5, false));
        assertEquals(0.0, cond.calculateInsuranceDiscount(5, true));
        // 4
        assertEquals("Light", cond.verifyCargoWeight(1500));
        assertEquals("Overweight", cond.verifyCargoWeight(6000));
        // 5
        assertTrue(cond.approveDispatch(true, true, false));
        assertFalse(cond.approveDispatch(true, true, true));
    }

    @Test
    public void testForLoops() {
        ForLoops loops = new ForLoops();
        // 1
        assertEquals(85.0, loops.calculateDepreciation(100.0, 0.15, 1), 0.01);
        // 2
        assertEquals(15, loops.totalFleetCapacity(new int[]{2, 4, 9}));
        // 3
        assertEquals("8-10-12-14-", loops.generateIntervalTimeline(8, 14, 2));
        // 4
        assertEquals(2, loops.countTargetVehicles(new String[]{"Car", "Truck", "Car"}, "Car"));
        // 5
        assertEquals(120, loops.calculateRoutePermutations(5));
    }

    @Test
    public void testWhileLoops() {
        WhileLoops loops = new WhileLoops();
        // 1
        assertEquals(600, loops.simulateDriveDistance(50, 8));
        // 2
        assertEquals(3, loops.trackingYearsToProfitTarget(5000, 6500, 0.10));
        // 3
        assertEquals(15, loops.sumOdometerDigits(1356));
        // 4
        assertEquals(0, loops.drainHydraulicFluid(100, 25));
        // 5
        assertEquals(2, loops.findFirstAvailableBay(new boolean[]{true, true, false, true}));
    }
}
