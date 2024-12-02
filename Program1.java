import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        Double a = scanner.nextDouble();

        System.out.println("Enter Second Number : ");
        Double b = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter any of the operation => + , - , * , / : ");
        String operator = scanner.nextLine();

        try {
            Double Result = Calculator(a,b,operator);
            System.out.println(Result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Double Calculator(Double a , Double b, String operation){
        switch (operation){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b != 0){
                    return a/b;
                }else{
                    throw new IllegalArgumentException("Infinity exception");
                }
            default:
                throw new IllegalArgumentException("Invalid operation : "+ operation);
        }
    }
}