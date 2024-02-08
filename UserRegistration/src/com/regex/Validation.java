package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    String fname;
    String lname;
    Scanner sc =  new Scanner(System.in);
    public Validation(){
        this.fname = fname;
    }
    public void validFirst(){
        System.out.println("Enter the first name: ");
        for(int i=0;;i++){
            String fname = sc.next();
            Pattern p1 = Pattern.compile("[A-Z]{1}[a-z]{2}[a-z]+$");
            Matcher m1 = p1.matcher(fname);
            if(m1.matches()){
                System.out.println("Name got validated");
                break;
            }
            else{
                System.out.println("Input not valid, Enter again!");
            }
        }
    }

}
