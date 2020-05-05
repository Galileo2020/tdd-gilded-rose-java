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
            for (int i = 1; i <= days; i++) {
                result = result + getRate(getSellIn() - i);
            }

            if (result > 50) result = 50;
        }

        return result;
    }

    private Integer getRate(Integer daysBeforeExpired) {
        if (daysBeforeExpired >= 10) {
            return 1;
        } else if (daysBeforeExpired >= 5)
            return 2;
        else if (daysBeforeExpired >= 0)
            return 3;
        else
            return 0;
    }
}
