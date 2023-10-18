package by.clevertec.lobacevich;

public class Utils {

    private Utils() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        for (String el : str) {
            if (!StringUtils.isPositiveNumber(el)) {
                return false;
            }
        }
        return true;
    }
}
