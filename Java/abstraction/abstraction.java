// concept of abstraction

abstract class shape{
    String color ;

    // these aere abstract methods 
    abstract double area();
    public abstract String tostring();

    // abstract class can have the constructor 
    public  shape(String color ){
        System.out.println("shape constructor called");
        this.color= color ; 

    }
    // this is a concrete method 
    public String getcolor () {
        return color;

    }
    class circle extends shape{
        double radius ;

        public circle(String color, double length, double width  )
        {
            // calling shape constructor 
            super(color );
            System.out.println("circle  constructor called ");
            this.radius  = radius ; 
        } 
    }
}