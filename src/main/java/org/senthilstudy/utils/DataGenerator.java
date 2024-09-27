package org.senthilstudy.utils;


import com.github.javafaker.Faker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataGenerator {

    private final String STRINGREGEX = "/#random_\\d+char_String";
    private final String INTREGEX = "/#random_\\d+digit_Number";
    private Faker faker;

    private final static DataGenerator dataGenerator = new DataGenerator();

    private DataGenerator() {
        faker = new Faker();
    }

    /**
     * singleton instance
     * @return
     */
    public static DataGenerator getInstance() {
        return dataGenerator;
    }

    /**
     * an util function to generate function
     * @return
     */
    public String getRandomNumber(String random){
        Matcher matcher = getMatcher(INTREGEX,random);
        String digit = matcher.group(1);
        return faker.lorem().characters(Integer.valueOf(digit));
    }

    /**
     * get random string by passing the rgex
     * @param random
     * @return
     */
    public String getRandomString(String random){
        Matcher matcher = getMatcher(STRINGREGEX,random);
        String digit = matcher.group(1);
        return faker.lorem().characters(Integer.valueOf(digit));
    }

    /**
     * an private method to return the matcher
     * @param regex
     * @param inputString
     * @return
     */
    private Matcher getMatcher(String regex, String inputString){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher;
    }


}
