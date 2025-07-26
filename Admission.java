
public class Admission{
public static void main(String[]args){
int percentage=88;
boolean sportsCertificate =true;
int  familyIncome = 180000;
boolean volunteerExperience =false;
if(percentage >= 90 && sportsCertificate == true && familyIncome <= 200000){
System.out.println("Full Scholorship");
}
else if(percentage >= 85 && (sportsCertificate == true || volunteerExperience == true)){
System.out.println("Partial scholarship");
}
else{
System.out.println("No scholarship.");
}
}
}