import ui.UIMenu;
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor=new Doctor("pepito perez","pediatria");
        myDoctor.name="pepito perez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(myDoctor.id);

        Doctor doctor1=new Doctor();
        doctor1.name="sutanejo";
        doctor1.showName();
        doctor1.showId();
        System.out.println(doctor1.id);

        showMenu();
    }
}
