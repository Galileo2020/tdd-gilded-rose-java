package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class BaseCommodityTest {
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getQualityOfGivenDate() {
        LocalDate today = LocalDate.now();
        BaseCommodity baseCommodity = new BaseCommodity(10, 12, today);

        LocalDate tomorrow = today.plusDays(1);
        Integer quality = baseCommodity.getQualityOfGivenDate(tomorrow);

        Assertions.assertEquals(11, quality.intValue());
    }
}
