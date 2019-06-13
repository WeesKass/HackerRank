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
        int answer;

        for (int counter = 1; counter <=10; counter++){
            answer = number*counter;
            System.out.printf("%s x %s = %s%n", number, counter, answer);
        }
    }
}

