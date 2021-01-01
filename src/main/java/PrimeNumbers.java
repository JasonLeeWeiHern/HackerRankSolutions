import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.ceil;

public class PrimeNumbers {

    public static boolean isPrimeNumber (int n) {
        if(n == 1 || n == 0) {
            return false;
        } else {
            int m = n/2;
            for(int i = 2; i < m; i++) {
                if(n%i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static ArrayList<Integer> countPrime (int firstNumber, int secondNumber) {
        if(firstNumber == 1 || firstNumber == 0) {
            firstNumber = 2;
        }
        if(secondNumber == 1 || secondNumber == 0) {
            return null;
        }
        int numOfNumbers = secondNumber - firstNumber + 1;
        int halfFirstNum = (int) Math.floor(firstNumber/2);
        int halfSecondNum = (int) Math.ceil(secondNumber/2);
        ArrayList<Integer> arr = new ArrayList<>();
        int countPrime = 0;
        for(int i = firstNumber; i <= secondNumber; i++) {
            boolean isPrime = true;
            for(int j = halfFirstNum; j <= halfSecondNum; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                countPrime++;
            }
        }
        System.out.println(countPrime); //number of prime
        return arr;
    }

    public static void main(String[] args) throws IOException {
//        PrimeNumbers pm = new PrimeNumbers();
//        if(pm.isPrimeNumber(29) == false) {
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");;
//        }

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println(countPrime(firstNum,secondNum));


    }

}
