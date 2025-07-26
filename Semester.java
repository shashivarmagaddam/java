public class Semester {
    public static void main(String[] args) {
        int semester = 5;
        String department = "ME"; 
        int credits = 22;
        boolean internshipDone = false;

        switch (semester) {
            case 1, 2:
                System.out.println("Basic Science Subjects");
                break;

            case 3,4:
                if (department.equals("CS")) {
                    System.out.println("Subjects: Data Structures, DBMS");
                } else if (department.equals("ME")) {
                    System.out.println("Subjects: Thermodynamics, Fluid Mechanics");
                } else {
                    System.out.println("Department not recognized.");
                }
                break;

            case 5,6:
                if (credits > 20) {
                    System.out.println("Include electives along with core subjects.");
                } else {
                    System.out.println("Focus on core subjects.");
                }
                break;

                case 7,8 :
                if (internshipDone) {
                    System.out.println("You can start final year projects.");
                } else {
                    System.out.println("Reminder: Complete your internship.");
                }
                break;

            default:
                System.out.println("Invalid semester.");
        }
    }
}