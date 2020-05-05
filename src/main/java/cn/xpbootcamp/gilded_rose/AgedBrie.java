package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class AgedBrie extends BaseCommodity {

    public AgedBrie(Integer sellIn, Integer quality, LocalDate refreshDate) {
        super(sellIn, quality, refreshDate);
    }

    @Override
    public Integer getQualityOfGivenDate(LocalDate someday) {
        return super.getQualityOfGivenDate(someday);
    }
}
