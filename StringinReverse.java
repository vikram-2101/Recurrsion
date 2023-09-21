 // reverse sequence
public class StringinReverse {
    public static void reverse(int idx, String str) {
        if (idx==0) {
           System.out.print(str.charAt(idx));
           return;
        }
        System.out.print(str.charAt(idx));
        reverse(idx-1, str);
    }
    public static void main(String[] args) {
      
        String str = "abcdef";
        reverse(str.length()-1, str);
    }
}
