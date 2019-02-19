package com.company;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralShould {

    @Test
    public void convert_one_to_I() {
        RomanNumerals arabicToRoman = new RomanNumerals();
        assertThat(
                arabicToRoman.convertArabicToRoman(1),
                is("I"));
    }

    @Test
    public void convert_to_numbers_of_multiple_I_chars() {
        RomanNumerals arabicToRoman = new RomanNumerals();
        assertThat(
                arabicToRoman.convertArabicToRoman(2),
                is("II"));

    }

    @Test
    public void convert_three_to_III() {
        RomanNumerals arabicToRoman = new RomanNumerals();
        assertThat(
                arabicToRoman.convertArabicToRoman(3),
                is("III"));

    }

    @Test
    public void convert_four_to_IV() {
        RomanNumerals arabicToRoman = new RomanNumerals();
        assertThat(
                arabicToRoman.convertArabicToRoman(4),
                is("IV"));


    }


}

