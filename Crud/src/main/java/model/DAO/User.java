package model.DAO;

public class User {
    private String name_user;
    private String date_of_birth;
    private String email_user;
    private String cep_user;

    public User(String name_user, String date_of_birth, String email_user, String cep_user) {
        this.name_user = name_user;
        this.date_of_birth = date_of_birth;
        this.email_user = email_user;
        this.cep_user = cep_user;
    }

    public String getName_user() {
        return name_user;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getEmail_user() {
        return email_user;
    }

    public String getCep_user() {
        return cep_user;
    }
    /*================================*/

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public void setCep_user(String cep_user) {
        this.cep_user = cep_user;
    }
}
