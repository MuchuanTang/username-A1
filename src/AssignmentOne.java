import java.util.ArrayList;
import java.util.List;

/**
 * github url : https://github.com/MuchuanTang/username-A1
 * video url :https://scuonline-my.sharepoint.com/:v:/g/personal/m_tang_27_student_scu_edu_au/EXatcV214jZPvCAffDztdYsBsFA1kQpu41cOaf0J_sVDtQ?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=jg0397
 */
public class AssignmentOne {

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        //department of gastroenterology
        GeneralPractitioner p1 =
                new GeneralPractitioner(1, "Emma", "56", "department of gastroenterology");
        //dermatology department
        GeneralPractitioner p2 =
                new GeneralPractitioner(2, "Esta", "23", "dermatology department");
        //internal medicine department
        GeneralPractitioner p3 =
                new GeneralPractitioner(3, "Fidelia", "34", "internal medicine department\n");

        // Surgery Department Thigh surgery
        OperationProfessional o1 =
                new OperationProfessional(1, "Harriet", "55", "ham");
        // Surgery Department Nose surgery
        OperationProfessional o2 =
                new OperationProfessional(2, "Barnett", "45", "nose");

        // print the appointment information
        p1.print();
        p2.print();
        p3.print();

        // print  the appointment information
        o1.print();
        o2.print();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        List<Appointment> list = new ArrayList<>();

        Appointment appointment1 = new Appointment("Colin", "10086", "14:30", p1);
        createAppointment(list, appointment1);
        Appointment appointment2 = new Appointment("Geoffrey ", "10087", "12:00", p2);
        createAppointment(list, appointment2);

        Appointment appointment3 = new Appointment("Jeffrey ", "10088", "18:00", o1);
        createAppointment(list, appointment3);
        Appointment appointment4 = new Appointment("Jonathan ", "10089", "9:00", o2);
        createAppointment(list, appointment4);

        printExistingAppointments(list);

        cancelBooking(list, "10088");

        printExistingAppointments(list);
        System.out.println("------------------------------");
    }

    public static void createAppointment(List<Appointment> list, Appointment appointment) {
        list.add(appointment);
    }

    public static void printExistingAppointments(List<Appointment> list) {
        for (Appointment appointment : list) {
            appointment.print();
        }
    }

    public static void cancelBooking(List<Appointment> list, String phone) {
        for (Appointment appointment : list) {
            if (appointment.getPhone().equals(phone)) {
                list.remove(appointment);
                System.out.println("appointment cancel of number: " + phone);
                return;
            }
        }
        System.out.println("no appointment found of number: " + phone);
    }

}
