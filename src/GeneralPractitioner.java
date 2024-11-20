public class GeneralPractitioner extends HealthProfessional {

    /**
     * level
     */
    private String level;
    /**
     * A default constructor
     */
    public GeneralPractitioner() {
    }

    /**
     * A constructor with parameters
     */
    public GeneralPractitioner(long id, String name, String age, String level) {
        super(id, name, age);
        this.level = level;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Level: " + level);
    }

    @Override
    public String toString() {
        return "GeneralPractitioner{" + "Level='" + level + '\'' + ", id="
                + super.getId() + ", name='"
                + super.getName() + '\''
                + ", age='" + super.getAge() + '\'' + '}';
    }
}
