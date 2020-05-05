package cn.xpbootcamp.gilded_rose;

public class BaseCommodity {
    private Integer sellIn;
    private Integer quality;

    public BaseCommodity(Integer sellIn, Integer quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }
}
