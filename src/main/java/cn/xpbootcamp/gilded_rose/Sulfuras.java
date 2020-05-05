package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class Sulfuras extends BaseCommodity {

    public Sulfuras(Integer sellIn, Integer quality, LocalDate refreshDate) {
        super(sellIn, quality, refreshDate);
    }

    @Override
    public Integer getQualityOfGivenDate(LocalDate someday) {
        return getQuality();
    }
}
