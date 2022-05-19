import java.util.*;
public class chocolate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(a);
        int diff=0;
        int min =Integer.MAX_VALUE;
        for(int i=0;i+m-1<s;i++){
            diff = a[i+m-1]-a[i];
            if(diff<min){
                min = diff;
            }
        }
        System.out.println(min);
    }
}