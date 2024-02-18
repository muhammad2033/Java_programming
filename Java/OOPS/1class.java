import javax.sound.sampled.SourceDataLine;

// class cat{
//     // states mean colour, name, prize etc
//     int prize ;
//     String name;  //here we can initialize the variables with values

//     // moving towards behaviour, 
//     public void eating (){
//         System.out.println("its been eating a piece of a chicken:");

//     }

//         public static void main(String[] args){

//         cat cat1 = new cat();

//         cat1.prize= 1000;
//         System.out.println("the prize is :"+cat1.prize);
//         cat1.name= "daisy";
//         System.out.println("the name is :"+cat1.name);

//         cat1.eating();   //fnt call
//     }
//     }

// class student{
//     int rollno;
//     String name;

//     public void record(int rollno , String name){
//         System.out.println(rollno+name);
        
//     }
    

// public static void main(String[] args){
//     student sd1 = new student();
//     sd1.rollno=1000;
//     System.out.println("the rollno is :"+sd1.rollno);


//     sd1.name = "muhammad maaz";
//     System.out.println("the name is :"+sd1.name);

//     sd1.record(2000,"muhammad ssad");
//     // sd1.display();
// }
// }

class teacher{
    int salary;
    int hours;
    int teacher_id ;    //states, attributes
    String name ;
    String course;
    String behaviour;
    String subject[] =new String [4];  //array
    String book_name[]= new String [4];

    public void course_content(String course   ){     // behaviour
        System.out.println("the course is :"+course);

    }
    public void teaching_method(String name){
        System.out.println(name +" is an excellent teacher, his method is exquisite " );
    }

    public void behaviour(String behaviour){
        System.out.println(behaviour);
    }
public static void main(String[] args){

 teacher obj1 = new teacher(); // for one object
 teacher obj2 = new teacher();

 obj1.salary = 20000;
 System.out.println("the salary is taken per week:"+obj1.salary+"\n");

 obj1.hours = 5;
 System.out.println("the hours is  per day:"+obj1.hours+"\n");

 obj1.teacher_id= 2033;
 System.out.println("the teacher_id is :"+obj1.teacher_id+"\n");

 obj1.name = "ghazi_jan";
 System.out.println("the name is given to our teacher is :"+obj1.name+"\n");
 obj1.behaviour="dont need to talk about his ettiquete.it is really extraordinary";
 
 obj1.course ="chapter 1 to chapter 10 . chapter 1 bases on the basic and chapter 10 bases on  the practicle."; 
 obj1.subject[0]= "data structure";
 obj1.subject[1]= "database management system";
 obj1.subject[2]= "theory of automata";
 obj1.subject[3]= "MATLAB";

 System.out.println("first  subject name is :"+obj1.subject[0]+"\n");
 System.out.println("second subject name is :"+obj1.subject[1]+"\n");
 System.out.println("third  subject name is :"+obj1.subject[2]+"\n");
 System.out.println("fourth subject name is :"+obj1.subject[3]+"\n");

 obj1.book_name[0] ="data structure 7th edition ";
 obj1.book_name[1] ="database 4th edition ";
 obj1.book_name[2] ="theory of automata  7th edition ";
 obj1.book_name[3] ="MATLAB 5th edition ";

 System.out.println("the book name of our subject:" +obj1.subject[0]+" is , "+obj1.book_name[0]+"\n");
 System.out.println("the book name of our subject:" +obj1.subject[1]+" is , "+obj1.book_name[1]+"\n");
 System.out.println("the book name of our subject:" +obj1.subject[2]+" is , "+obj1.book_name[2]+"\n");
 System.out.println("the book name of our subject:" +obj1.subject[3]+" is , "+obj1.book_name[3]+"\n");




 obj1.course_content(obj1.course+"\n");
 obj1.teaching_method(obj1.name);
 obj1.behaviour(obj1.behaviour);


 
 obj2.salary = 50000;
 System.out.println("the salary is taken per week:"+obj2.salary+"\n");

 obj2.hours = 6;
 System.out.println("the hours is  per day:"+obj2.hours+"\n");

 obj2.teacher_id= 1245;
 System.out.println("the teacher_id is :"+obj2.teacher_id+"\n");

 obj2.name = "IkramULLAH";
 System.out.println("the name is given to our teacher is :"+obj2.name+"\n");
 obj2.behaviour="dont need to talk about his ettiquete.it is really extraordinary";
 
 obj2.course ="chapter 1 to chapter 10 . chapter 1 bases on the basic and chapter 10 bases on  the practicle."; 
 obj2.subject[0]= "Operating system";
 obj2.subject[1]= "Artificial intelligence";
 obj2.subject[2]= "Java";
 obj2.subject[3]= "C++";

 System.out.println("first  subject name is :"+obj2.subject[0]+"\n");
 System.out.println("second subject name is :"+obj2.subject[1]+"\n");
 System.out.println("third  subject name is :"+obj2.subject[2]+"\n");
 System.out.println("fourth subject name is :"+obj2.subject[3]+"\n");

 obj2.book_name[0] ="Operating system 7th edition ";
 obj2.book_name[1] ="AI by IKramULLAH 4th edition ";
 obj2.book_name[2] ="Java   8th edition ";
 obj2.book_name[3] =" C++ by Roburn 5th edition ";

 System.out.println("the book name of our subject:" +obj2.subject[0]+" is , "+obj2.book_name[0]+"\n");
 System.out.println("the book name of our subject:" +obj2.subject[1]+" is , "+obj2.book_name[1]+"\n");
 System.out.println("the book name of our subject:" +obj2.subject[2]+" is , "+obj2.book_name[2]+"\n");
 System.out.println("the book name of our subject:" +obj2.subject[3]+" is , "+obj2.book_name[3]+"\n");




 obj2.course_content(obj2.course+"\n");   // function call for obj2
 obj2.teaching_method(obj2.name+"\n");
 obj2.behaviour(obj2.behaviour+"\n");
}
 
}