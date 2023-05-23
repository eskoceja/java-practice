package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

//      Write a regular expression to match a valid email address.
        String email = "This statement contains an email username@email.com";
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z | a-z]{2,}\\b";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);

        if(emailMatcher.find()) {
            System.out.println("Email: " + emailMatcher.group());
        } else {
            System.out.println("Invalid email");
        }

//      Write a regular expression to match a valid phone number in the format (123) 456-7890.
        String phone = "Call me at (123) 456-7890";
        String phoneRegex = "\\(\\d{3}\\) \\d{3}-\\d{4}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(phone);

        if(phoneMatcher.find()) {
            System.out.println("Phone Number: " + phoneMatcher.group());
        } else {
            System.out.println("Invalid phone number");
        }

//      Write a regular expression to match a valid date in the format MM/DD/YYYY.
        String date = "My birth date is 06/11/1995";
        String dateRegex = "\\b(0[1-9]|1[0-2])/(0[1-9]|[12]\\d|3[01])/\\d{4}\\b";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher dateMatcher = datePattern.matcher(date);

        if(dateMatcher.find()) {
            System.out.println("Date: " + dateMatcher.group());
        } else {
            System.out.println("invalid date");
        }

//      Write a regular expression to match a valid URL.
        String url = "The URL to my LinkedIn is https://www.linkedin.com/in/emily-koceja/";
        String urlRegex = "((https?|ftp)://)?([\\w.-]+(\\.[\\w.-]+)+(:\\d+)?(/\\S*)?)";
        Pattern urlPattern = Pattern.compile(urlRegex);
        Matcher urlMatcher = urlPattern.matcher(url);

        if(urlMatcher.find()) {
            System.out.println("URL: " + urlMatcher.group());
        } else {
            System.out.println("Invalid URL");
        }

//      Write a regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces).
        String creditCard = "Take my money!! My card number is 4012 8888 8888 1881";
        String creditCardRegex = "\\d{4} \\d{4} \\d{4} \\d{4}";
        Pattern creditCardPattern = Pattern.compile(creditCardRegex);
        Matcher creditCardMatcher = creditCardPattern.matcher(creditCard);

        if(creditCardMatcher.find()) {
            System.out.println("Credit Card Number: " + creditCardMatcher.group());
        } else {
            System.out.println("Invalid credit card number");
        }

//      Write a regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).
        String zipCode = "I live in Kannapolis, NC the zip code is 28081-1234";
        String zipCodeRegex = "^[0-9]{5}-[0-9]{4}|[0-9]{5}";
        Pattern zipCodePattern = Pattern.compile(zipCodeRegex);
        Matcher zipCodeMatcher = zipCodePattern.matcher(zipCode);

        if(zipCodeMatcher.find()) {
            System.out.println("Zip Code: " + zipCodeMatcher.group());
        } else {
            System.out.println("Invalid zip code");
        }

//      Write a regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).
        String javaId = "JavAidenTifiEr_123$";
        String javaIdRegex = "^[A-Za-z_$][A-Za-z\\d_$]*$";
        Pattern javaIdPattern = Pattern.compile(javaIdRegex);
        Matcher javaIdMatcher = javaIdPattern.matcher(javaId);

        if(javaIdMatcher.matches()) {
            System.out.println("Java Identifier: " + javaIdMatcher.group());
        } else {
            System.out.println("Invalid input");
        }

//      Write a regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).
        String hexaColor = "My favorite color today is #ffc8dd";
        String hexaColorRegex = "#([0-9a-fA-F]{6})";
        Pattern hexiColorPattern = Pattern.compile(hexaColorRegex);
        Matcher hexiColorMatcher = hexiColorPattern.matcher(hexaColor);

        if(hexiColorMatcher.find()) {
            System.out.println("Hexadecimal Color Code: " + hexiColorMatcher.group());
        } else {
            System.out.println("Invalid hexadecimal color code");
        }

//      Write a regular expression to match a valid time in the 24-hour format (HH:MM).
        String time = "It is 04:32, almost time to go!";
        String timeRegex = "\\b([01]?\\d|2[0-3]):([0-5]\\d)\\b";
        Pattern timePattern = Pattern.compile(timeRegex);
        Matcher timeMatcher = timePattern.matcher(time);

        if(timeMatcher.find()) {
            System.out.println("Time: " + timeMatcher.group());
        } else {
            System.out.println("Invalid time");
        }

    }

}
