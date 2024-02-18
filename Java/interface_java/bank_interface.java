public class bank_interface {
    interface bank{
        float rateofInterest();
    }
    class SBI implements bank{
        public float rateofInterest(){
            return 9.15f;
        }
    }
    class PNB implements bank{
        public float rateofInterest(){
            return 11.11f;
        }
    }
    class testiterface2{
        public static void main(String[] args){
        bank b = new PNB();
        System.out.println("ROI:"+ b.rateofInterest());
        
    }
    }
}
