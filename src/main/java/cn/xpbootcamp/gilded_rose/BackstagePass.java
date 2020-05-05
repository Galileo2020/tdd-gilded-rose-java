package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class BackstagePass extends BaseCommodity {

    public BackstagePass(Integer sellIn, Integer quality, LocalDate refreshDate) {
        super(sellIn, quality, refreshDate);
    }

    @Override
    public Integer getQualityOfGivenDate(LocalDate someday) {
        return 0;
    }
}
