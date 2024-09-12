public class Recursion {
    public static void printNumber(int n){
        if(n == 0){
         return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void creatNumber(int x){
        if(x == 6){
            return;
        }
        System.out.println(x);
        creatNumber(x+1);
    }
    public static void printSum(int i,int n,int sum) {
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
        System.out.println(i);
        
    }
    public static int calculateFactorial(int y) {
       if(y == 1 || y == 0){
        return 1;
       }
       int fact_nm1= calculateFactorial(y-1);
       int fact_n = y * fact_nm1;
       return fact_n;
    }
    public static void fibonacciNum(int a,int b,int w){
       if(w == 0){
        return;
       }
       int c=a+b;
       System.out.println(c);
       fibonacciNum(b, c, w-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n);
        int x=1;
        creatNumber(x);
        printSum(1,5,0); 
        int y = 5;
        int ans = calculateFactorial(y);
        System.out.println(ans);
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int w=7;
        fibonacciNum(a,b,w-2);
    }
}

