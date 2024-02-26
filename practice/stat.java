// public class stat{
//     int a=10;
//     static void display(){
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         stat obj=new stat();
//         obj.display();
//     }
// }
// cannot access non static variable in static method
//write a program to initialize the instance variable with the help of constructor
// public class stat{
//     int a;
//     float b;
//     stat(){
//         a=10;
//         b=(float)5.5;
//     }
//     public static void main(String[] args) {
//         stat obj=new stat();
//         System.out.println(obj.a);
//         System.out.println(obj.b);
//     }
// }
import java.util.*;
public class stat{
    float lenght,breadth;
    stat(float lenght,float breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    public float getArea(){
        return lenght*breadth;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float length,breadth;
        System.out.println("Enter the lenght and breadth: ");
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        stat obj=new stat(length,breadth);
        System.out.println(obj.getArea());
        sc.close();
    }
}