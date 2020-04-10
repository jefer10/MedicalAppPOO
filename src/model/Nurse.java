package model;

public class Nurse extends User{
    private String Speciality;

    public Nurse(String name, String email) {

        super(name, email);
    }

    /**
     * descripcion:es un metodo abstracto de la clase model.User.
     */
    @Override
    public void showDataUser() {
        System.out.println("hospital: infantil");
        System.out.println("cardiologia");
        System.out.println("departamento: cuidados intensivos y cardiologia");
    }

    //getter y setter
    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
