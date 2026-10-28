
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter your percentage: ");
        double percentage = scan.nextDouble();
        System.out.println("Enter backlogs: ");
        int backlogs = scan.nextInt();
        System.out.println("Enter graduation year: ");
        int graduationYear = scan.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required graduation year: " + job.getRequiredGraduationYear());

        scan.close();

    }
}
