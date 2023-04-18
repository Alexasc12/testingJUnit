package org.example;

public class User {
    private String login;
    private String email;

    public  User(String login, String email) {
        getInstance( login, email);
      }



    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
    public User() {
    }








    public   User getInstance(String login,String email) {
        if (!checkCompereEmailAndLogin(login,email ) && !checkEmail(email)) {
            throw new IllegalArgumentException( "Данные введены не коректно");
        }
        else if(login == null && email == null)
            throw new NullPointerException();
        User user = new User();
        this.login = login;
        this.email = email;
            return user ;
    }


    public    boolean checkEmail(String email) {
        if (email.contains("@")) {
            return false;
        } else{
            return true;
        }

    }

    public    boolean checkCompereEmailAndLogin(String login,String email) {
        if (!email.equals(login)) {
            return true;
        }
        else return false;
    }

}
