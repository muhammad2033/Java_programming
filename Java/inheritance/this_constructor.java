class base{

    int id ;
    String name ;
    base (int id, String name){ // method is predefined
        this.id = id;       //this constructor
        this.name = name;
    }
    public void display(){
        System.out.println("display the given:"+id+"  "+name);
    }
    


public static void main(String[] args){
    base b = new base(22 ,  "maaz");
    b.display();

} 
}