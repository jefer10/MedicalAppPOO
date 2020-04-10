public abstract class User {
    private static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumbers;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        id=id+1;
    }

    @Override
    public String toString() {
        return "User" + id+ '\''+"{"+
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                '}';
    }

    public abstract void showDataUser();

    //getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        if (this.phoneNumbers.length()==10){
            this.phoneNumbers = phoneNumbers;
        }else {
            System.out.println("el numero de celular no tiene la cantidad de digitos correctos");
        }
    }
}
