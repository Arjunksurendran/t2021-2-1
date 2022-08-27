import java.util.Scanner;

class Program1 {
  public static void main(String[] args) {

    char operator;
    double a, b, result;
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("Enter first number");
    a = sc.nextDouble();
    System.out.println("Enter second number");
    b = sc.nextDouble();
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    switch (operator) {
      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;

      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;

      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;

      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    
  }
}