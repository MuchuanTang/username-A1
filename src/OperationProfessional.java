public class OperationProfessional extends HealthProfessional {

    /**
     * surgical spot
     */
    private String surgicalSpot;

    /**
     * A default constructor
     */
    public OperationProfessional() {

    }

    /**
     * A constructor with parameters
     */
    public OperationProfessional(long id, String name, String age, String surgicalSpot) {
        super(id, name, age);
        this.surgicalSpot = surgicalSpot;
    }

    /**
     * Print the appointment information
     */
    @Override
    public void print() {
        super.print();
        System.out.println("OperationProfessional: " + surgicalSpot);
    }

    @Override
    public String toString() {
        return "PsychologicalProfessional{" +
                "assessmentContent='" + surgicalSpot + '\'' +
                ", id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                '}';
    }
}
