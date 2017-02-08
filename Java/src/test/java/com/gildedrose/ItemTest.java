package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ItemTest {

    private Item itemWithSellIn, itemZeroSellIn;

    @Before
    public void setUp() {
        itemWithSellIn = new Item("foo", 4, 4);
        itemZeroSellIn =  new Item("foo", 0, 4);
    }

    @Test
    public void textSummary() {
        assertEquals(itemWithSellIn.toString(), "foo, 4, 4" );
    }

    @Test
    public void getName() {
        assertEquals(itemWithSellIn.getName(), "foo");
    }

    @Test
    public void getSellIn() {
        assertEquals(itemWithSellIn.getSellIn(), 4);
    }

    @Test
    public void getQuality() {
        assertEquals(itemWithSellIn.getQuality(), 4);
    }

    @Test
    public void updateReducesSellIn() {
        itemWithSellIn.update();
        assertEquals(itemWithSellIn.getSellIn(), 3);
    }

    @Test
    public void updateReducesQualityByOne() {
        itemWithSellIn.update();
        assertEquals(itemWithSellIn.getQuality(), 3);
    }

    @Test
    public void updateReducesQualityByTwo() {
        itemZeroSellIn.update();
        assertEquals(itemZeroSellIn.getQuality(), 2);
    }
}
