import java.util.Scanner;

class BasicCalculator {
    public double operator;
    public double num1;
    public double num2;

    public void menu() {
        System.out.println("Choose Operator:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            addNum();
        } else if (opt == 2) {
            subtractNum();
        } else if (opt == 3) {
            multiplyNum();
        } else if (opt == 4) {
            divisionNum();
        } else if (opt == 5) {
            System.out.println("End the operation....");
            System.exit(0);
        } else {
            System.out.println("Enter a valid choice");
            menu();
        }
    }

    public void addNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num:");
        num1 = sc.nextDouble();
        System.out.println("Enter your second num:");
        num2 = sc.nextDouble();
        operator = num1 + num2;
        System.out.println("Operation: " + operator);
        menu();
    }

    public void addNum(double num1, double num2) {
        operator = num1 + num2;
        System.out.println("Operation: " + operator);
        menu();
    }

    public void subtractNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num:");
        num1 = sc.nextDouble();
        System.out.println("Enter your second num:");
        num2 = sc.nextDouble();
        operator = num1 - num2;
        System.out.println("Operation: " + operator);
        menu();
    }

    public void multiplyNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num:");
        num1 = sc.nextDouble();
        System.out.println("Enter your second num:");
        num2 = sc.nextDouble();
        operator = num1 * num2;
        System.out.println("Operation: " + operator);
        menu();
    }

    public void divisionNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num:");
        num1 = sc.nextDouble();
        System.out.println("Enter your second num:");
        num2 = sc.nextDouble();

        if (num2 != 0) {
            operator = num1 / num2;
            System.out.println("Operation: " + operator);
        } else {
            System.out.println("Cannot divide");
        }
        menu();
    }
}

class System1 extends BasicCalculator {
    System1() {
        System.out.println("Welcome to calculator System");
    }

    
    public void menu() {
        System.out.println("-----------------------");
        super.menu();
         
    }
}

public class Calculator {
    public static void main(String[] args) {
        System1 obj = new System1();
        obj.menu();
    }
}
