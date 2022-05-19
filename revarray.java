import java.util.*;
public class revarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s;
        s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        for(int i=s-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
