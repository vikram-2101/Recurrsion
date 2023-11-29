public class Reverse {
    public static void main(String[] args) {
      rev1(7864);
      
       System.out.print(sum);
    }

    static int sum = 0;

    static void  rev1(int n) {
        if (n == 0)
            return ;
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
        
    }
    
    static int  rev2(int n) {
      // sometimes we need addtional variable in the arguement
      // In that case make another function
      int digits=(int)(Math.log10(n)) +1;
      return helper(n, digits);

    }
    static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
          int rem = n%10;
          return rem + (int)(Math.pow(10,digits-1)) +helper(n/10,digits);
    }

}