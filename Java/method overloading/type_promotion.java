class adder {
    void sum (int a , int b){
        System.out.println(a+b);
    }
    void sum(int a , int b , int c)
    {
    System.out.println(a+b+c);
    }
}
class calculation{
    public static void main(String[] args){
        adder obj = new adder();
        obj.sum(22,22);
        obj.sum (33,44,55);
    }
}