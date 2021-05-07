public class Droid{
  String name;
  int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;

  }



   public String toString(){
     return "Hello, I’m the droid: " + name;
   }




    public void performTask(String task){
      batteryLevel -= 10;
      System.out.println(name + " is performing task: " + task + "\nAnd His Current Battery Level: " + batteryLevel);
      
    }
 



 public static void main(String[] args){
   Droid Codey = new Droid("Codey");
   System.out.println(Codey);
   Codey.performTask("Dance");
   Codey.performTask("Doing Dishes");
   Codey.performTask("Watching Tv");

 }

}
