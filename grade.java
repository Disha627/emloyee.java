import java.util.*;

class Grader {
    private int score;  
    
    public Grader(int score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score >= 90 && score <= 100) {
            return "O";  // Outstanding
        } else if (score >= 80 && score < 90) {
            return "E";  // Excellent
        } else if (score >= 70 && score < 80) {
            return "A";  // Good
        } else if (score >= 60 && score < 70) {
            return "B";  // Above Average
        } else if (score >= 50 && score < 60) {
            return "C";  // Average
        } else {
            return "F";  // Fail
        }
    }
}

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the score (0-100): ");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            Grader grader = new Grader(score);
            System.out.println("The letter grade is: " + grader.letterGrade());
        }
        else {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        }
    }
}