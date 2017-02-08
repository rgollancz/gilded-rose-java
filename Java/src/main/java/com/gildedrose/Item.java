package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
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

    public Item update() {
        this.sellIn --;
        updateQuality();
        return this;
    }

    private void updateQuality() {
        this.quality -= this.sellIn > 0 ? 1 : 2;
        if (this.quality <0) this.quality = 0;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
