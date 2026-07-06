package com.bridgelabz.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {

    // Validates the train ID.
    public boolean validateTrainId(String trainId) {

        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);

        return matcher.matches();
    }

    // Validates the cargo code.
    public boolean validateCargoCode(String cargoCode) {

        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);

        return matcher.matches();
    }

}
