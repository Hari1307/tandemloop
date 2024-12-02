import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        System.out.println(patternGeneration(num));
    }

    public static List<Integer> patternGeneration(int x){
        List<Integer> list = new ArrayList<>();
        int oddNumbers = (x % 2 == 0) ? x - 1 : x;
        for (int i = 0; i < oddNumbers; i++) {
            list.add(2 * i + 1);
        }
        return list;
    }
}
