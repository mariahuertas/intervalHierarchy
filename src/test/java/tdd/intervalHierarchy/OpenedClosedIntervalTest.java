package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpenedClosedIntervalTest {
	@Test
	public void testIsIntersectedSamePoint() {
		Interval open = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval close = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(open.isIntersected(close));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		Interval another = new ClosedIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new OpenedIntervalBuilder().min(17).max(20).build();
		Interval another = new ClosedIntervalBuilder().min(7).max(17).build();
		assertFalse(one.isIntersected(another));
	}
	
}