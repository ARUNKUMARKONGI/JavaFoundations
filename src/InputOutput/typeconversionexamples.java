package InputOutput;

public class typeconversionexamples {
    public static void main(String[] args) {
        //Assign text "300" to String variable
        char ch = '1';
        String a="300";
        //Assign text "200" to String variable
        String b="200";
        //Add variable value a and b and assign to c
        String c=a+b;
        //print variable c
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(a);
        System.out.println("Variable x value :"+x);
        System.out.println("Variable x value :"+x);
        System.out.println("Variable c Value :"+c);
        System.out.println(x+y);

        int sum=10;
        sum = sum + Character.getNumericValue(ch);
        //sum = sum+ Integer.parseInt(String.valueOf(ch));
        System.out.println(sum);


       //accessing char from string
        String myStr = "Hello";
        char result = myStr.charAt(0);
        int res = myStr.charAt(0);
        System.out.println(res);

      //converting char to String
        String str="griet";
        String str2 = "" + ch;
        String str3= str+str2;
        System.out.println(str3);
    }

}
