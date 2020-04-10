import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor=new Doctor("pepito perez","pepito@gmail.doctor.co");
        //System.out.println(myDoctor.getId()+" "+myDoctor.getName());
        myDoctor.addAvalibleAppointment(new Date(),"5pm");
        myDoctor.addAvalibleAppointment(new Date(),"10am");
        myDoctor.addAvalibleAppointment(new Date(),"1pm");
        System.out.println(myDoctor);//en java no se necesita poner "myDoctor.toString()"

        Patient patient1=new Patient("juanito alimaña","juanito@gmail.co");
        //System.out.println(patient1.getId()+" "+patient1.getName());
        //System.out.println(patient1.toString());

        //showMenu();
    }
}
