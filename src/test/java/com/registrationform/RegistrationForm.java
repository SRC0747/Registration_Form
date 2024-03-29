package com.registrationform;
import java.util.regex.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class RegistrationForm {
    // Function to validate the First Username
    public static boolean isValidFirstUsername(String name)
    {

        // Regex to check valid username.
        String regex = "^[Cap]\\w{5,29}[A-Za-z]$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);

        // Return if the username
        // matched the ReGex
        return m.matches();
    }
    // Function to validate the Second Username
    public static boolean isValidSecondUsername(String name)
    {

        // Regex to check valid username.
        String regex = "^[Cap]\\w{5,29}[A-Za-z]$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);

        // Return if the username
        // matched the ReGex
        return m.matches();
    }
    
     //Check the Valid Email-id.
    public static boolean isValidEmail(String name)
    {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher("foobar@gmail.com");
    }
    
    //Checking the valid 10-digit mobile number.
    @Test
    public boolean whenMatchesTenDigitsNumber_thenCorrect() {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher("91 7523654895");
        assertTrue(matcher.matches());
    }
    
    // Checking The Valid 8-Character Password.
    @Test
    public void isValidPassword() {
        Pattern pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
        Matcher matcher = pattern.matcher("SrcSrkKolkata");
    }
    public static void main(String[] args)
    {
        // Test Case: 1
        String str1 = "Geeksforgeeks";
        System.out.println(isValidFirstUsername(str1));

        // Test Case: 2
        String str2 = "Cap23aSjk";
        System.out.println(isValidFirstUsername(str2));

        // Test Case: 3
        String str3 = "Cap47RjSrc";
        System.out.println(isValidFirstUsername(str3));

        //Checking the last username.
        // Test Case: 1
        String str1 = "Kolkata22";
        System.out.println(isValidSecondUsername(str1));

        // Test Case: 2
        String str2 = "Cap36MkS";
        System.out.println(isValidSecondUsername(str2));

        // Test Case: 3
        String str3 = "CapRiya526Biny";
        System.out.println(isValidSecondUsername(str3));
        
        //Checking Email-id.
        String email = "sampritirc@gmail.com";
        System.out.println(isValidEmail(email));
        
         //Checking Valid Mobile Number.
        System.out.println(whenMatchesTenDigitsNumber_thenCorrect());
        
         //Check the 8-digits Password.
        String password = "SrcSrkKolkata";
        System.out.println(isValidPassword(password));
        
        //Checking at least 1 UpperCase in Password.
        String password_upper = "Sampriti@Kolkata";
        System.out.println(isValidPassword(password_upper));
        
        //Checking at least 1 Numeric Digit in Password.
        String password_numericdigit = "Sampriti0747July";
        System.out.println(isValidPassword(password_numericdigit));
        
         //Checking at least 1 Special Character in Password.
        String password_Spceial_char = "Sampriti07@47$July";
        System.out.println(isValidPassword(password_Spceial_char));
        
         //Remove all Sample Email-id
        String input = "Hello world my # is 123 mail me @ test@test.com";
        String EMAIL_PATTERN = "([^.@\\s]+)(\\.[^.@\\s]+)*@([^.@\\s]+\\.)+([^.@\\s]+)";

        String output = input.replaceAll(EMAIL_PATTERN, "") // Replace emails
                // by an empty string
                .replaceAll("\\p{Punct}", "") // Replace all punctuation. One of
                // !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
                .replaceAll("\\d", "") // Replace any digit by an empty string
                .replaceAll("\\p{Blank}{2,}+", " "); // Replace any Blank (a  space or
        // a tab) repeated more than once
        // by a single space.

        System.out.println(output);
    }
}
