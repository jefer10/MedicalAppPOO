package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    //constructor
    public Doctor(String name,String email){
        super(name,email);
        System.out.println("el nombre del dosctor es: "+super.getName());
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

        public Date getDate() {
            return date;
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
