public class changing_argument{

class adder{
    static int add(int a ,int b)
    {
        return a + b;
    }
    static int add(int a , int b , int c)
    {
        return a+b+c;
    }
}
class overloading{
    public static void main(String[] args){
        System.out.println(adder.add(12,88));

        System.out.println(adder.add(12,88,99));
    } 
} 
}