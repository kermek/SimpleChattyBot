// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int i = 0;
        double sum = 0.0 + m;
        while (sum < k) {
            sum = sum * (1 + p / 100.0);
            i++;
        }
        System.out.println(i);
    }
}
