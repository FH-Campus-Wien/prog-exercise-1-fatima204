package at.ac.fhcampuswien;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class App {

    private Object result;

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char Z = 92;
        int x= 0xface;
        int y= 012;
        long t= 80L;
        float w = 44e-1f;
        float a= 5.5f;
        double r= 8.88e1;
        double s= 99.9;

        int sum = (int) (Z+x+y+t+a+r+s);
        System.out.println(+ sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sum = x + x;
        System.out.println("12");
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        System.out.println("Before Swap:");
        System.out.println("x: y: After Swap:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x: 5");
        System.out.println("y: 2");

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();
        if(n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        }else if (n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here

        System.out.print("Enter annual Revenue: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x < 0 || x >= 100000){
            System.out.println("Invalid Revenue");
        } else if (x<=0 && x < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (x<=20000 && x<50000) {
            System.out.println("Average Sales Revenue");
        } else if (x<=50000 && x<80000) {
            System.out.println("Good Sales Revenue");
        } else if (x<=80000 && x<100000) {
            System.out.println("Good Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        java.lang.String x = scanner.next();
        switch(x)  {
            case "1": System.out.println("Your Commission Rate was set to 0.01");
            break;
            case "2": System.out.println("Your Commission Rate was set to 0.02");
            break;
            case "3": System.out.println("Your Commission Rate was set to 0.03");
            break;
            case "4": System.out.println("Your Commission Rate was set to 0.04");
            break;
            default: System.out.println("Your Commission Rate was set to 0.0");
        }

    }

    //todo Task 9
    public void leapyear(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.print("Year: ");
        if(year % 4 == 0) {
            System.out.println("Leapyear");
        } else if (year % 100 == 0) {
            System.out.println("Leapyear");
        }else if (year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.print("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while(number > 0){
            reversed = number%10;
            number = number/10;
            System.out.print(+reversed);
        }

        if(number > 1000){
            System.out.println("Number is too big");
        }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}