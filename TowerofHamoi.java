ffpublic class TowerofHamoi {
    
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if( n==1 ) {
            System.out.println("transfer disk to " +  n  + " from " + src + " to " + dest);
            return;
        }
    towerofHanoi(n-1, src, helper, dest);
    System.out.println("transfer to " + n + " from " + src + " to " + dest);
    towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
    int n=3;
    towerofHanoi(n, "S", "H" , "D");
    }
}
// time complexity 2^n-1 = 2^n
