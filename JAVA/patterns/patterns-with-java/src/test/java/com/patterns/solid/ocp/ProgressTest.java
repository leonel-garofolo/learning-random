package com.patterns.solid.ocp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgressTest {

	@Test
	public void getSentLengthPercentageToSong() {
		final Song song = new Song(10d, 20d);
		Progress progress = new Progress();
		progress.getSentLengthPercentage(song);
	}

	@Test
	public void getSentLengthPercentageToFile() {
		final File file = new File(10d, 20d);
		Progress progress = new Progress();
		progress.getSentLengthPercentage(file);
	}
}