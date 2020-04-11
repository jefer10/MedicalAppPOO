package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    //constructor
    public Doctor(String name,String email){
        super(name,email);
        //System.out.println("el nombre del doctor es: "+super.getName());
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital infantil");
        System.out.println("Departamento: cancerologia");
    }
    //Comportamientos o metodos

    /**
     * Descripcion:hace que el objeto "doctor" muestre todos sus atributos y
     * que llame el metodo "toString()" de la clase anidada "AvailableAppointment"
     * para mostrar todos los datos del objeto "doctor"
     * @return Datos del objeto doctor en "String"
     */
    @Override
    public String toString() {
        return "model.Doctor{" +super.toString()+
                "speciality='" + speciality + '\'' +
                ", availableAppointments=" + availableAppointments.toString() +
                '}';
    }

    //get y seter
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
    public void addAvalibleAppointment(String date, String time){
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
        SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date,String time){
            try {
                this.date=format.parse(date);//para usar la funcion parse de la clase formato se necesita el try-catch
            }catch (ParseException e){
                e.printStackTrace();
            }
            this.time=time;
        }
        //metodos


        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "id=" + id +
                    ", date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }

        //getter y setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String Date) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
