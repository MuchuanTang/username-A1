/**
 * HealthProfessional: base class
 */
public class HealthProfessional {

    /**
     * id
     */
    private long id;
    /**
     * name
     */
    private String name;
    /**
     * age
     */
    private String age;
    /**
     * A default constructor
     */
    public HealthProfessional() {
    }

    /**
     * A constructor with parameters
     * @param id
     * @param name
     * @param age
     */
    public HealthProfessional(long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Print the  appointment information
     */
    public void print() {
        System.out.println("HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String phone) {
        this.age = age;
    }
}
