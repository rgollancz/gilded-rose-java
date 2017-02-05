package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

    @Test
    public void textSummary() {
        Item item = new Item("foo", 0, 0);
        assertEquals(item.toString(), "foo, 0, 0" );
    }

    @Test
    public void getName() {
        Item item = new Item("foo", 0, 0);
        assertEquals(item.name, "foo");
    }

    @Test
    public void getSellIn() {
        Item item = new Item("foo", 0, 0);
        assertEquals(item.sellIn, 0);
    }

    @Test
    public void getQuality() {
        Item item = new Item("foo", 0, 0);
        assertEquals(item.quality, 0);
    }
}
