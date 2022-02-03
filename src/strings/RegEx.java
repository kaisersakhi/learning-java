package strings;

import java.lang.String;

public class RegEx {
    public static void main(String[] args) {
        String email = "KaiserSakhi@outlook.com";

        String xp = "([a-z]|[A-Z])*@{1}([a-z]|[A-Z])+.{1}(([a-z]|[A-Z])+){2,8}";

        String userName = email.substring(0,email.indexOf('@'));
        String hostName = email.substring(email.indexOf('@') + 1);

        System.out.println("User Name is : " + userName + " | Host is :  "+hostName );


        System.out.println( email.matches(xp));
    }
}


/*
*
*   with matches method of string class, we can test a regular expression on a string
* */