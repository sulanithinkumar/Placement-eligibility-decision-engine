
class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;

    Candidate(
            String name,
            double percentage,
            int backlogs,
            int graduationYear
    ) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
    }

    String getName() {
        return name;
    }

    double getPercentage() {
        return percentage;
    }

    int getBacklogs() {
        return backlogs;
    }

    int getGraduationYear() {
        return graduationYear;
    }

}
