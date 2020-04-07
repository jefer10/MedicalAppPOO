import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id=0;
    private String name;
    private String email;
    private String speciality;


    //constructor
    Doctor(){
        System.out.println("contruyendo el objeto");
        id++;
    }
    Doctor(String name,String speciality){
        System.out.println("el nombre del dosctor es: "+this.name);
        id++;
        this.name=name;
        this.speciality=speciality;
    }

    //Comportamientos
    /**
     * Descripcion: la funcion solo imprime el nombre del doctor
     */
    public void  showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("numero de identificador: "+id);
    }

    //getter y setter
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Descripcion:es una coleccion de objetos de tipo AvalaibleAppointment.
     */
    ArrayList<AvailableAppointment>availableAppointments=new ArrayList<>();

    /**
     * Descripcion:es un metodo para la adicion de las citas, se adiciona(.add) la nueva cita a una variable de tipo
     * coleccion de objetos "AvaliableAppointment" usando el constructor de la clase anidada "AvalibleAppointment"
     * @param date la fecha de la cita
     * @param time la hora de la cita
     */
    public void addAvalibleAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    /**
     * Descripcion:es el metodo geter del la lista de citas
     * @return retorna la lista de citas. (tipo coleccion)
     */
    public ArrayList<AvailableAppointment>getAvailableAppointments(){
        return availableAppointments;
    }

    //avalibleAppointment
    /**
     * descripcion: clase para el registro de citas del doctor.(clase anidada estatica)
     */
    public static class AvailableAppointment{

        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date,String time){
            this.date=date;
            this.time=time;
        }
    }




}
