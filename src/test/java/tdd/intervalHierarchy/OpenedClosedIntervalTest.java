package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OpenedClosedIntervalTest {
	@Test
	public void testIsIntersectedSamePoint() {
		Interval open = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval close = new IntervalBuilder().min(3).max(14).untilIsClosed(true).build();
		assertTrue(open.isIntersected(close));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(3).max(7).untilIsClosed(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(17).max(20).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(7).max(17).untilIsClosed(true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(3).max(14).untilIsClosed(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(7).max(17).untilIsClosed(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(0).max(17).untilIsClosed(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(5).max(10).untilIsClosed(true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(0).max(2).untilIsClosed(true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3).max(14).fromIsClosed(false).build();
		Interval another = new IntervalBuilder().min(16).max(22).untilIsClosed(true).build();
		assertFalse(one.isIntersected(another));
	}
	
}