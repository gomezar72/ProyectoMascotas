package wolfbits.user;

public class User {

    private String name;
    private String surname;
    private String nickname;// el nickname se usar para el login 
    private String email;
    private String password;        //
    private String phone;
    private int petCapacity;///
    private int userType;
    private Address address;

    public User() {
    }

    public User(String alias, String email, String phone, int petCapacity) {
        this.nickname = alias;
        this.email = email;
        this.phone = phone;
        this.petCapacity = petCapacity;
        this.userType = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPetCapacity() {
        return petCapacity;
    }

    public void setPetCapacity(int petCapacity) {
        this.petCapacity = petCapacity;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserType() {
        return this.userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void asignarRoles() {

    }

}
