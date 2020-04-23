// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.Scanner;
class Dog{
  String name;
  float weight;
  int age;
  String color;
  String breed;
  Dog(String name,float weight,int age,String color,String breed){
    this.name=name;
    this.weight=weight;
    this.age=age;
    this.color=color;
    this.breed=breed;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    float weight=sc.nextFloat();
    int age=sc.nextInt();
    sc.nextLine();
    String color=sc.nextLine();
    String breed=sc.nextLine();
    Dog bowbow=new Dog(name,weight,age,color,breed);
    if((name.matches("^[ a-zA-Z]*$")) && (age>0) && (weight>0)){
    System.out.println("Name of the dog: " +name);
     System.out.println("Weight of the dog: " +weight); 
       System.out.println("Age of the dog: " +age);
      System.out.println("Color of the dog: " +color);
       System.out.println("Breed of the dog: " +breed);
    }
    else{
      System.out.println("Invalid Input");
    }
  }
}