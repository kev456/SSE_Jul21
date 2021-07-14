package com.ss.jb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import com.ss.jb.four.Line;

public class LineTest {
	
	// New lines
	Line x = new Line(0.0, 5.0, 1.0, 8.0);
	Line l = new Line(3.0, 0.0, 2.0, 3.0);
	Line y = new Line(4.0, 6.0, 1.0, 7.0);
	
	// Test if getSlope is accurate
	@Test
	public void testGetSlope() {
		assertEquals(3.0, x.getSlope(), .0001);
		// assertNotEquals(5.0, x.getSlope(), .0001);
	}
	
	// Test if getDistance is accurate
	@Test
	public void testGetDistance() {
		assertEquals(Math.sqrt(10), x.getDistance(), .0001);
		// assertNotEquals(9, x.getDistance(), .0001);
	}
	
	// Test if parallelTo is accurate
	@Test
	public void TestParallelTo() {
		// assertEquals(true, x.parallelTo(l));
		// assertNotEquals(true, x.parallelTo(y));
	}
	
}
