
class Job {

    private String company;
    private String role;
    private double minimunPercentage;
    private int maximumbacklogs;
    private int requiredGraduationYear;

    Job(
            String company,
            String role,
            double minimunPercentage,
            int maximumbacklogs,
            int requiredGraduationYear
    ) {
        this.company = company;
        this.role = role;
        this.minimunPercentage = minimunPercentage;
        this.maximumbacklogs = maximumbacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    String getCompany() {
        return company;
    }

    String getRole() {
        return role;
    }

    double getMinimumPercentage() {
        return minimunPercentage;
    }

    int getMaximumBacklogs() {
        return maximumbacklogs;
    }

    int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }
}
