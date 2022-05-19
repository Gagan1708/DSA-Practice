import java.util.*;
class minmax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s;
        s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int i=1;i<s;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}