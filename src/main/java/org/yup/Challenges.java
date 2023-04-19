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

    public int interactiveCalculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER: ");

        int userSelection = scanner.nextInt();

        int result;

        switch (userSelection) {
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = this.multipleTwoNumbers();
                break;
            default:
                System.out.println("the user chose nonsense(didn't exist as a choice)");
                return 0;
        }
        return result;
    }

    public static String coinFlip(){
        //attempt to flip a coin.
        //return heads or tails

        if(Math.random() > .5) {
            return "heads";
        }else{

            return "tails";

        }

    }

    public String findTheBiggestNumber(){

        Scanner scanner = new Scanner(System.in);
        //this is where we ask the user for input
        System.out.println("give me the first number please ");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        //this is where we ask the user for input
        System.out.println("give me the second number please ");
        //this is where we capture that input and store it in a variable called secondNumber
        int secondNumber = scanner1.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "the Biggest number between " + firstNumber + " and " + secondNumber + " is " + theBiggestNumber;

    }

    public String findSmallestNumber(){
        Scanner scanner = new Scanner(System.in);
        //this is where we ask the user for input
        System.out.println("give me the first number please ");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        //this is where we ask the user for input
        System.out.println("give me the second number please ");
        //this is where we capture that input and store it in a variable called secondNumber
        int secondNumber = scanner2.nextInt();

        int findSmallestNumber = Math.min(firstNumber, secondNumber);

        return "the Smallest number between " + firstNumber + " and " + secondNumber + " is " + findSmallestNumber;



    }

    public int findTheDifferenceBetweenTwoNumber(){

        Scanner scanner = new Scanner(System.in);
        //this is where we ask the user for input
        System.out.println("give me the first number please ");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = scanner.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        //this is where we ask the user for input
        System.out.println("give me the second number please ");
        //this is where we capture that input and store it in a variable called secondNumber
        int secondNumber = scanner3.nextInt();

        return Math.abs(firstNumber - secondNumber);




    }

    public String convertToUppercase(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("provide a word to convert to all UPPERCASE: ");
        String theWord = scanner.nextLine();

        return "You provided, " + theWord + " and we converted to " + theWord.toUpperCase();



    }

    public String convertToLowercase(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("provide a word to convert all LOWERCASE: ");
        String theWord = scanner.nextLine();

        return "You provided, " + theWord + " and we converted to " + theWord.toLowerCase();
    }

    public String lengthOfWord(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a word: ");
        String wordLength = scanner.nextLine();

        return "You provided, " + wordLength + " and the length is " + wordLength.length();
    }



}
