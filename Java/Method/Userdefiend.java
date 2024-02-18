// import java.util.*;
// public class Userdefiend {
//     public static void evenNum(int num, int num2){
//         int sum = num+num2;
//         if (sum%2==0){
//             System.out.println(sum+" is an even number");
//         }
//         else{
//             System.out.println(sum+ " is a odd number");

//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         int num2 = sc.nextInt();
//         evenNum(num, num2);  // method call
//     }
// }

class num{
    int num1;
    int num2 ;
     static void sum(int a , int b){ // function 
        int sum = a+b;
        System.out.println("the sum of the given variables are:"+sum);

        if(sum%2==0){
            System.out.println(sum+" is an even number:");
        
        }
        else{
            System.out.println(sum+" is a odd number:");


        }
    }
    public static void main(String[] args){
        num obj = new num();  // object is created here
        obj.num1= 23;
        System.out.println("num1 is :"+obj.num1);
        obj.num2= 25;
        System.out.println("num2 is :"+obj.num2);

        obj.sum(10, 16);

    }
}