package Javaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IQ_21_Regex_Split_tokens {
    public static void main(String[] args) {
        String input = "Hello123, World! 456 Java_789";
        
        // Define a regular expression pattern to match letters, special chars, and numbers
        Pattern pattern = Pattern.compile("([a-zA-Z]+|[0-9]+|[^a-zA-Z0-9]+)");
        
        // Create a Matcher to find and split the string
        Matcher matcher = pattern.matcher(input);
        
        // Split and print the tokens
        while (matcher.find()) {
            String token = matcher.group();
            System.out.println(token);
        }
    }
}
