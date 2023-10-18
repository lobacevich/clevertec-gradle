package by.clevertec.lobacevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void positive() {
        assertTrue(StringUtils.isPositiveNumber("72"));
    }

    @Test
    public void negative() {
        assertFalse(StringUtils.isPositiveNumber("-3"));
    }

    @Test
    public void zero() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    public void notNumber() {
        assertFalse(StringUtils.isPositiveNumber("pq"));
    }
}
