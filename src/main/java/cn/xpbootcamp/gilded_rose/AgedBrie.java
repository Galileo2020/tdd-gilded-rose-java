package cn.xpbootcamp.gilded_rose;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class AgedBrie extends BaseCommodity {

    public AgedBrie(Integer sellIn, Integer quality, LocalDate refreshDate) {
        super(sellIn, quality, refreshDate);
    }

    @Override
    public Integer getQualityOfGivenDate(LocalDate someday) {
        int result = getQuality();
        int days = (int) DAYS.between(getRefreshDate(), someday);
        result = result + days;
        return result;
    }
}
