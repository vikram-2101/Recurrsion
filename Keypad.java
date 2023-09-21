public class Keypad {
    public static String[] keypad = {"." , "abc" , "def" , " ghi", "jkl", "mno" , "pqrs" , "tu" , "wx" , "yz"};
    public static void printcombo(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar= str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0; i<str.length(); i++) {
            printcombo(str, idx+1, combination+mapping.charAt(i));
    }
}
public static void main(String[] args) {
    String str = "4";
    printcombo(str, 0, "");
}
}