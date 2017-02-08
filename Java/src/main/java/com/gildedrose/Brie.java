package com.gildedrose;

/**
 * Created by rosie on 08/02/2017.
 */

public class Brie {

    private String name;

    private int sellIn;

    private int quality;

    public Brie(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return this.name;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public Brie update() {
        this.sellIn --;
        updateQuality();
        return this;
    }

    private void updateQuality() {
        if (this.quality < 50) this.quality ++;
    }
}
