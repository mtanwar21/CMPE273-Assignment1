package com.gaana.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SongTest {

	@Test
	public void testGetSongGenere() {
		Song song = new Song("","",2,"TestGenere");
		assertEquals("TestGenere1", song.getSongGenere());
	}

}
