    abstract class person{
        abstract void print();
    }
    class testAnonymousInner{
        public static void main (String[] args){
            person per = new person(){
                void eat(){
                    System.out.println("run the program of anonymous !");}
                };
                per.print();
                }
            }


