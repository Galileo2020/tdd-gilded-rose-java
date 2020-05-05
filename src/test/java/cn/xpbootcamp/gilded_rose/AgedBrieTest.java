package cn.xpbootcamp.gilded_rose;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class AgedBrieTest {

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void qualityShouldIncreaseWithTime() {
        LocalDate today = LocalDate.now();
        AgedBrie agedBrie = new AgedBrie(0, 0, today);

        LocalDate tomorrow = today.plusDays(1);
        Integer quality = agedBrie.getQualityOfGivenDate(tomorrow);

        Assertions.assertEquals(1, quality.intValue());
    }

    @Test
    void qualityShouldLessAndEqualThanFifty() {
        LocalDate today = LocalDate.now();
        AgedBrie agedBrie = new AgedBrie(0, 0, today);

        LocalDate tomorrow = today.plusDays(100);
        Integer quality = agedBrie.getQualityOfGivenDate(tomorrow);

        Assertions.assertEquals(50, quality.intValue());
    }
}
