package com.patterns.solid.lsv.violation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
	@Test
	public void calculate_its_area() {
		Integer rectangleLength = 2;
		Integer rectangleWidth = 2;
		Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

		Integer expectedArea = 4;
		assertEquals(expectedArea, rectangle.getArea());

		rectangle.setLength(4);
		Integer newExpectedArea = 8;
		assertEquals(newExpectedArea, rectangle.getArea());
	}
}