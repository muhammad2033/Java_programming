class base{
    int id ;
    String name ;
    base (int i, String n){ // method is predefined
        id = i;       //this constructor
        name = n;
    }
    public void displied(){
        System.out.println("display the given:"+id+"  "+name);
    }
}
 class derived extends base{
    int id;
    String name;

        public derived(int i , String n){
            id = i;
            name = n;    
        
        }
        void display(){
            System.out.println("id is :"+id+"name is:"+ name);
        }


public static void main(String[] args){
    derived b = new derived(22 ,  "maaz");
    b.displied();

} 
}