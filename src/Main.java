
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double percentage = scan.nextDouble();
        int backlogs = scan.nextInt();
        int graduationYear = scan.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Percentage: " + candidate.getPercentage());
        System.out.println("Backlogs: " + candidate.getBacklogs());
        System.out.println("Graduation Year: " + candidate.getGraduationYear());

        scan.close();

    }
}
