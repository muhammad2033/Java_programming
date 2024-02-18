interface drawable{
    
    void draw();
}
// implementaion : by a second user 
class rantangle implements drawable{
    public void draw(){
        System.out.println("drawing ractangle!");
    }
}
class circle implements drawable {
    public void draw (){

        System.out.println("drawable circle!");
    }
}
// using interface : by third user
class testiterface1{
    public static void main(String[] args){
    drawable d = new circle();
    d.draw();
    }
}