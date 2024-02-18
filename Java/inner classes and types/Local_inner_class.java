class test{
    int salary = 3000;
        void display(){
            class inner2{
                void display2(){
                    System.out.println("the salary for local:"+salary);}
            }
                    inner2 obj2 = new inner2();
                obj2.display2();
            
            }         
                 
        
    public static void main(String[] args){
    test obj = new test();
    obj.display();
    
    }
    }

    
    
