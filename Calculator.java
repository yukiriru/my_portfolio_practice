import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator(); // Calculator 객체 생성

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자 (+, -, , /)를 입력하세요: ");
        char operator = scanner.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean valid = true;

        try {
            switch (operator) {
                case '+':
                    result = calc.add(num1, num2);
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    break;
                case '':
                    result = calc.multiply(num1, num2);
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
                    valid = false;
            }

            if (valid) {
                System.out.printf("결과: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
            }

        } catch (ArithmeticException e) {
            System.out.println("오류: " + e.getMessage());
        }

        scanner.close();
    }
}
import java.util.Scanner;
class Calculator {

    // 덧셈
    public double add(double a, double b) {
        return a + b;
    }

    // 뺄셈
    public double subtract(double a, double b) {
        return a - b;
    }

    // 곱셈
    public double multiply(double a, double b) {
        return a * b;
    }

    // 나눗셈 (0으로 나눌 경우 예외 처리)
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}

public class CalculatorMain{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator(); // Calculator 객체 생성

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자 (+, -, , /)를 입력하세요: ");
        char operator = scanner.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean valid = true;

        try {
            switch (operator) {
                case '+':
                    result = calc.add(num1, num2);
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    break;
                case '':
                    result = calc.multiply(num1, num2);
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
                    valid = false;
            }

            if (valid) {
                System.out.printf("결과: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
            }

        } catch (ArithmeticException e) {
            System.out.println("오류: " + e.getMessage());
        }

        scanner.close();
    }
}