/Move all x positions to the end
public class Move {
    public static void moveall(String str, int idx,int count, String newString) {
        if(idx == str.length()) {
        System.out.println(newString);
        return; }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            moveall(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveall(str, idx+1, count, newString);
    }
    }
    public static void main(String[] args) {
        String str = "xxyyx";
        moveall(str, 0, 0, "");
    }
}
