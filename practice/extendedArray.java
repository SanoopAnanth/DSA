import java.util.*;
public class extendedArray{
    public static int[] extendArrr(int []arr){
        int temp[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position where you need to add element");
        int position=sc.nextInt();
        System.out.println("Enter the element");
        int ele=sc.nextInt();
        a=extendArrr(a);
        for(int i=a.length-1;i>position-1;i--){
            a[i]=a[i-1];
        }
        a[position-1]=ele;
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
