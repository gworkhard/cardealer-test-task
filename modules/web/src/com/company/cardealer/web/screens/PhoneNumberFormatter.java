package com.company.cardealer.web.screens;

import java.util.function.Function;

public class PhoneNumberFormatter implements Function<String, String> {
    @Override
    public String apply(String number) {
        String formattedNumber = number.replaceFirst("(\\d{1})(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 $2 $3 $4 $5");
        return formattedNumber;
    }
}
