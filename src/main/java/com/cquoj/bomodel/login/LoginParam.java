package com.cquoj.bomodel.login;

/**
 * Created by xuwei on 5/5/16.
 */
public class LoginParam {
    private String username;
    private String password;
    private int cksave;
    private String login;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCksave() {
        return cksave;
    }

    public void setCksave(int cksave) {
        this.cksave = cksave;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
