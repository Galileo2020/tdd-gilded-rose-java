package cn.xpbootcamp.gilded_rose;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class BaseCommodity {
    private Integer sellIn;
    private Integer quality;
    private LocalDate refreshDate;

    public BaseCommodity(Integer sellIn, Integer quality, LocalDate refreshDate) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.refreshDate = refreshDate;
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

    public LocalDate getRefreshDate() {
        return refreshDate;
    }

    public void setRefreshDate(LocalDate refreshDate) {
        this.refreshDate = refreshDate;
    }

    public Integer getQualityOfGivenDate(LocalDate someday) {
        int quality = this.quality;
        int days = (int) DAYS.between(refreshDate, someday);

        if (days <= sellIn) {
            quality = quality - days;
        } else {
            quality = quality - sellIn - 2 * (days - sellIn);
        }

        if (quality < 0) {
            quality = 0;
        }
        return quality;
    }
}
