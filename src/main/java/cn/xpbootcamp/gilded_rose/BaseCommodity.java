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
        int days = (int) DAYS.between(refreshDate, someday);
        return quality - days;
    }
}
