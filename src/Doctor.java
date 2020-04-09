import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    //constructor
    Doctor(String name,String email){
        super(name,email);
        System.out.println("el nombre del dosctor es: "+super.getName());
    }

    //Comportamientos o metodos
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
