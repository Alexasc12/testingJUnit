package org.example;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        if(login == null && email == null)
                throw new NullPointerException();
        else getInstance( email, login);
        this.login = login;
        this.email = email;
    }



    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
    public User() {
          }

//    public class MyClass {
//        private int i;
//        private MyClass(int i) {
//            this.i=i;
//        }
    public   boolean getInstance(String login,String email) {
            if (checkCompereEmailAndLogin(login,email ) && checkEmail(email)) {
                return true;
            }
            throw new IllegalArgumentException();
        }


    private   boolean checkEmail(String email) {
        if (email.contains("@")) {
            return true;
        }
        throw new IllegalArgumentException("Email должен содержать @") ;
    }

    private   boolean checkCompereEmailAndLogin(String login,String email) {
        if (!email.equals(login)) {
            return true;
        }
        throw new IllegalArgumentException("Email и Login должы отличаться");
    }

}
