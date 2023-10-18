package by.clevertec.lobacevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    public void positive() {
        assertTrue(Utils.isAllPositiveNumbers("1234", "534", "3262"));
    }

    @Test
    public void negative() {
        assertFalse(Utils.isAllPositiveNumbers("1234", "-534", "56483"));
    }

    @Test
    public void notNumber() {
        assertFalse(Utils.isAllPositiveNumbers("1234", "opi", "56483"));
    }
}
