import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to be found");
        int b=sc.nextInt();
        int flag=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                System.out.println("Element "+ b +" Found in position: "+ i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
