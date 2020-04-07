public class Patient {
    //atributos
    /**
     * descripcion: atributos de la clase Patient
     */
    static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public void Patient(String name,String email){
        this.name=name;
        this.email=email;
    }

    //getter y setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length()==10){
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("el numero de celular no tiene la cantidad de digitos correctos");
        }
    }

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
