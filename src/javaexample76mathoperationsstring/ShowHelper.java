package javaexample76mathoperationsstring;

public class ShowHelper {

    public static void Show(String s1, String s2) {
        Showing(s1, s2);
    }
    private static void Showing(String s1, String s2)
    {
        int check=Difference(s1, s2);

        if(check<0)
        {
            Showing(s2, s1);
            return;
        }
        else 
        {
            System.out.println(FirstLine(s1, 3));
            System.out.println(SecondLine(s2, check));
            System.out.println(Dashes(s1.length()));
            String res=StringMathOperationsHelper.Add(s1, s2);
            int resDiff=Difference(res, s1);
            if(resDiff==0)
            {
                System.out.println(FirstLine(res, 3));
                return;
            }
            else
            {
                System.out.println(FirstLine(res, 2));
                return;
            }
        }
    }
    
    private static String Dashes(int count)
    {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < count+3; i++) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
    
    private static String SecondLine(String s, int diff)
    {
        diff=Math.abs(diff);
        StringBuilder whites=new StringBuilder(s);
        for (int i = 0; i < diff+2; i++) {
            whites.insert(0, " ");
        }
        whites.insert(0, "+");
        return whites.toString();
    }
    
    private static String FirstLine(String s, int a)
    {
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < a; i++) {
            sb.insert(0, " ");
        }
        return sb.toString();
    }
    
    private static int Difference(String s1, String s2)
    {
        int len1=s1.length();
        int len2=s2.length();
        
        return len1-len2;
    }
}
