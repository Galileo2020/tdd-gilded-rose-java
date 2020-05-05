package cn.xpbootcamp.gilded_rose;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class BackstagePass extends BaseCommodity {

    public BackstagePass(Integer sellIn, Integer quality, LocalDate refreshDate) {
        super(sellIn, quality, refreshDate);
    }

    @Override
    public Integer getQualityOfGivenDate(LocalDate someday) {
        int result = getQuality();
        int days = (int) DAYS.between(getRefreshDate(), someday);

        if (days > getSellIn()) {
            result = 0;
        } else {
            if (days < 5) {
                result = result + 3 * days;
            } else {
                result = result + days;
            }

            if (result > 50) result = 50;
        }

        return result;
    }
}
