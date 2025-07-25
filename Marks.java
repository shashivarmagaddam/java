class Marks{
public static void main(String[]args){
 int m1=45;
 int m2=84;
 int m3=42;
 int m4=59;
 int m5=84;
 int marks=((m1+m2+m3+m4+m5)/5);
 if(marks>=90){
  System.out.println("Outstanding");
   }
 else if(marks>=75){
  System.out.println("Distinction");
  }
 else if(marks>=60){
  System.out.println("First class");
  }
 else if(marks>=35){
  System.out.println("Passed");
  }
 else{
  System.out.println("Failed");
  }
 }
}