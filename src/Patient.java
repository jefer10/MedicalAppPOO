public class Patient extends User{
    //atributos
    /**
     * descripcion: atributos de la clase Patient
     */
    static int id;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name,String email){
        super(name,email);
    }

    @Override
    public String toString() {
        return "Patient"+super.getId()+"{" +"name="+super.getName()+
                ", email="+super.getEmail()+
                ", address="+super.getAddress()+
                ", numberPhone="+super.getPhoneNumbers()+
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
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
}
