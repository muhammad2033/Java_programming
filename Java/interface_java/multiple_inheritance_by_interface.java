public class multiple_inheritance_by_interface {
    interface printable {
        void print();
    }
    interface showable{
        void show();
    
    }
    class A7 implements printable,showable{
        public void print(){
            System.out.println("yes, its printed!");

        }
        public void show(){
            System.out.println("yes, its showed !");


        }
    }
    public static void main(String[] args){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
