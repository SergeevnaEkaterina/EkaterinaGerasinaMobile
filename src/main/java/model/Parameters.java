package model;

public class Parameters {
    private String email;
    private String userName;
    private String password;
    private String url;
    private String keyWord;

    public Parameters(String email, String userName, String password, String url, String keyWord) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.url = url;
        this.keyWord = keyWord;
    }

    public String getUrl() {
        return url;
    }

    public String getKeyWord() {
        return keyWord;
    }


    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
