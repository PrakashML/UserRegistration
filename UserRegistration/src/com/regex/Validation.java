package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    String fname;
    String lname;
    String mail;
    String phno;
    String Pass;
    Scanner sc =  new Scanner(System.in);
    public Validation(){
        this.fname = fname;
    }
    public void validFirst(){
        System.out.println("Enter the first name: ");
        for(int i=0;;i++){
            fname = sc.next();
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

    public void validLast(){
        System.out.println("Enter the last name: ");
        for(int i=0;;i++){
            lname = sc.next();
            Pattern p1 = Pattern.compile("[A-Z]{1}[a-z]{2}[a-z]+$");
            Matcher m1 = p1.matcher(lname);
            if(m1.matches()){
                System.out.println("Name got validated");
                break;
            }
            else{
                System.out.println("Input not valid, Enter again!");
            }
        }

    }

    public void validMail(){
        System.out.println("Enter the email: ");
        for(int i=0;;i++){
            mail = sc.next();
            Pattern p1 = Pattern.compile("^[a-z0-9]+(\\.[a-z0-9]+)*@[a-z]+(\\.[a-z]{2,})*(\\.[a-z]{2,})?$");
//            & co) and 2 optional (xyz & in) with
//            precise @ and . positions
            Matcher m1 = p1.matcher(mail);
            if(m1.matches()){
                System.out.println("Email validated!");
                break;
            }
            else{
                System.out.println("InValid Email");
            }
        }
    }

    public void validPhno(){
        System.out.println("Enter the Phone Number: ");

        for(int i=0;;i++){
            phno = sc.nextLine();
            Pattern p1 = Pattern.compile("^[+]{1}\\d{2} \\d{10}$");
            Matcher m1 = p1.matcher(phno);
            if(m1.matches()){
                System.out.println("Phno got Validated");
                break;
            }
            else{
                System.out.println("Not Validated! Enter again");
            }
        }

    }
    public void validPWord(){
        System.out.println("Enter Password: ");

        for(int i=0;;i++){
            Pass = sc.nextLine();
            Pattern p1 = Pattern.compile("^[a-zA-Z0-9!@#$%^&*_+]{8,}$");
            Matcher m1 = p1.matcher(Pass);
            if(m1.matches()){
                System.out.println("PassWord got Validated");
                break;
            }
            else{
                System.out.println("Not Validated! Enter again");
            }
        }

    }

    @Override
    public String toString() {
        return "Validation{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mail='" + mail + '\'' +
                ", Phno='" + phno + '\'' +
                ", Password='" + Pass + '\'' +
                '}';
    }
}
