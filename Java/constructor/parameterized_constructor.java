class  student {
    int id;
    String name;
    student(int i , String n ){
        name = n;
        id = i;

    }
    void display(){
        System.out.println("display the gievn varibales");
        System.out.println(name+ " "+id);

    }


    public static void main (String[] args){
        student s1 = new student(122, "maaz");
        student s2 = new student(1224, "khan");
        s1.display();
        s2.display();
        
    }
}