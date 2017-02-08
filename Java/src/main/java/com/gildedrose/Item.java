package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
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
