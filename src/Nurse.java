public class Nurse extends User{
    private String Speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    //getter y setter
    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
