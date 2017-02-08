package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void retainsItemsAfterUpdate() {
        Item[] items = new Item[] { new Item("pea soup", 0, 6),
                new Item("meringue", 4, 2)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals(app.items.length, 2);
    }

    @Test
    public void updatesItemSellIn() {
        Item[] items = new Item[] { new Item("pea soup", 0, 6),
                new Item("meringue", 4, 2)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals(app.items[0].sellIn, -1);
    }

    @Test
    public void updatesItemQuality() {
        Item[] items = new Item[] { new Item("pea soup", 0, 6),
                new Item("meringue", 4, 2)};
        GildedRose app = new GildedRose(items);
        app.updateItems();
        assertEquals(app.items[0].quality, 4);
    }

}
