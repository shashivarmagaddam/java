public class RaviFare{
public static void main(String[]args){
int distance=75;
boolean isWeekDay=true;
if(distance==50){
System.out.println(" The fare is: ₹ 50 ");
}
else if(distance>50 && distance<=100){
System.out.println(" The fare is: ₹ 100 ");
}
else if(distance>100 && isWeekDay==true){
System.out.println(" The fare is: ₹ 200 ");
}
else if(distance>100 && isWeekDay==false){
System.out.println(" The fare is: ₹ 300 ");
}
else{
System.out.println(" Enter valid range");
}
}
}
