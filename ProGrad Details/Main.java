// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.Scanner;

class ProGrad{
  String name;
  long id;
  String skills;
   ProGrad(String name, long id, String skills){
    this.name=name;
    this.id=id;
    this.skills=skills;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    long id=sc.nextLong();
    sc.nextLine();
    String skills=sc.nextLine();
    ProGrad student=new ProGrad(name,id,skills);
    if((name.matches("^[ a-zA-Z]*$")) && (id>0)){
      System.out.println("ProGrad Details");
      System.out.println("ProGrad Name: " +name);
      System.out.println("Id: " +id);
      System.out.println("Skill: "+skills);
  }
    else{
      System.out.println("Invalid Input");
}
}
}
