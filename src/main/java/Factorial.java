import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger fibonacci (int n, BigInteger answer) {
        if(n == 1) {
            return answer;
        }
        answer = answer.multiply(BigInteger.valueOf(n));
        n--;
        return fibonacci(n,answer);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger answer = new BigInteger("1");
        answer = fibonacci(n,answer);
        System.out.println(answer);

    }
}
