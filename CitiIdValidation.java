package com.citiustech;

public class CitiIdValidation {

//    Generate method to validate Citi ID should be starting with CT + 8 digits
    public static boolean isValidCitiId(String citiId) {
        if (citiId == null || citiId.length() != 10) {
            Syste.out.printl("Id not Valid");
            return false;
        }
        return citiId.startsWith("CT") && citiId.substring(2).matches("\\d{8}");
    }

    //    Generate method to validate given phone number is valid Indian number or not
    public static boolean isValidIndianPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d{10}")) {
            return false;
        }
        return true;
    }

}
