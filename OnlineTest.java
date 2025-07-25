
public class OnlineTest {

    public static void main(String[] args) {
        String questionType = "MCQ";
        String selectedOption = null;
        int testCasesPassed = 3;
        int totalTestCases = 5;
        int wordCount = 120;
        int minLimit = 150;

        switch (questionType) {
            case "MCQ":
                if (selectedOption != null) {
                    System.out.println("Submit.");
                } else {
                    System.out.println("Choose an option.");
                }
                break;

            case "Code":
                if (testCasesPassed == totalTestCases) {
                    System.out.println("Auto-submit.");
                } else {
                    System.out.println("Show feedback.");
                }
                break;

            case "Essay":
                if (wordCount >= minLimit) {
                    System.out.println("Submit allowed.");
                } else {
                    System.out.println("Write more.");
                }
                break;

            default:
                System.out.println("Invalid question type.");
        }
    }
}