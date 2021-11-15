package javaexample76mathoperationsstring;

public class StringMathOperationsHelper {

    public static String Add(String str1, String str2) {
        return Adding(str1, str2);
    }
    
    private static String Adding(String n, String m) {

        if (!ChooseLongestString(n, m)) {
            return Adding(m, n);
        }

        // n is the longest string
        StringBuilder accumulator = new StringBuilder();
        int carry = 0;
        int sum;
        int[] temp = new int[2];

        int j = n.length() - 1; // index -counter for longest string
        for (int i = m.length() - 1; i >= 0; i--) {

            temp = AddChar2Char(n.charAt(j), m.charAt(i), carry);

            carry = temp[0];
            sum = temp[1];

            accumulator.insert(0, sum);

            j--;
        }

        // remember that you have a carry too!!!!
        for (int i = (n.length() - m.length() - 1); i >= 0; i--) {
            temp = AddChar2Char(n.charAt(i), carry);

            carry = temp[0];
            sum = temp[1];

            accumulator.insert(0, sum);
        }

        if (carry == 1) {
            accumulator.insert(0, 1);
        }

        return accumulator.toString();
    }

    private static int[] AddChar2Char(char a, int carryCell) throws IllegalArgumentException {
        if (carryCell < 0 || carryCell > 1) {
            throw new IllegalArgumentException();
        }

        return AddChar2Char(a, '0', carryCell);
    }

    private static int[] AddChar2Char(char a, char b, int carryCell) throws IllegalArgumentException {
        if (carryCell < 0 || carryCell > 1) {
            throw new IllegalArgumentException();
        }

        int na = a - 48;
        int nb = b - 48;

        int answer = carryCell + na + nb;

        int res = answer % 10;
        carryCell = answer / 10;

        int[] result = new int[]{carryCell, res};
        return result;
    }

    private static boolean ChooseLongestString(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return true;
        } else {
            return false;
        }
    }

}
