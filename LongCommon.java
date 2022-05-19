import java.util.*;
public class LongCommon {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextLine();
            if(i==n-1){
                s[i] = sc.nextLine();
            }
        }
        System.out.println(s[0]);
    }
}
