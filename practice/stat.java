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
public class stat{
    int a;
    float b;
    stat(){
        a=10;
        b=(float)5.5;
    }
    public static void main(String[] args) {
        stat obj=new stat();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}