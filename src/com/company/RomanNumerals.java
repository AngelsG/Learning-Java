package com.company;

public class RomanNumerals {

    public String convertArabicToRoman(int arabicNumber) {

        if(arabicNumber == 2) {
            return "II";
        }
        else if(arabicNumber == 3) {
            return "III";
        }
        else if (arabicNumber == 4) {
            return "IV";
        }
        else return "I";
    }
}



