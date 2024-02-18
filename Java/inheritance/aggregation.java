class emp{
        String name;
        int id ;
        int salary;

        public emp(String name , int id, int salary){
            this.name= name ;
            this.id= id ;
            this.salary= salary ;
        }
        void display(){
            System.out.println("the name of emp is :"+name);
            System.out.println("the id of emp is :"+id);
            System.out.println("the salary of emp is :"+salary);
        }
    }

class address {
  String city;    
  String state;    
  String country;
  
public address(String city,String state,String country ){
    this.city = city;
    this.state = state;
    this.country = country;
  }
  public void display(){
    System.out.println("the city name is :"+city);
    System.out.println("the state name is :"+state);
    System.out.println("the country name is :"+country);
  }

  public static void main(String[] args){
    
    emp e1 = new emp("muhammad maaz", 2033, 230000);
    emp e2 = new emp("muhamma saad", 2044, 33333);
    
    e1.display();
    e2.display();

    address s1 = new address("new york", "california", "america");
    address s2 = new address("new york", "california", "america");
    s1.display();
    s2.display();
  }
}

