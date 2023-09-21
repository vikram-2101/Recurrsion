import java.util.*;
public class practice {
    int simply(int n) {
    //     if (n<=0)
    // return 0;
    // return simply(simply(n-1)-2);
    // }
    if(n==0)
    return 1;
    return simply(n-1)*n;
    }
}
