package lexicon.exercise;

import lexicon.exercise.exception.InsufficientBalanceException;
import lexicon.exercise.exception.NumberNotInRange;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static void main() throws InsufficientBalanceException {

        exercise1();
        exercise2();
        exercise3();

    }

    //Exercise 1: Basic Exception Handling
    static void exercise1(){
        System.out.println("==== Exercise 1 ====");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        try {
            double divide = input1 / input2;
            System.out.println("Division : " + divide);
        }catch (ArithmeticException e){
            System.out.println("Cannot be divisible by 0  "+ e);
        }
    }

    //Exercise 2: Multiple Exception Types
    static void exercise2(){
        System.out.println("==== Exercise 2 ====");
        int input1 = scanner.nextInt();
        try {
            if(input1 <= 100 && input1 >= 1){
                System.out.println("The input within the range : " + input1);
            }else{
                throw new NumberNotInRange("The Input Number is not in range!");
            }
        }catch (InputMismatchException | NumberNotInRange e){
            System.out.println("Input is not valid " + input1 + " " + e);
        }
    }

    //Exercise 3: Custom Exception
    static void exercise3() throws InsufficientBalanceException {
        System.out.println("==== Exercise 3 ====");
    }
}
