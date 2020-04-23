// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.Scanner;
class Laptop{
   String brandName;
   String processorName;
   String os;
   long processorRange;
   long ram;
  public Laptop(String brandName,String processorName,String os,long processorRange,long ram){
    this.brandName=brandName;
      this.processorName=processorName;
       this.os=os;
       this.processorRange=processorRange;
       this.ram=ram;
  }
  public void displayLaptopDetails(){
    System.out.println("Laptop Details");
    System.out.println("Laptop Brand: "+brandName);
    System.out.println("Processor Name: "+processorName);
    System.out.println("OS: "+os);
    System.out.println("Processor Range: "+processorRange+" bit");
    System.out.println("Ram: "+ram+" GB");
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   String brandName=sc.nextLine();
   String processorName=sc.nextLine();
   String os=sc.nextLine();
   long processorRange=sc.nextLong();
   long ram=sc.nextLong();
      Laptop buy=new Laptop(brandName,processorName,os,processorRange,ram);
      if((ram>0) && (processorRange>0)){
        buy.displayLaptopDetails();
  }
      else{
        System.out.println("Invalid Input");
      }
}}