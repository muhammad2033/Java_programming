class cat{
    int age = 27;
    class pat{
        void msg(){System.out.println(" the age is :"+age); }
        class inner{
            void msg2(){
                System.out.println("the age for msg2:"+age);
            }
        }
    }
    public static void main(String[] args){
        cat obj = new cat();
        cat.pat pat = obj.new pat();
        pat.inner in = pat.new inner();
        pat.msg();
        in.msg2();
    }
}
