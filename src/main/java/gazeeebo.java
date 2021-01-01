import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.math.BigInteger;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.util.concurrent.TimeUnit.DAYS;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class gazeeebo {


   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int size = in.nextInt();

        int [][] arr = new int[size][size];

        //Initialising the Matrix
        for(int l = 0; l < size; l++) {
            for (int j = 0; j < size; j++) {
                int number = in.nextInt();
                arr[l][j] = number;
            }
        }


       int [][] newArr = new int[size][size];

       for(int i = 0; i < size; i++) { //columns
           int k = 0;
           for(int j = size-1; j >= 0; j--) { //rows
               newArr[i][k] = arr[j][i];
               k++;
           }
           k++;
       }

       for(int l = 0; l < size; l++) {
           for (int j = 0; j < size; j++) {
               System.out.print(newArr[l][j]);
           }
           System.out.println("");
       }*/

        int size = in.nextInt();
        int count = 1; //all vertical
        int maxPutInCol = 1;
        int maxPutInRow = (size / 2); //max num Of horizontal in a row

        if(size % 2 == 0) {
            count++; //all horizontal
        }
        else {
            count += (size+1) / 2; //1 vertical the rest horizontal
        }


       System.out.println(count);


   }
}
