package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rosie on 08/02/2017.
 */
public class BrieTest {

    private Brie brie, brieMaxQuality;

    @Before
    public void setUp() {
        brie = new Brie("Brie", 10, 8);
        brieMaxQuality = new Brie("Brie", 0, 50);
    }

    @Test
    public void getName() {
        assertEquals(brie.getName(), "Brie" );
    }

    @Test
    public void getSellIn() {
        assertEquals(brie.getSellIn(), 10 );
    }

    @Test
    public void getQuality() {
        assertEquals(brie.getQuality(), 8 );
    }

    @Test
    public void updateReducesSellIn() {
        brie.update();
        assertEquals(brie.getSellIn(), 9);
    }

    @Test
    public void updateIncreasesQuality() {
        brieMaxQuality.update();
        assertEquals(brieMaxQuality.getQuality(), 50);
    }

    @Test
    public void maximumQuality50() {
        brie.update();
        assertEquals(brie.getQuality(), 9);
    }
}