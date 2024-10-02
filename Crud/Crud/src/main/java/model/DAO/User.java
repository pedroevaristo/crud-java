package model.DAO;

public class User {
    //private int id_user = 0;
    private String name_user;
    private int date_of_birth;
    private String email_user;
    private String cep_user;
    private String address_user;
    private String complement_address;

    public User(String name_user, int date_of_birth, String email_user, String cep_user, String address_user, String complement_address) {

        this.name_user = name_user;
        this.date_of_birth = date_of_birth;
        this.email_user = email_user;
        this.cep_user = cep_user;
        this.address_user = address_user;
        this.complement_address = complement_address;
    }



    public String getName_user() {
        return name_user;
    }

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public String getEmail_user() {
        return email_user;
    }

    public String getCep_user() {
        return cep_user;
    }

    public String getAddress_user() {
        return address_user;
    }

    public String getComplement_address() {
        return complement_address;
    }


    /*================================*/

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public void setCep_user(String cep_user) {
        this.cep_user = cep_user;
    }

    public User setAddress_user(String address_user) {
        this.address_user = address_user;
        return this;
    }

    public User setComplement_address(String complement_address) {
        this.complement_address = complement_address;
        return this;
    }


}
