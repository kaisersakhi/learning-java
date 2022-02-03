package strings;

import java.lang.String;

public class MyString {


    public static void main(String[] args) {
        String firstName = "Kaiser ";
        String middleName = "Sakhi ";
        String sureName = "   Bhat  ";

        String fullName = firstName + middleName + " "+sureName.trim();

        System.out.println("Length of firstName is : " + firstName.length());
        System.out.println("Length of full name : "+ (firstName+middleName+sureName).length());

        System.out.println("To Upper : " + firstName.toUpperCase());
        System.out.println("Trimming SureName : "+ sureName.trim());

        System.out.println("Substring of full name : "+(firstName+middleName+sureName).substring(7,12));

        System.out.println("Replacing 'A' : "+ (firstName+middleName+sureName).replace("a", "I"));

        System.out.println("Does starts with 'Kaiser' ? : " + fullName.startsWith("Kaiser"));
        System.out.println("Does ends with Bhat ? : " + fullName.endsWith("Bhat"));

        System.out.println("Char at 7th index : " + fullName.charAt(7));
        System.out.println("Sakhi starts from index : " + fullName.indexOf("B")); //lastIndexOf(String) will scan string from the end

        System.out.println("Is SureName and FirstName same ? : " + firstName.equals(sureName));

        System.out.println("Value of 75 is : "+ String.valueOf('K')); // String.valueOf() turns everything into a string

    }
}
