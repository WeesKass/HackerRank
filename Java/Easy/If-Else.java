import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (number%2 == 0 && ( (number<5 && number>2) || number>20)){

            System.out.println("Not Weird");

        }else{
            System.out.println("Weird");
        }
        input.close();
    }
}

