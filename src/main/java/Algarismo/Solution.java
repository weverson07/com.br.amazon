package Algarismo;
import java.util.*;

class Solution {

    public static String convert(String n) {
        if (n.matches("\\d+")) {
            return intToRoman(Integer.parseInt(n));
        } else {
            return String.valueOf(romanToInt(n));
        }
    }

    private static String intToRoman(int num) {
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values     = {1000, 900, 500, 400, 100, 90,  50,  40,  10,   9,   5,   4,    1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(romans[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(convert("1000"));   // Esperado: M
        System.out.println(convert("4"));      // Esperado: IV
        System.out.println(convert("1"));      // Esperado: I
        System.out.println(convert("MCMXC"));  // Esperado: 1990
    }
}
