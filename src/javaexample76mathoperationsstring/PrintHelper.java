
package javaexample76mathoperationsstring;


public class PrintHelper {
    
    
    public static void PrintResult(String str1, String str2) {
        Print(str1, str2);
    }
    
    private static void Print(String a, String b) {
        String res = StringMathOperationsHelper.Add(a, b);

        if (a.length() == b.length()) {
            System.out.println("   " + a);
            System.out.println("+  " + b);
            DashLine(a.length());
            if(res.length()== a.length())
                System.out.println("   "+res);
            else
                System.out.println("  "+res);
        }
        
        else if (a.length() > b.length()) {
            System.out.println("  " + a);
            System.out.println("+  " + b);
            DashLine(a.length());
            if(res.length()== a.length())
                System.out.println("  "+res);
            else
                System.out.println(" "+res);
        }
        else
            Print(b, a);
    }

    private static void DashLine(int a) {
        for (int i = 0; i < a + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
