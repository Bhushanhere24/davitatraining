package com.citiustech;

public class CitiIdValidation {

//    Generate method to validate Citi ID should be starting with CT + 8 digits
    public static boolean isValidCitiId(String citiId) {
        if (citiId == null || citiId.length() != 10) {
            return false;
        }
        return citiId.startsWith("CT") && citiId.substring(2).matches("\\d{8}");
    }

}
