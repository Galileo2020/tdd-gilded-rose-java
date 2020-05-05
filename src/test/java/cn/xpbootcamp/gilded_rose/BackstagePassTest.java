package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class BackstagePassTest {
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void qualityShouldIncreaseWithTime() {
        LocalDate today = LocalDate.now();
        BackstagePass backstagePass = new BackstagePass(11, 100, today);

        LocalDate OneDayLater = today.minusDays(1);

        Assertions.assertEquals(101, backstagePass.getQualityOfGivenDate(OneDayLater).intValue());
    }
}
