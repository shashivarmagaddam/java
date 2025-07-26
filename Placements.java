public class Placements {
    public static void main(String[] args) {
        double cgpa = 6.7;
        int attendance = 85;
        boolean nobacklogs = true;
        int maxbacklogs = 1;
        if(cgpa >= 7 && attendance >=75 && nobacklogs){
            System.out.println("eligible for placements");
        }else if(cgpa >=6.5 && attendance >=80 && maxbacklogs  <=1){
            System.out.println("eligible for tier 2 companies only");
        }else{
            System.out.println("not eligible for placements");
        }
    }
}