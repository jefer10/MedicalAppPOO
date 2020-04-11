package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    //atributos
    /**
     * descripcion: atributos de la clase model.Patient
     */
    static int id;
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private ArrayList<AppointmentDoctor>appointmentDoctors=new ArrayList<>();
    private ArrayList<AppointmentNurse>appointmentNurses=new ArrayList<>();


    public Patient(String name,String email){
        super(name,email);
    }

    @Override
    public String toString() {
        return "model.Patient"+super.getId()+"{" +"name="+super.getName()+
                ", email="+super.getEmail()+
                ", address="+super.getAddress()+
                ", numberPhone="+super.getPhoneNumbers()+
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("paciente:" + super.getId());
        System.out.println("historia del paciente");
    }

    //getter y setter
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight+"Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height+"Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor=new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }
}
