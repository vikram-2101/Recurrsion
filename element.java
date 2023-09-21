public class element{
    public static int first=-1, last=1;
    public static void findOccurrences(String str, int idx , char element ) {
        if (idx == str.length()) { 
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            }
          else {  last = idx;
    }
        } 

     findOccurrences(str, idx+1, element);
    }
    public static void main(String[] args) {
       
        String str ="abaacdaefaa";
       
        findOccurrences(str, 0 , 'a');
    }
}