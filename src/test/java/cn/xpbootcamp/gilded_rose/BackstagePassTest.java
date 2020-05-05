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
        BackstagePass backstagePass = new BackstagePass(11, 20, today);

        LocalDate OneDayLater = today.plusDays(1);

        Assertions.assertEquals(21, backstagePass.getQualityOfGivenDate(OneDayLater).intValue());
    }

    @Test
    void qualityShouldNotMoreThanFifty() {
        LocalDate today = LocalDate.now();
        BackstagePass backstagePass = new BackstagePass(11, 50, today);

        LocalDate OneDayLater = today.plusDays(1);

        Assertions.assertEquals(50, backstagePass.getQualityOfGivenDate(OneDayLater).intValue());
    }

    @Test
    void qualityShouldReturnZeroAfterDueDate() {
        LocalDate today = LocalDate.now();
        BackstagePass backstagePass = new BackstagePass(0, 50, today);

        LocalDate OneDayLater = today.plusDays(1);

        Assertions.assertEquals(0, backstagePass.getQualityOfGivenDate(OneDayLater).intValue());
    }
}
