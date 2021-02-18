final class FinalClass {
      public void display() {
        System.out.println("This is a final method.");
      }
    

 

  //  try to extend the final class
    class FinalDemo extends  FinalClass {
     public  void display() {
       System.out.println("The final method is overridden."); 
      }

 

      public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
      }
    }