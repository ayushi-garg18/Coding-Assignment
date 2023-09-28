// Enter Roman Number as input and convert it to integer. (ex IX = 9)

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int result = romanToInteger(roman);
        System.out.println("Integer equivalent: " + result);
    }

    
    public static int romanToInteger(String roman) {
        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = getRomanValue(currentChar);
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }


    public static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
    }
}