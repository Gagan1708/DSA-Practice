import java.util.*;
public class maxsubarray {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s;
        s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        if(a.length == 1){
            System.out.println(a[0]);
        }
        else{
            int max = a[0];
            int maxtr = 0;
            for(int i=1;i<s;i++){
                maxtr = maxtr + a[i];
                if(max<maxtr){
                    max = maxtr;
                }
                if(maxtr < 0){
                    maxtr = 0;
                }
            }
            System.out.println(max);
        }
    }
}
