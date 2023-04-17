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
            else
            throw new IllegalArgumentException();
        }


    public    boolean checkEmail(String email) {
        boolean result = false;
        if (email.contains("@")) {
            result = true;
            return result;
        } else{
            throw new IllegalArgumentException("Email должен содержать @");
        }

    }

    public    boolean checkCompereEmailAndLogin(String login,String email) {
        if (!email.equals(login)) {
            return true;
        }
        else
        throw new IllegalArgumentException("Email и Login должы отличаться");
    }

}
