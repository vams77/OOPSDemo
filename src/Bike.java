class Bike{
 final int SPEED_LIMIT=90;//final variable
 void run(){
  //speedlimit=400;
	 System.out.println("the speed limit is : " +SPEED_LIMIT);
 }
 public static void main(String args[]){
 Bike obj=new  Bike();
 obj.run();
 }
}