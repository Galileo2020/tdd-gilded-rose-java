package cn.xpbootcamp.gilded_rose;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class SulfurasTest {
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void qualityShouldKeepTheSameWithTimeGoing() {
        LocalDate today = LocalDate.now();
        Sulfuras sulfuras = new Sulfuras(null, 10, today);

        LocalDate tomorrow = today.plusDays(1);
        Assertions.assertEquals(10, sulfuras.getQualityOfGivenDate(tomorrow).intValue());
    }
}
