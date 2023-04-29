import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        int mx=10000;
         boolean[] sq=new boolean[mx+5];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i*i<=mx;i++){
            sq[i*i]=true;
        }
        int n=sc.nextInt();
        boolean ok=true;
        while(n-->0){
            int a=sc.nextInt();
            ok&=sq[a];
        }
        System.out.println(ok? "No":"Yes");
        
    }
}