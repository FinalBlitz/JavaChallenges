package org.yup;
import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age){
        // let folks into the party if they are 21 and up
        // politely tell them they cant enter underage
        if(age >= 21){
            return "Hello " + name + ", welcome to the party";
            // this is what happened if the condition is true//
        }else{
            // this is what happened if the condition is false
            return "Hello" + name + ", I am sorry but we cannot let you into the party";
        }


    }

    public String greetingWithUserInput(){

        Scanner scanner = new Scanner(System.in);
        // we need to ask the user what their name is
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        // we need to ask the user what their age is
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        // let folks into the party if they are 21 and up
        // politely tell them they cant enter underage
        if(age >= 21){
            return "Hello " + name + ", welcome to the party";
            // this is what happened if the condition is true//
        }else{
            // this is what happened if the condition is false
            return "Hello" + name + ", I am sorry but we cannot let you into the party";
        }


    }

    public int addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int number2 = scanner.nextInt();
        return number1 + number2;
    }
    public int subtractTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int number2 = scanner.nextInt();
        return number1 - number2;
    }
    public int multipleTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int number2 = scanner.nextInt();
        return number1 * number2;
    }


}
