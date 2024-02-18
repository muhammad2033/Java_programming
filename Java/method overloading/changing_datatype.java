public class changing_datatype {
    class adder{
        static int add(int a , int b )
        {
            return a +  b;

        }
        static double add(int a , float b , double c)
        {
            return a + b + c;
        } 
    }
    class overloading{
        public static void main (String[] args)
        {
            System.out.println(adder.add(33,99));

            System.out.println(adder.add(33,99.0,88.9));

        }
    }
    
}
