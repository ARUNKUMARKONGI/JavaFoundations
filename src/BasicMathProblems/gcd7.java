package BasicMathProblems;

public class gcd7 {
    public static void main(String[] args) {
        int n1=6;
        int n2=4;
        int gcd=findgcd(n1,n2);
        System.out.println("GCD of "+n1+" and "+n2+" is: "+gcd);
    }
    public static int findgcd(int n1,int n2)
    {
        if(n2==0){
            return n1;
        }
        else{
            return findgcd(n2, n1%n2);
        }
    }
}
//(O(log(min(a,b)))